package com.AlgIIProyecto2Grupo7.estructuras.avl;

import static java.lang.Math.pow;
import java.util.Random;

public class Pista {
	
	public static void name(PistaAvl pistaNueva, int niveles) {
		
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
