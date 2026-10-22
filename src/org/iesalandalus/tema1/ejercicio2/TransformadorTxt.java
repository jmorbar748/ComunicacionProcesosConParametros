package org.iesalandalus.tema1.ejercicio2;

import org.iesalandalus.programacion.utilidades.Entrada;

public class TransformadorTxt {

    public static void main(String[] args){
        // variable bandera para controlar cuándo termina el bucle
        boolean terminado = false;

        // Bucle principal que lee mientras no se reciba la palabra (fin)
            while (!terminado) {
                String mensajeTexto = Entrada.cadena();

                // Comprobamos si la entrada ha finalizado (null) o si el texto es (fin)
                if (mensajeTexto == null || mensajeTexto.toLowerCase().equals("fin")) {
                    terminado = true;
                } else {
                    // Transformamos el texto a mayúsculas
                    String mensajeTextoMayuscula = mensajeTexto.toUpperCase();
                    //  Imprimimos el resultado por la salida estándar
                    System.out.println(mensajeTextoMayuscula);
                }
            }
    }

}
