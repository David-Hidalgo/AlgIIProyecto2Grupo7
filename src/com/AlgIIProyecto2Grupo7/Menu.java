package com.AlgIIProyecto2Grupo7;

import java.util.Scanner;

public class Menu {
    public static void menuGestionVehiculos() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bienvenido a la gestión de vehículos");
            System.out.println("1. Crear vehículo");
            System.out.println("2. Modificar vehículo");
            System.out.println("3. Eliminar vehículo");
            System.out.println("4. Consultar vehículo");
            System.out.println("5. Listar vehículos");
            System.out.println("0. Salir\n");
            String opcionS = Validaciones.validarNumero("tu selección del menú", sc);
            opcion = Integer.parseInt(opcionS);
            switch (opcion) {
                case 1:
                    /*
                     * pedirDatosVehiculo(listaCompetidores);
                     * descargar_archivo3(*listaCompetidores);
                     */
                    break;
                case 2:
                    /*
                     * modificarVehiculo(listaCompetidores);
                     * descargar_archivo3(*listaCompetidores);
                     */
                    break;
                case 3:
                    /*
                     * eliminarVehiculo(listaCompetidores);
                     * descargar_archivo3(*listaCompetidores);
                     */
                    break;
                case 4:
                    // consultarVehiculo(*listaCompetidores);
                    break;
                case 5:
                    // muestra(*listaCompetidores);
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Error, ingrese un numero del 1 al 6");
                    break;
            }
        } while (opcion != 6);
        sc.close();
    }

    public static void MenuVelocidadVehiculo() {
        System.out.println("Ingrese la velocidad del vehiculo:");
        System.out.println("1.Perezoso");
        System.out.println("2.Crucero");
        System.out.println("3.SuperFerrari");
        System.out.println("4.Delorean");
        System.out.println("(el numero que esta al lado de su opcion)");
        System.out.print("Ingrese la opcion elegida:");
    }

    public static void menuTipoDeMonsterTruck() {
        System.out.println("Ingrese el tipo de Monster Truck:");
        System.out.println("1. Monster Truck 1");
        System.out.println("2. Monster Truck 2");
        System.out.println("3. Monster Truck 3");
        System.out.println("4. Monster Truck 4");
        System.out.println("5. Monster Truck 5");
        System.out.println("(el numero que esta al lado de su opcion)");
        System.out.print("Ingrese la opcion elegida:");
    }

    public static void menuComoSeVeElVehiculo() {
        /*
         * aqui hacer una lista de caracteres , y que solo muestre los
         * todavia no han sido elegidos
         * y con un ciclo for mostrar los caracteres que no han sido elegidos ,
         * para que los puedan escoger , entre las nuevas opciones .
         */
        System.out.println("Ingrese el tipo de Monster Truck:");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. ");
        System.out.println("9. ");
        System.out.println("10. ");
        System.out.println("11. ");
        System.out.println("12. ");
        System.out.println("13. ");
        System.out.println("14. ");
        System.out.println("15. ");
        System.out.println("(el numero que esta al lado de su opcion)");
        System.out.print("Ingrese la opcion elegida:");
    }

    public static void menuTipoDeCaucho() {
        System.out.println("Ingrese el tipo de caucho:");
        System.out.println("1. Todo terreno");
        System.out.println("2. Normales");
        System.out.println("3. Anti Coleo");
        System.out.println("(el numero que esta al lado de su opcion)");
        System.out.print("Ingrese la opcion elegida:");
    }

    public static void menuTamanoDeCaucho() {
        System.out.println("Ingrese el tamano de caucho:");
        System.out.println("1. Monster truck");
        System.out.println("2. Normales");
        System.out.println("3. Pegado al piso");
        System.out.println("(el numero que esta al lado de su opcion)");
        System.out.print("Ingrese la opcion elegida:");
    }

    public static void menuNuevoVehiculo() {
        System.out.println(" ");
        System.out.println("1. Perezoso        Todo Terreno   Monster Truck 1    140");
        System.out.println("2. Perezoso        Todo Terreno   Monster Truck 2    120");
        System.out.println("3. Perezoso        Todo Terreno   Monster Truck 3    110");
        System.out.println("4. Perezoso        Todo Terreno   Monster Truck 4    100");
        System.out.println("5. Perezoso        Todo Terreno   Monster Truck 5     80");
        System.out.println("6. Perezoso        Normales       Normales           120");
        System.out.println("7. Crucero         Normales       Normales           140");
        System.out.println("8. super ferrari   Anti Coleo     Pegado al piso     160");
        System.out.println("9.  Delorean       Anti Coleo     Pegado al piso     180");
    }
}