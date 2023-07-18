package com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo;

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

	/**
	 * Constructor
	 */

	public ListaVehiculo() {
		this.inicio = null;
		this.tamano = 0;
	}

	/**
	 * Metodos
	 */

	public boolean esVacia() {
		return this.inicio == null;
	}

	public int getTamano() {
		return tamano;
	}

	public void insertarInicio(Vehiculo p) {
		NodoLista nuevo = new NodoLista(p);
		nuevo.setProx(inicio);
		inicio = nuevo;
		tamano++;
	}

	public void insertarFinal(Vehiculo p) {
		NodoLista nuevo = new NodoLista(p);
		if (esVacia()) {
			inicio = nuevo;
		} else {
			NodoLista aux = inicio;
			while (aux.getProx() != null) {
				aux = aux.getProx();
			}
			aux.setProx(nuevo);
		}
		tamano++;
	}


	public Vehiculo getVehiculo(int pos) {
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		return aux.getP();
	}

	public void eliminarInicio() {
		if (!esVacia()) {
			NodoLista aux = inicio;
			inicio = inicio.getProx();
			aux.setProx(null);
			tamano--;
		}
	}

	public void eliminarFinal() {
		if (!esVacia()) {
			if (tamano == 1) {
				eliminarInicio();
			} else {
				NodoLista aux = inicio;
				for (int i = 0; i < (tamano - 2); i++) {
					aux = aux.getProx();
				}
				NodoLista temp = aux.getProx();
				aux.setProx(null);
				temp.setProx(null);
				tamano--;
			}
		}
	}

	public void eliminarPos(int pos) {
		if (!esVacia()) {
			if (pos == 0) {
				eliminarInicio();
			} else if (pos >= tamano) {// revisar 
				eliminarFinal();
			} else {
				NodoLista aux = inicio;
				for (int i = 0; i < (pos - 1); i++) {
					aux = aux.getProx();
				}
				NodoLista temp = aux.getProx();
				aux.setProx(temp.getProx());
				temp.setProx(null);
				tamano--;
			}
		}
	}



	public void vaciar() {
		while (!esVacia()) {
			eliminarInicio();
		}
	}

	public String toStringNombreEs(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getnombreEs();
		return s;
	}


	public String toStringNombreEn(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getnombreEn();
		return s;
	}

	public String toStringConductor(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getconductor();
		return s;
	}

	public String toStringTipoCaucho(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getTipoCaucho();
		return s;
	}

	public String toStringTamanoCaucho(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getTamanoCaucho();
		return s;
	}
/* 
	public String toStringMonsterTruck(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getMonsterTruck();
		return s;
	}
*/
	public String toStringVelocidad(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getVelocidad();
		return s;
	}

	public String toStringResBomba(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();	
		}
		s += aux.getP().getResBomba();
		return s;
	}

	public String toStringResPiedra(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {	
			aux = aux.getProx();
		}
		s += aux.getP().getResPiedra();
		return s;
	}

	public String toStringResLiquido(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {	
			aux = aux.getProx();
		}
		s += aux.getP().getResLiquido();
		return s;
	}

}
