package edu.ucab.Estructuras;

public class NodoAVL {
    private int dato;
    private int fe;
    private NodoAVL izquierdo;
    private NodoAVL derecho;

    public NodoAVL(int dato) {
        this.dato = dato;
        this.fe = 0;
        this.izquierdo = null;
        this.derecho = null;
    }

    public int getDato() {
        return dato;
    }

    public int getFe() {
        return fe;
    }

    public NodoAVL getIzquierdo() {
        return izquierdo;
    }

    public NodoAVL getDerecho() {
        return derecho;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public void setIzquierdo(NodoAVL izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setDerecho(NodoAVL derecho) {
        this.derecho = derecho;
    }
}
