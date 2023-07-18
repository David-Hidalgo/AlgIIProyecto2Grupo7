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

	public void insertarPos(Vehiculo p, int pos) {
		NodoLista nuevo = new NodoLista(p);
		if (pos == 0) {
			insertarInicio(p);
		} else if (pos >= tamano) {
			insertarFinal(p);
		} else {
			NodoLista aux = inicio;
			for (int i = 0; i < (pos - 1); i++) {
				aux = aux.getProx();
			}
			NodoLista siguiente = aux.getProx();
			aux.setProx(nuevo);
			nuevo.setProx(siguiente);
			tamano++;
		}
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
				while (aux.getProx().getProx() != null) {
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
			} else if (pos >= tamano) {
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

	public void eliminar(Vehiculo p) {
		if (!esVacia()) {
			if (inicio.getP().equals(p)) {
				eliminarInicio();
			} else {
				NodoLista aux = inicio;
				while (aux.getProx() != null && !aux.getProx().getP().equals(p)) {
					aux = aux.getProx();
				}
				if (aux.getProx() != null) {
					NodoLista temp = aux.getProx();
					aux.setProx(temp.getProx());
					temp.setProx(null);
					tamano--;
				}
			}
		}
	}

	public int buscar(Vehiculo p) {
		NodoLista aux = inicio;
		int pos = 0;
		while (aux != null && !aux.getP().equals(p)) {
			aux = aux.getProx();
			pos++;
		}
		if (aux != null) {
			return pos;
		} else {
			return -1;
		}
	}

	public void vaciar() {
		while (!esVacia()) {
			eliminarInicio();
		}
	}

	public void mostrar() {
		NodoLista aux = inicio;
		while (aux != null) {
			System.out.println(aux.getP());
			aux = aux.getProx();
		}
	}

	public String toString() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP() + "\n";
			aux = aux.getProx();
		}
		return s;
	}

	public String toStringEnPantalla() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getvehiculoEnPantalla() + " ";
			aux = aux.getProx();
		}
		return s;
	}

	public String toStringEnPantalla(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getvehiculoEnPantalla();
		return s;
	}

	public String toStringNombreEs() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getnombreEs() + " ";
			aux = aux.getProx();
		}
		return s;
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

	public String toStringNombreEn() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getnombreEn() + " ";
			aux = aux.getProx();
		}
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

	public String toStringConductor() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getconductor() + " ";
			aux = aux.getProx();
		}
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

	public String toStringTipoCaucho() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getTipoCaucho() + " ";
			aux = aux.getProx();
		}
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

	public String toStringTamanoCaucho() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getTamanoCaucho() + " ";
			aux = aux.getProx();
		}
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

	public String toStringMonsterTruck() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getMonsterTruck() + " ";
			aux = aux.getProx();
		}
		return s;
	}

	public String toStringMonsterTruck(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getMonsterTruck();
		return s;
	}

	public String toStringVelocidad() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getVelocidad() + " ";
			aux = aux.getProx();
		}
		return s;
	}

	public String toStringVelocidad(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getVelocidad();
		return s;
	}

	public String toStringVelocidadKm() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getVelocidadKm() + " ";
			aux = aux.getProx();
		}
		return s;
	}

	public String toStringVelocidadKm(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {
			aux = aux.getProx();
		}
		s += aux.getP().getVelocidadKm();
		return s;
	}

	public String toStringResBomba() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getResBomba() + " ";
			aux = aux.getProx();
		}
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

	public String toStringResPiedra() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getResPiedra() + " ";
			aux = aux.getProx();
		}
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

	public String toStringResLiquido() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getResLiquido() + " ";
			aux = aux.getProx();
		}
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

	public String toStringVehiculoEnPantalla() {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			s += aux.getP().getvehiculoEnPantalla() + " ";
			aux = aux.getProx();
		}
		return s;
	}

	public String toStringVehiculoEnPantalla(int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {	
			aux = aux.getProx();
		}
		s += aux.getP().getvehiculoEnPantalla();
		return s;
	}

	public String toStringVehiculoEnPantalla(int pos, String vehiculoEnPantalla) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {	
			aux = aux.getProx();
		}
		aux.getP().setvehiculoEnPantalla(vehiculoEnPantalla);
		s += aux.getP().getvehiculoEnPantalla();
		return s;
	}

	public String toStringVehiculoEnPantalla(String vehiculoEnPantalla) {
		String s = "";
		NodoLista aux = inicio;
		while (aux != null) {
			aux.getP().setvehiculoEnPantalla(vehiculoEnPantalla);
			s += aux.getP().getvehiculoEnPantalla() + " ";
			aux = aux.getProx();
		}
		return s;
	}

	public String toStringVehiculoEnPantalla(String vehiculoEnPantalla, int pos) {
		String s = "";
		NodoLista aux = inicio;
		for (int i = 0; i < pos; i++) {	
			aux = aux.getProx();
		}
		aux.getP().setvehiculoEnPantalla(vehiculoEnPantalla);
		s += aux.getP().getvehiculoEnPantalla();
		return s;
	}

	



}
