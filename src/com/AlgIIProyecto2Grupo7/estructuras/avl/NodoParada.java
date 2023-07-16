package com.AlgIIProyecto2Grupo7.estructuras.avl;

public class NodoParada {
	private int clave;
	private int distancia; // distancia en km desde el padre al nodo
    private NodoParada hijoIzquierdo;
    private NodoParada hijoDerecho;
    private Trampa obstaculo;

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

    public NodoParada(int clave) {
        this.clave = clave;
        hijoIzquierdo = hijoDerecho = null;
    }

    public NodoParada() {
        this.clave = 0;
        hijoIzquierdo = hijoDerecho = null;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int dato) {
        this.clave = dato;
    }

    public NodoParada getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoParada hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public NodoParada getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoParada hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public int altura(NodoParada nodo) {
        if (nodo == null) {
            return 0;
        } else {
            return (1 + Math.max(altura(nodo.getHijoIzquierdo()), altura(nodo.getHijoDerecho())));
        }

    }

    public NodoParada buscarNodo(int valorABuscar) {
        NodoParada aux;
        if (this.clave == valorABuscar)
            aux = this;
        else {
            if (clave > valorABuscar)
                if (hijoIzquierdo == null)
                    return null;
                else
                    aux = this.hijoIzquierdo.buscarNodo(valorABuscar);

            else {
                if (hijoDerecho == null)
                    return null;
                else
                    aux = this.hijoDerecho.buscarNodo(valorABuscar);
            }

        }
        return aux;
    }

    public void inOrden() {
        if (hijoIzquierdo != null) {
            hijoIzquierdo.inOrden();
        }
        System.out.println(clave);
        if (hijoDerecho != null) {
            hijoDerecho.inOrden();
        }
    }

    public void preOrden() {
        System.out.println(clave);
        if (hijoIzquierdo != null) {
            hijoIzquierdo.preOrden();
        }
        if (hijoDerecho != null) {
            hijoDerecho.preOrden();
        }
    }

    public void postOrden() {
        if (hijoIzquierdo != null) {
            hijoIzquierdo.postOrden();
        }
        if (hijoDerecho != null) {
            hijoDerecho.postOrden();
        }
        System.out.println(clave);
    }

	
}
