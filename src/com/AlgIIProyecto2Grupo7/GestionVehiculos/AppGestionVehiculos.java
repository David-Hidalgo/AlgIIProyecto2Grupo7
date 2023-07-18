package com.AlgIIProyecto2Grupo7.GestionVehiculos;

import com.AlgIIProyecto2Grupo7.estructuras.Vehiculo;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;
import com.AlgIIProyecto2Grupo7.Validaciones;

public class AppGestionVehiculos {
    public static void main(String[] args) throws Exception {
        ListaVehiculo lista = new ListaVehiculo();
		
		Vehiculo p1 = new Vehiculo("messi", "goat", "asasasas", "pegados al piso", "2", "velocidad", "ResBomba", "ResPiedra", "ResLiquido", "");
		Vehiculo p2 = new Vehiculo("Cr7", "cris", "frggfd", "pegados al piso", "tamanoCaucho","velocidad", "ResBomba", "ResPiedra", "ResLiquido", "");
		Vehiculo p3 = new Vehiculo("neimar", "nny", "jfdjfv", "pegados al piso", "tamanoCaucho","velocidad", "ResBomba", "ResPiedra", "ResLiquido", "");
		Vehiculo p4 = new Vehiculo("rondon", "rondo", "pokmjkj", "pegados al piso", "tamanoCaucho","velocidad", "ResBomba", "ResPiedra", "ResLiquido", "");
		

		lista.insertarInicio(p1);
		lista.insertarInicio(p1);

    }
    
}
