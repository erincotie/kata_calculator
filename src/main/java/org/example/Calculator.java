package org.example;

public class Calculator {

    public String add(String entrada){
        if (entrada.isEmpty()) return "0";

        try {
            int num1 = Integer.parseInt(entrada.split(",")[0]);
            int num2 = Integer.parseInt(entrada.split(",")[1]);
            int suma = num1 +  num2;
            return String.valueOf(suma);
        } catch (NumberFormatException e) {
            return "";
        }
    }
}
