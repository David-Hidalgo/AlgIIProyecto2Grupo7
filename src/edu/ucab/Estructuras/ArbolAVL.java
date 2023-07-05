package edu.ucab.Estructuras;
public class ArbolAVL {
    private NodoAVL raiz;
    private int obtenerFE(NodoAVL nodo) {
        if (nodo == null) {
            return -1;
        } else {
            return nodo.getFe();
        }
    }
    private NodoAVL rotacionIzquierda(NodoAVL c) {
        NodoAVL auxiliar = c.getIzquierdo();
        c.setIzquierdo(auxiliar.getDerecho());
        auxiliar.setDerecho(c);
        c.setFe(Math.max(obtenerFE(c.getIzquierdo()), obtenerFE(c.getDerecho())) + 1);
        auxiliar.setFe(Math.max(obtenerFE(auxiliar.getIzquierdo()), obtenerFE(auxiliar.getDerecho())) + 1);
        return auxiliar;
    }
    private NodoAVL rotacionDerecha(NodoAVL c) {
        NodoAVL auxiliar = c.getDerecho();
        c.setDerecho(auxiliar.getIzquierdo());
        auxiliar.setIzquierdo(c);
        c.setFe(Math.max(obtenerFE(c.getIzquierdo()), obtenerFE(c.getDerecho())) + 1);
        auxiliar.setFe(Math.max(obtenerFE(auxiliar.getIzquierdo()), obtenerFE(auxiliar.getDerecho())) + 1);
        return auxiliar;
    }
    public ArbolAVL() {
        raiz = null;
    }
    public NodoAVL getRaiz() {
        return raiz;
    }
    public void setRaiz(NodoAVL raiz) {
        this.raiz = raiz;
    }
    private NodoAVL rotacionDobleIzquierda(NodoAVL c) {
        NodoAVL temporal;
        c.setIzquierdo(rotacionDerecha(c.getIzquierdo()));
        temporal = rotacionIzquierda(c);
        return temporal;
    }
    private NodoAVL rotacionDobleDerecha(NodoAVL c) {
        NodoAVL temporal;
        c.setDerecho(rotacionIzquierda(c.getDerecho()));
        temporal = rotacionDerecha(c);
        return temporal;
    }
    public void insertar(int dato) {
        NodoAVL nuevo = new NodoAVL(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertarAVL(nuevo, raiz);
        }
    }
    private NodoAVL insertarAVL(NodoAVL nuevo, NodoAVL subAr) {
        NodoAVL nuevoPadre = subAr;
        if (nuevo.getDato() < subAr.getDato()) {
            if (subAr.getIzquierdo() == null) {
                subAr.setIzquierdo(nuevo);
            } else {
                subAr.setIzquierdo(insertarAVL(nuevo, subAr.getIzquierdo()));
                if ((obtenerFE(subAr.getIzquierdo()) - obtenerFE(subAr.getDerecho())) == 2) {
                    if (nuevo.getDato() < subAr.getIzquierdo().getDato()) {
                        nuevoPadre = rotacionIzquierda(subAr);
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(subAr);
                    }
                }
            }
        } else if (nuevo.getDato() > subAr.getDato()) {
            if (subAr.getDerecho() == null) {
                subAr.setDerecho(nuevo);
            } else {
                subAr.setDerecho(insertarAVL(nuevo, subAr.getDerecho()));
                if ((obtenerFE(subAr.getDerecho()) - obtenerFE(subAr.getIzquierdo())) == 2) {
                    if (nuevo.getDato() > subAr.getDerecho().getDato()) {
                        nuevoPadre = rotacionDerecha(subAr);
                    } else {
                        nuevoPadre = rotacionDobleDerecha(subAr);
                    }
                }
            }
        } else {
            System.out.println("Nodo Duplicado");
        }
        if ((subAr.getIzquierdo() == null) && (subAr.getDerecho() != null)) {
            subAr.setFe(subAr.getDerecho().getFe() + 1);
        } else if ((subAr.getDerecho() == null) && (subAr.getIzquierdo() != null)) {
            subAr.setFe(subAr.getIzquierdo().getFe() + 1);
        } else {
            subAr.setFe(Math.max(obtenerFE(subAr.getIzquierdo()), obtenerFE(subAr.getDerecho())) + 1);
        }
        return nuevoPadre;
    }
}
