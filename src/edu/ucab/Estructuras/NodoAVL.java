package edu.ucab.Estructuras;

public class NodoAVL {
    private int clave;
    private int fe;
    private NodoAVL izquierdo;
    private NodoAVL derecho;

    public NodoAVL(int clave) {
        this.clave = clave;
        this.fe = 0;
        this.izquierdo = null;
        this.derecho = null;
    }

    public int getClave() {
        return clave;
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

    public void setClave(int clave) {
        this.clave = clave;
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
