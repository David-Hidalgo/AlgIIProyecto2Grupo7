package com.AlgIIProyecto2Grupo7.estructuras;

public class NodoAVL<T extends Comparable<T>> {

    private T dato;
    private NodoAVL<T> izquierdo;
    private NodoAVL<T> derecho;
    private int altura;

    public NodoAVL(T dato) {
        this.dato = dato;
        izquierdo = null;
        derecho = null;
        altura = 1;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoAVL<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoAVL<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoAVL<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoAVL<T> derecho) {
        this.derecho = derecho;
    }

    public int getAltura() {
        return altura;
    }

    public void actualizarAltura() {
        int alturaIzquierdo = (izquierdo != null) ? izquierdo.getAltura() : 0;
        int alturaDerecho = (derecho != null) ? derecho.getAltura() : 0;
        altura = Math.max(alturaIzquierdo, alturaDerecho) + 1;
    }

    public int getBalance() {
        int alturaIzquierdo = (izquierdo != null) ? izquierdo.getAltura() : 0;
        int alturaDerecho = (derecho != null) ? derecho.getAltura() : 0;
        return alturaIzquierdo - alturaDerecho;
    }

}