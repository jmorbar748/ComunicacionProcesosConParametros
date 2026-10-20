package org.iesalandalus.tema1.ejercicio1;

public class ValidaArgumentos {

    public static void main(String[] args){

        if (args.length < 1) {

            System.out.println("No hay argumentos...");
            System.exit(1);

        }

        try {

            int numero = Integer.parseInt(args[0]);

            if (numero < 0) {
                System.out.println("Número menor que 0...");
                System.exit(3);
            } else {
                System.out.println("Número mayor o igual que 0");
                System.exit(4);
            }

        } catch (NumberFormatException e) {

            System.out.println("Es una cadena...");
            System.exit(2);

        }

    }

}
