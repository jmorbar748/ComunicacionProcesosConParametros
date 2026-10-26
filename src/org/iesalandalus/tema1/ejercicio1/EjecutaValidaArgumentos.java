package org.iesalandalus.tema1.ejercicio1;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.io.File;
import java.io.IOException;

public class EjecutaValidaArgumentos {

    public static void main(String[] args){

        try {

            System.out.println("Introduce algo:" );
            String dato = Entrada.cadena();

            // Creamos el ProcessBuilder para el hijo
            ProcessBuilder pb = new ProcessBuilder("java", "org.iesalandalus.tema1.ejercicio1.ValidaArgumentos");

            // Si el usuario a escrito algo se lo pasamos como argumento al hijo
            if (dato != null && !dato.isEmpty()) {
                pb.command().add(dato);
            }

            pb.directory(new File("out/production/ComunicacionProcesosConParametros"));

            pb.inheritIO();

            // Lanzamos el proceso
            Process proceso = pb.start();

            int valorSalida = proceso.waitFor();

            System.out.println("Valor de salida: " + valorSalida);

            switch (valorSalida) {

                case 1 -> System.out.println("No hay argumentos...");
                case 2 -> System.out.println("Es una cadena...");
                case 3 -> System.out.println("Número menor que 0...");
                case 4 -> System.out.println("Número mayor o igual que 0...");
                default -> System.out.println("Código de salida desconocido...");

            }

        } catch (IOException e) {
            System.out.println("No se pudo iniciar el proceso " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Se interrumpió la espera: "+ e.getMessage());
        }

    }

}
