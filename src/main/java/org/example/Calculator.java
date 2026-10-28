package org.example;

public class Calculator {

    public String add(String entrada){
        if (entrada.isEmpty()) return "0";
        try {
            Integer.parseInt(entrada);
            return entrada;
        } catch (NumberFormatException e) {
            return "";
        }
    }
}
