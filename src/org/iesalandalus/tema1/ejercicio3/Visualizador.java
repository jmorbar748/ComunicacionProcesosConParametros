package org.iesalandalus.tema1.ejercicio3;

public class Visualizador {

    public static void main(String[] args){

        // Comprobamos que llegan los dos argumentos necesarios
        if (args.length < 2) {
            System.out.println("Faltan argumentos.");
            System.exit(1); // Código de error por falta de argumentos
        }

        // Recogemos los argumentos
        String cadena = args[0];
        int numeroVeces = Integer.parseInt(args[1]);

        // Comprobamos que la cadena estavacia
        if (cadena.isEmpty() || cadena.equals("")) {
            System.out.println("Cadena introducida vacia");
            System.exit(1);
        } else {
            // Bucle para mostrarla las veces indicadas

            for (int i = 1; i <= numeroVeces; i++) {
                System.out.println(i + ". " + cadena);
            }
            // Finalizar correctamente
            System.exit(0);
        }

    }

}
