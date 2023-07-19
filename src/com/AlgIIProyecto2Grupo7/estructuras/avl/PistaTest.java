package com.AlgIIProyecto2Grupo7.estructuras.avl;

import com.AlgIIProyecto2Grupo7.estructuras.Vehiculo;

public class PistaTest{
	public static void main(String[] args) {
		Vehiculo foo = new Vehiculo(1);
		Vehiculo bar = new Vehiculo(2);

		

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
		
		pista.simularCarrera(pista.raiz, foo);
		
		System.out.println("Pista original");
		pista.inOrden();
		System.out.println("Pista clonada");
		auxAvl.inOrden();
		
	}
}