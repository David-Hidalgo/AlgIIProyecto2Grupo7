package com.AlgIIProyecto2Grupo7.GestionPistas;

import com.AlgIIProyecto2Grupo7.estructuras.ReadWrite;
import com.AlgIIProyecto2Grupo7.estructuras.avl.Pista;
import com.AlgIIProyecto2Grupo7.estructuras.avl.PistaAvl;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;

public class AppGestionPistas {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ListaVehiculo listaCompetidores = ReadWrite.cargarVehiculosDefault();
		int nivel = 5;
		double lim = (Math.pow(2, nivel-1)*1.5)-4;
		int limInt=((int)lim);
		PistaAvl pista = Pista.crearPista(nivel);
		PistaAvl auxAvl = (PistaAvl) pista.clone();
		pista.inOrden();
		Pista.generarTrampas(pista, nivel, 10);
		System.out.println("Pista original");
		auxAvl=pista.clone();
		pista.inOrden();
		System.out.println("Pista clonada");
		auxAvl.inOrden();
		
		listaCompetidores=pista.ListaGanadores(listaCompetidores);
        ReadWrite.guardarHistorico(listaCompetidores);
		System.out.println(listaCompetidores);
    }
}
