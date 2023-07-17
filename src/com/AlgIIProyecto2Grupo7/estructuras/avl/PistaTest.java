package com.AlgIIProyecto2Grupo7.estructuras.avl;

public class PistaTest{
	public static void main(String[] args) {
		PistaAvl pista = Pista.crearPista(3);
		Pista.generarTrampas(pista, 3, 5);
		pista.getRaiz().inOrdenTrampas();
		pista.inOrden();
		
	}
}