package com.AlgIIProyecto2Grupo7.GestionVehiculos;

import com.AlgIIProyecto2Grupo7.estructuras.Vehiculo;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;
import com.AlgIIProyecto2Grupo7.Menu;
import com.AlgIIProyecto2Grupo7.Validaciones;
import com.AlgIIProyecto2Grupo7.estructuras.ReadWrite;

public class AppGestionVehiculos {
    public static void main(String[] args) throws Exception {
        ListaVehiculo lista = ReadWrite.cargarVehiculosDefault();
    }
    
}
