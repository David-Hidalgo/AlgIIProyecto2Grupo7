package com.AlgIIProyecto2Grupo7.GestionVehiculos;

import com.AlgIIProyecto2Grupo7.estructuras.Vehiculo;

public class ListaVehiculo {
	/**
	 * NodoLista
	 */
	public class NodoLista {
		protected Vehiculo p;
	
		protected NodoLista prox;

		public NodoLista() {
			this.p = null;
			this.prox = null;
		}

		public NodoLista(Vehiculo p) {
			this.p = p;
			this.prox = null;
		}

		public Vehiculo getP() {
			return p;
		}

		public void setP(Vehiculo p) {
			this.p = p;
		}

		public NodoLista getProx() {
			return prox;
		}

		public void setProx(NodoLista prox) {
			this.prox = prox;
		}
	}
	
	/**
	 * Atributos
	 */

	private NodoLista inicio;	

	private int tamano;

public void insertar() {
	
}

}
