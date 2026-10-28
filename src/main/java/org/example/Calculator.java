package org.example;

public class Calculator {

    public String add(String entrada){
        if (entrada.isEmpty()) return "0";

        try {
            String[] numeros= entrada.split(",");
            float suma = 0;
            for (String numero : numeros) {
                suma += Float.parseFloat(numero);
            }
            if (suma == (int) suma) {
                return String.valueOf((int) suma);
            }
            return String.valueOf(suma);
        } catch (Exception e) {
            return "";
        }
    }
}
