package com.example;

import java.util.Scanner;

public class TransportePublico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] horarios = { 7.00, 9.30, 12.00, 14.30, 17.00, 19.30 };

        // Pedir al usuario que ingrese la hora actual

        System.out.print("Ingrese la hora en la que tomara el bus (formato 24h, por ejemplo 7.00): ");
        double horaUsuario = sc.nextDouble();

        // Variable para almacenar el próximo bus disponible
        double proximoBus = -1;

        // Buscar el próximo bus disponible

        for (int i = 0; i < horarios.length; i++) {
            if (horarios[i] > horaUsuario) {
                proximoBus = horarios[i];
                break; 
            }
        }

        // Mostrar el resultado

        if (proximoBus == -1) {
            System.out.println("No hay más buses disponibles hoy.");
        } else {
            System.out.println("El próximo bus sale a las " + proximoBus + " horas.");
        }

        sc.close(); 
    }
}