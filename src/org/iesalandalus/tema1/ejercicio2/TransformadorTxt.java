package org.iesalandalus.tema1.ejercicio2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransformadorTxt {

    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("Error en el proceso hijo: " + e.getMessage());
        }
    }

}
