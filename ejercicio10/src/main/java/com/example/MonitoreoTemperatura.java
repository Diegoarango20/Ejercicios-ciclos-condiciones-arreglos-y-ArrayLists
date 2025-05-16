package com.example;

import java.util.Scanner;

public class MonitoreoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[12];

        
        System.out.println("Ingrese las temperaturas de las 12 horas del día:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura de la hora " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble(); 
        }

        int sobre35 = 0, debajo20 = 0;

        for (double temp : temperaturas) {
            if (temp > 35) {
                sobre35++; 
            } else if (temp < 20) {
                debajo20++; 
            }
        }

        // Mostrar los resultados

        System.out.println("\nMonitoreo de temperatura:");
        System.out.println("La temperatura superó los 35°C en " + sobre35 + " ocasiones.");
        System.out.println("La temperatura estuvo por debajo de 20°C en " + debajo20 + " ocasiones.");

        sc.close();
    }
}