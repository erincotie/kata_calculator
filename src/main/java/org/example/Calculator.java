package org.example;

public class Calculator {

    public String add(String entrada){
        if (entrada.isEmpty()) return "0";

        try {
            String[] numeros= entrada.split(",");
            int suma = 0;
            for (String numero : numeros) {
                suma += Integer.parseInt(numero);
            }
            return String.valueOf(suma);
        } catch (NumberFormatException e) {
            return "";
        }
    }
}
