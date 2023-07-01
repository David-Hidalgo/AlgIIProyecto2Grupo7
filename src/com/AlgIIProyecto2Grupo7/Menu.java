package com.AlgIIProyecto2Grupo7;

import java.util.Scanner;

public class Menu{
    public static void menuGestionVehiculos() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Bienvenido a la gestión de vehículos");
            System.out.println("1. Crear vehículo");
            System.out.println("2. Listar vehículos");
            System.out.println("3. Buscar vehículo");
            System.out.println("4. Modificar vehículo");
            System.out.println("5. Eliminar vehículo");
            System.out.println("6. Salir");
            String opcionS=Validaciones.validarNumero("tu selección del menú", sc);
            opcion=Integer.parseInt(opcionS);

            switch (opcion) {
                case 1:
                
                break;
                
                case 2:
                
                break;
                
                case 3:
                
                break;
                
                case 4:
                
                break;
                
                case 5:
                
                
                break;
                
                case 6:
                System.out.println("Gracias por usar el programa");
                
                break;
                
                default: System.out.println("Error, ingrese un numero del 1 al 6");
                break;
            }
        } while (opcion != 6);
       sc.close(); 
    }
}
