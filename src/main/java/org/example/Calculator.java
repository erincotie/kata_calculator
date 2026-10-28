package org.example;

public class Calculator {

    public String add(String entrada){
        if (entrada.isEmpty()) return "0";

        try {
            String[] numeros= entrada.split(",");
            float suma = 0;
            suma = getSuma(numeros, suma);

            if (isInt(suma)) {
                return String.valueOf((int) suma);
            }
            return String.valueOf(suma);
        } catch (Exception e) {
            return "";
        }
    }

    private static boolean isInt(float suma) {
        return suma == (int) suma;
    }

    private static float getSuma(String[] numeros, float suma) {
        for (String numero : numeros) {
            suma += Float.parseFloat(numero);
        }
        return suma;
    }
}
