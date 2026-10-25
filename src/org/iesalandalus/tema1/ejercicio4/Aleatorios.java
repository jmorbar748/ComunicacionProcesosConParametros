package org.iesalandalus.tema1.ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aleatorios {

public static void main(String[] args){

    try {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String peticion;

        while ((peticion = br.readLine()) != null) {
            int numeroAleatorio = (int) (Math.random() * 11);
            System.out.println(numeroAleatorio);
        }
    } catch (IOException e) {
        System.out.println("Error de E/S en el proceso hijo: " + e.getMessage());
    }
    }
}
