package com.AlgIIProyecto2Grupo7;

import java.util.Scanner;

public class Validaciones {
    
    public static String validarNumero(String cambiar, Scanner sc) {
        System.out.println("cargando");
        sc.nextLine();
        System.out.printf("Ingrese un numero para %s: \n", cambiar);
        String entrada = sc.nextLine();
        while (!entrada.matches("[0-9]+")) {
            System.out.println("Error, ingrese un numero");
            entrada = sc.nextLine();
        }
        return entrada;
    }
    /* 
    public static String validarNumero(String cambiar) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese un numero para %s: \n", cambiar);
        String entrada = sc.nextLine();
        while (!entrada.matches("[0-9]+")) {
            System.out.println("Error, ingrese un numero");
            entrada = sc.nextLine();
        }
        sc.close();
        return entrada;
    }
    public static String validarNumero(String cambiar) {
        System.out.printf("Ingrese un numero para %s: \n", cambiar);
        String entrada;
        try (Scanner sc = new Scanner(System.in)) {
            entrada = sc.nextLine();
            while (!entrada.matches("[0-9]+")) {
                System.out.println("Error, ingrese un numero");
                entrada = sc.nextLine();
            }
        }
        return entrada;
    }
    */
}
