/**
/**
 * Cada nodo tiene una clave, una distancia desde su nodo padre, nodos hijos izquierdo y derecho, un objeto trampa y una bandera booleana que indica si un automóvil ha estado en esta parada.

 */
package com.AlgIIProyecto2Grupo7.estructuras.avl;

public class NodoParada implements Cloneable {
	private int clave;
	private int distancia; // distancia en km desde el padre al nodo
    private NodoParada hijoIzquierdo;
    private NodoParada hijoDerecho;
    private Trampa trampa;
    private boolean elCarroEstaAqui = false;

    public boolean getElCarroEstaAqui() {
        return elCarroEstaAqui;
    }

    public void setElCarroEstaAqui(boolean elCarroEstuvoAqui) {
        this.elCarroEstaAqui = elCarroEstuvoAqui;
    }

    public NodoParada(int clave) {
        this.clave = clave;
        hijoIzquierdo = hijoDerecho = null;
        trampa = null;
        setElCarroEstaAqui(false);
    }
    
    public NodoParada() {
        this.clave = 0;
        hijoIzquierdo = hijoDerecho = null;
        trampa = null;
    }

    public Trampa getTrampa() {
        return trampa;
    }

    public void setTrampa(Trampa obstaculo) {
        this.trampa = obstaculo;
    }

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
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

    public int nodosCompletos(NodoParada n) {
        if (n == null)
            return 0;
        else {
            if (n.getHijoIzquierdo() != null && n.getHijoDerecho() != null)
                return nodosCompletos(n.getHijoIzquierdo()) + nodosCompletos(n.getHijoDerecho()) + 1;
            return nodosCompletos(n.getHijoIzquierdo()) + nodosCompletos(n.getHijoDerecho());
        }
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
    
    public void inOrdenTrampas() {
        if (hijoIzquierdo != null) {
            hijoIzquierdo.inOrdenTrampas();
        }
        if (trampa != null) {
            System.out.println(trampa.getTipoTrampa());
        }
        if (hijoDerecho != null) {
            hijoDerecho.inOrdenTrampas();
        }
    }
    public int getCantidadNodos(int i) {
        if (hijoIzquierdo != null) {
            hijoIzquierdo.getCantidadNodos(i);
        }
        System.out.println(clave);
        i++;
        if (hijoDerecho != null) {
            hijoDerecho.getCantidadNodos(i);
        }
        return i;
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

    public void copiar (NodoParada nodo) {
        if (nodo == null) {
            return;
        }
        this.clave = nodo.getClave();
        if (this.hijoIzquierdo!=null){

        this.hijoIzquierdo.copiar(nodo.getHijoIzquierdo());
        }
        if (this.hijoDerecho!=null){

        this.hijoDerecho.copiar(nodo.getHijoDerecho());
        }
        

    }

    
    public String toString() {
        if (this.elCarroEstaAqui) {
            return "Carro";
        } else if (this.trampa!=null){
            return "Trampa";
        } else 
        return String.valueOf(clave)+" "+distancia+"km";
    }

    @Override
    public NodoParada clone() {
        try {
            NodoParada cloned = (NodoParada) super.clone();
            if (hijoIzquierdo != null) {
                cloned.hijoIzquierdo = hijoIzquierdo.clone();
            }
            if (hijoDerecho != null) {
                cloned.hijoDerecho = hijoDerecho.clone();
            }
            if (trampa != null) {
                cloned.trampa = trampa.clone();
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
