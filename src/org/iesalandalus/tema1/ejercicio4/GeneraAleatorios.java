package org.iesalandalus.tema1.ejercicio4;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.io.*;

public class GeneraAleatorios {

    public static void main(String[] args){

        try {

            // Preparamos el proceso hijo
            ProcessBuilder pb = new ProcessBuilder("java", "org.iesalandalus.tema1.ejercicio4.Aleatorios");
            pb.directory(new File("out/production/ComunicacionProcesosConParametros"));
            Process proceso = pb.start();

            PrintWriter escritorHijo = new PrintWriter(proceso.getOutputStream(), true);

            BufferedReader lectorHijo = new BufferedReader(new InputStreamReader(proceso.getInputStream()));

            String texto = "";

            while (!texto.equalsIgnoreCase("fin")) {
                texto = Entrada.cadena();

                if (texto != null && !texto.isEmpty()) {
                    escritorHijo.println(texto);
                }

                if (!texto.equalsIgnoreCase("fin")) {
                    System.out.println(lectorHijo.readLine());
                }
            }

            escritorHijo.close();
            lectorHijo.close();
            proceso.destroy();

        } catch (IOException e) {
            System.out.println("Error en el proceso padre: " + e.getMessage());
        }

    }

}
