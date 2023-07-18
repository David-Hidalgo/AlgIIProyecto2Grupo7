package com.AlgIIProyecto2Grupo7.estructuras.avl;

public class PistaTest{
	public static void main(String[] args) {
		int nivel = 4;
		PistaAvl pista = Pista.crearPista(nivel);
		pista.inOrden();
		Pista.generarTrampas(pista, nivel, 15);
		pista.getRaiz().inOrdenTrampas();
		pista.inOrden();
		
	}
}