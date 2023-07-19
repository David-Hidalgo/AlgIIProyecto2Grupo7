package com.AlgIIProyecto2Grupo7.estructuras.avl;

import com.AlgIIProyecto2Grupo7.estructuras.Vehiculo;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;
import com.AlgIIProyecto2Grupo7.estructuras.ReadWrite;

public class PistaTest{
	public static void main(String[] args) {
	
		ListaVehiculo foo = ReadWrite.cargarVehiculosDefault();


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
		
		foo=pista.ListaGanadores(foo);
		System.out.println(foo);

		
	}
}