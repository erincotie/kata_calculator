package org.example;

public class Calculator {

    public String add(String entrada){
        if (entrada.isEmpty()) return "0";

        try {
            int num1 = getNumbersSeparate(entrada, 0);
            int num2 = getNumbersSeparate(entrada, 1);
            int suma = num1 +  num2;
            return String.valueOf(suma);
        } catch (NumberFormatException e) {
            return "";
        }
    }

    private static int getNumbersSeparate(String entrada, int pos) {
        return Integer.parseInt(entrada.split(",")[pos]);
    }
}
