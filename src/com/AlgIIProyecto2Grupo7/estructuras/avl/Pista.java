package com.AlgIIProyecto2Grupo7.estructuras.avl;

import static java.lang.Math.pow;
import static java.lang.Math.log;
import java.util.Random;
import com.AlgIIProyecto2Grupo7.estructuras.avl.PistaAvl;

public class Pista {

	private static boolean insertarTrampa(NodoParada nodo, int nivel, Trampa trampa) {
		if (nivel == 0){
			if (nodo.getTrampa() == null) {
				nodo.setTrampa(trampa);
				return true;
			}else{return false;}
		}
		Random random = new Random();
		int derechoIzquierdo = random.nextInt(2);
		if (derechoIzquierdo == 0) {
			return insertarTrampa(nodo.getHijoIzquierdo(), nivel - 1, trampa);
		} else {
			return insertarTrampa(nodo.getHijoDerecho(), nivel - 1, trampa);
		}
		
	}


	
	//funcion para generar trampas en la pista de forma balanceada
	public static void generarTrampas(PistaAvl pistaNueva, int niveles, int cantidadTrampas) {
		Random random = new Random();
		int nivelRandom, nivel;
		double valor;
		for (int i = 0; i < cantidadTrampas; i++) {
			
			Trampa trampa = new Trampa(random.nextInt(3)+1);
			do {
			nivelRandom = random.nextInt((int)pow(2, niveles-1)-1);
			valor = log(nivelRandom+1) / log(2);
			nivel = (int)(valor+1);
				
			} while (!insertarTrampa(pistaNueva.getRaiz(), nivel, trampa));
		}

	
	}

	public static PistaAvl crearPista(int niveles) {
		Random random = new Random();
		PistaAvl pistaNueva = new PistaAvl(10000);
		for (int i = 0; i < (pow(2, niveles)-1); i++) {
			int menor;
			int mayor;
			do {
				menor =random.nextInt(10000);
			} while (pistaNueva.existe(menor));
			do {
				mayor =random.nextInt(10001, 20000);
			} while (pistaNueva.existe(mayor));			
			pistaNueva.insertar(menor);
			pistaNueva.insertar(mayor);
		}
		return pistaNueva;
	}
}
