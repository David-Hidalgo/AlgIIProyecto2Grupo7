package com.AlgIIProyecto2Grupo7;

import java.util.Scanner;

public class Validaciones {
    public static String validarNumero(String cambiar, Scanner sc) {
        System.out.printf("Ingrese un numero para %s: \n", cambiar);
        String entrada = sc.nextLine();
        while (!entrada.matches("[0-9]+")) {
            System.out.println("Error, ingrese un numero");
            entrada = sc.nextLine();
        }
        return entrada;
    }
}
