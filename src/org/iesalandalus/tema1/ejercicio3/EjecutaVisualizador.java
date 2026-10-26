package org.iesalandalus.tema1.ejercicio3;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.io.File;
import java.io.IOException;

public class EjecutaVisualizador {

    public static void main(String[] args){

        try {

            System.out.print("Introduce una  cadena: ");
            String cadena = Entrada.cadena();

            // Preparamos el proceso hijo
            ProcessBuilder pb = new ProcessBuilder("java", "org.iesalandalus.tema1.ejercicio3.Visualizador");

            // Le pasamos los argumentos
            pb.command().add(cadena);
            pb.command().add("5");

            // Establecemos el directorio de trabajo
            pb.directory(new File("out/production/ComunicacionProcesosConParametros"));

            // Queremos ver lo que imprime el hijo directamente en nuestra consola
            pb.inheritIO();

            // Lanzamos el proceso
            Process proceso = pb.start();

            // Esperamos a que termine y recogemos su código de salida
            int valorSalida = proceso.waitFor();

            // Mostramos los mensaje según su valor devuelto
            System.out.println("Valor de salida: " + valorSalida);

            if (valorSalida == 0) {
                System.out.println("Final Correcto");
            } else {
                System.out.println("Final incorrecto");
            }

        } catch (IOException e) {
            System.out.println("Error al iniciar el proceso: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Se interrumpió la espera: " + e.getMessage());
        }
    }
}
