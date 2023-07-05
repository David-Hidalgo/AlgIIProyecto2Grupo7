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

    private NodoAVL buscarNodo(NodoAVL nodo, int dato) {
        if (nodo == null) {
            return null;
        } else if (nodo.getDato() == dato) {
            return nodo;
        } else if (nodo.getDato() < dato) {
            return buscarNodo(nodo.getDerecho(), dato);
        } else {
            return buscarNodo(nodo.getIzquierdo(), dato);
        }
    }

    public NodoAVL buscar(int dato) {
        return buscarNodo(raiz, dato);
    }

    private NodoAVL reemplazar(NodoAVL nodo) {
        NodoAVL auxiliar1 = nodo;
        NodoAVL auxiliar2 = nodo.getIzquierdo();
        while (auxiliar2 != null) {
            auxiliar1 = auxiliar2;
            auxiliar2 = auxiliar2.getIzquierdo();
        }
        nodo.setDato(auxiliar1.getDato());
        return auxiliar1;
    }

    

    private NodoAVL eliminarAVL(NodoAVL nodo, int dato) {
        if (nodo == null) {
            return nodo;
        } else if (nodo.getDato() < dato) {
            nodo.setDerecho(eliminarAVL(nodo.getDerecho(), dato));
        } else if (nodo.getDato() > dato) {
            nodo.setIzquierdo(eliminarAVL(nodo.getIzquierdo(), dato));
        } else {
            NodoAVL auxiliar = nodo;
            if (auxiliar.getIzquierdo() == null) {
                nodo = auxiliar.getDerecho();
            } else if (auxiliar.getDerecho() == null) {
                nodo = auxiliar.getIzquierdo();
            } else {
                auxiliar = reemplazar(auxiliar);
            }
            auxiliar = null;
        }
        if (nodo == null) {
            return nodo;
        }
        nodo.setFe(Math.max(obtenerFE(nodo.getIzquierdo()), obtenerFE(nodo.getDerecho())) + 1);
        int fe = obtenerFE(nodo);
        if (fe > 1 && obtenerFE(nodo.getIzquierdo()) >= 0) {
            return rotacionDerecha(nodo);
        }
        if (fe > 1 && obtenerFE(nodo.getIzquierdo()) < 0) {
            return rotacionDobleDerecha(nodo);
        }
        if (fe < -1 && obtenerFE(nodo.getDerecho()) <= 0) {
            return rotacionIzquierda(nodo);
        }
        if (fe < -1 && obtenerFE(nodo.getDerecho()) > 0) {
            return rotacionDobleIzquierda(nodo);
        }
        return nodo;
    }

    public void eliminar(int dato) {
        if (raiz == null) {
            System.out.println("Arbol vacio");
        } else {
            raiz = eliminarAVL(raiz, dato);
        }
    }


}
