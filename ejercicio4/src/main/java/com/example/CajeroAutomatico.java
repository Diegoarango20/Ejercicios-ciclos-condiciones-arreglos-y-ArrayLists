package com.example;

import java.util.Scanner;

public class CajeroAutomatico  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] billetes = { 100000, 50000, 20000, 10000 };

        // Pedimos el monto al usuario
        System.out.print("Ingrese el monto que desea retirar: ");
        int monto = sc.nextInt();

        // Validar que sea múltiplo de 10.000
        if (monto % 10000 != 0) {
            System.out.println("Error: el monto debe ser múltiplo de 10.000 COP.");
        } else {
            System.out.println("El cajero entregará:");

            // Recorremos el arreglo de billetes
            for (int i = 0; i < billetes.length; i++) {
                int cantidad = monto / billetes[i]; // Calculamos cuántos billetes de esta denominación se necesitan
                if (cantidad > 0) {
                    System.out.println(cantidad + " billete(s) de " + billetes[i] + " COP");
                    monto = monto % billetes[i]; // Reducimos el monto restante
                }
            }

            if (monto == 0) {
                System.out.println("¡Retiro exitoso!");
            } else {
                System.out.println("No se pudo completar el retiro exacto con los billetes disponibles.");
            }
        }

        sc.close(); // Cerramos el scanner al final

    }
}