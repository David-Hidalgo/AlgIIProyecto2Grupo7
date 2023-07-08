package edu.ucab.estructuras;

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

    public void insertar(int clave) {
        NodoAVL nuevo = new NodoAVL(clave);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertarAVL(nuevo, raiz);
        }
    }

    private NodoAVL insertarAVL(NodoAVL nuevo, NodoAVL subAr) {
        NodoAVL nuevoPadre = subAr;
        if (nuevo.getClave() < subAr.getClave()) {
            if (subAr.getIzquierdo() == null) {
                subAr.setIzquierdo(nuevo);
            } else {
                subAr.setIzquierdo(insertarAVL(nuevo, subAr.getIzquierdo()));
                if ((obtenerFE(subAr.getIzquierdo()) - obtenerFE(subAr.getDerecho())) == 2) {
                    if (nuevo.getClave() < subAr.getIzquierdo().getClave()) {
                        nuevoPadre = rotacionIzquierda(subAr);
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(subAr);
                    }
                }
            }
        } else if (nuevo.getClave() > subAr.getClave()) {
            if (subAr.getDerecho() == null) {
                subAr.setDerecho(nuevo);
            } else {
                subAr.setDerecho(insertarAVL(nuevo, subAr.getDerecho()));
                if ((obtenerFE(subAr.getDerecho()) - obtenerFE(subAr.getIzquierdo())) == 2) {
                    if (nuevo.getClave() > subAr.getDerecho().getClave()) {
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

    private NodoAVL buscarNodo(NodoAVL nodo, int clave) {
        if (nodo == null) {
            return null;
        } else if (nodo.getClave() == clave) {
            return nodo;
        } else if (nodo.getClave() < clave) {
            return buscarNodo(nodo.getDerecho(), clave);
        } else {
            return buscarNodo(nodo.getIzquierdo(), clave);
        }
    }

    public NodoAVL buscar(int clave) {
        return buscarNodo(raiz, clave);
    }

    private NodoAVL reemplazar(NodoAVL nodo) {
        NodoAVL auxiliar1 = nodo;
        NodoAVL auxiliar2 = nodo.getIzquierdo();
        while (auxiliar2 != null) {
            auxiliar1 = auxiliar2;
            auxiliar2 = auxiliar2.getIzquierdo();
        }
        nodo.setClave(auxiliar1.getClave());
        return auxiliar1;
    }

    private NodoAVL eliminarAVL(NodoAVL nodo, int clave) {
        if (nodo == null) {
            return nodo;
        } else if (nodo.getClave() < clave) {
            nodo.setDerecho(eliminarAVL(nodo.getDerecho(), clave));
        } else if (nodo.getClave() > clave) {
            nodo.setIzquierdo(eliminarAVL(nodo.getIzquierdo(), clave));
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

    public void eliminar(int clave) {
        if (raiz == null) {
            System.out.println("Arbol vacio");
        } else {
            raiz = eliminarAVL(raiz, clave);
        }
    }

    public void preOrden(NodoAVL nodo) {
        if (nodo != null) {
            System.out.println(nodo.getClave() + " ");
            preOrden(nodo.getIzquierdo());
            preOrden(nodo.getDerecho());
        }
    }

    public void inOrden(NodoAVL nodo) {
        if (nodo != null) {
            inOrden(nodo.getIzquierdo());
            System.out.println(nodo.getClave() + " ");
            inOrden(nodo.getDerecho());
        }
    }

    public void postOrden(NodoAVL nodo) {
        if (nodo != null) {
            postOrden(nodo.getIzquierdo());
            postOrden(nodo.getDerecho());
            System.out.println(nodo.getClave() + " ");
        }
    }
}
