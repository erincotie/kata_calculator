package org.example;

public class Calculator {

    public String add(String entrada){
        if (entrada.isEmpty()) return "0";
        if(entrada.startsWith("//")){
            String separador = String.valueOf(entrada.charAt(2));
            return getString(entrada.substring(3), separador);
        }
        else return getString(entrada, ",");
    }

    private static String getString(String entrada, String separador) {
        try {
            String[] numeros= getSplit(entrada, separador);
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

    private static String[] getSplit(String entrada, String separador) {
        return entrada.split(separador);
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
