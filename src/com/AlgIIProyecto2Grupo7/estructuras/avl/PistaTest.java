package com.AlgIIProyecto2Grupo7.estructuras.avl;

public class PistaTest{
	public static void main(String[] args) {
		PistaAvl pista = Pista.crearPista(4);
		Pista.generarTrampas(pista, 4, 2);
		pista.getRaiz().inOrdenTrampas();
		pista.inOrden();
		
	}
}