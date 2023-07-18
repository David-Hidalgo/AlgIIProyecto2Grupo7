package com.AlgIIProyecto2Grupo7.estructuras.avl;
public class PistaTest{
	public static void main(String[] args) {
		int nivel = 5;
		double lim = (Math.pow(2, nivel-1)*1.5)-4;
		int limInt=((int)lim);
		PistaAvl pista = Pista.crearPista(nivel);
		pista.inOrden();
		Pista.generarTrampas(pista, nivel, limInt);
		pista.getRaiz().inOrdenTrampas();
		pista.inOrden();
		
	}
}