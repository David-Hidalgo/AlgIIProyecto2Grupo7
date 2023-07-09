package edu.ucab.estructuras.avl;

public class Avl {
    private Nodo raiz;

    public Avl() {
        raiz = null;
    }

    public Avl(int valor) {
        raiz = new Nodo(valor);
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void insertar(int valorInsertar) {
        this.raiz = insertar(valorInsertar, raiz);
    }

    private Nodo rotacionSimpleIzquierda(Nodo nodo) {
        Nodo aux = nodo.getHijoIzquierdo();
        nodo.setHijoIzquierdo(aux.getHijoDerecho());
        aux.setHijoDerecho(nodo);
        return aux;
    }

    private Nodo rotacionSimpleDerecha(Nodo nodo) {
        Nodo aux = nodo.getHijoDerecho();
        nodo.setHijoDerecho(aux.getHijoIzquierdo());
        aux.setHijoIzquierdo(nodo);
        return aux;
    }

    private Nodo rotacionDobleIzquierda(Nodo nodo) {
        nodo.setHijoIzquierdo(rotacionSimpleDerecha(nodo.getHijoIzquierdo()));
        return rotacionSimpleIzquierda(nodo);

    }

    private Nodo rotacionDobleDerecha(Nodo nodo) {
        nodo.setHijoDerecho(rotacionSimpleIzquierda(nodo.getHijoDerecho()));
        return rotacionSimpleDerecha(nodo);
    }

    private Nodo balancear(Nodo nodo) {
        Nodo hijoIzquierdo = nodo.getHijoIzquierdo();
        Nodo hijoDerecho = nodo.getHijoDerecho();
        int alturaIzquierda = nodo.altura(nodo.getHijoIzquierdo());
        int alturaDerecha = nodo.altura(nodo.getHijoDerecho());

        if (alturaIzquierda - alturaDerecha > 1) {
            if (hijoIzquierdo.altura(hijoIzquierdo.getHijoIzquierdo()) >= hijoIzquierdo.altura(hijoIzquierdo.getHijoDerecho())) {
                nodo = rotacionSimpleIzquierda(nodo);
            } else {
                nodo = rotacionDobleIzquierda(nodo);
            }
        } else if (alturaDerecha - alturaIzquierda > 1) {
            if (hijoDerecho.altura(hijoDerecho.getHijoDerecho()) >= hijoDerecho.altura(hijoDerecho.getHijoIzquierdo())) {
                nodo = rotacionSimpleDerecha(nodo);
            } else {
                nodo = rotacionDobleDerecha(nodo);
            }
        }
        return nodo;
    }

    private Nodo insertar(int valorInsertar, Nodo nodo) {
        if (nodo.getClave() == 0) {
            nodo.setClave(valorInsertar);
        } else {
            if (nodo.getClave() > valorInsertar) {
                if (nodo.getHijoIzquierdo() == null) {
                    nodo.setHijoIzquierdo(new Nodo(valorInsertar));
                } else {
                    nodo.setHijoIzquierdo(insertar(valorInsertar, nodo.getHijoIzquierdo()));
                }
            } else if (nodo.getClave() < valorInsertar) {
                if (nodo.getHijoDerecho() == null) {
                    nodo.setHijoDerecho(new Nodo(valorInsertar));
                } else {
                    nodo.setHijoDerecho(insertar(valorInsertar, nodo.getHijoDerecho()));
                }
            }
        }
        return balancear(nodo);
    }

    public boolean eliminar(int dato) {
        Nodo aux = raiz.buscarNodo(dato);
        if (aux != null) {
            if (comprobarHoja(aux, dato)) {
                return (EliminarHoja(this.raiz, dato));
            } else {
                raiz = EliminarNodo(this.raiz, dato);
                return false;
            }
        } else
            return false;
    }

    private boolean comprobarHoja(Nodo n, int dato) {

        if (dato == n.getClave()) {
            if ((n.getHijoDerecho() != null) && (n.getHijoIzquierdo() != null)) {
                return false;
            } else
                return true;
        }
        if (dato < n.getClave()) {
            return comprobarHoja(n.getHijoIzquierdo(), dato);
        } else {
            return comprobarHoja(n.getHijoDerecho(), dato);
        }
    }

    private boolean EliminarHoja(Nodo n, int dato) {
        boolean loEncontre = true;
        if (dato == n.getClave()) {

            return false;

        }
        if (dato < n.getClave()) {
            loEncontre = EliminarHoja(n.getHijoIzquierdo(), dato);
            if (!loEncontre) {
                n.setHijoIzquierdo(null);
            }
                n = balancear(n);
            return true;

        } else {
            loEncontre = EliminarHoja(n.getHijoDerecho(), dato);
            if (!loEncontre) {
                n.setHijoDerecho(null);
            }
                n = balancear(n);
            return true;
        }
    }

    public boolean existe(int dato) {
        return existe(this.raiz, dato);
    }

    private boolean existe(Nodo n, int dato) {
        if (n == null) {
            return false;
        }

        if (dato == n.getClave()) {
            return true;
        }
        if (dato < n.getClave()) {
            return existe(n.getHijoIzquierdo(), dato);
        } else {
            return existe(n.getHijoDerecho(), dato);
        }
    }

    private Nodo EliminarNodo(Nodo n, int dato) {
        if (dato == n.getClave()) {
            if (n.getHijoIzquierdo() == null) {
                n = EliminarRaizDerecha(n);
            } else {
                n = EliminarRaizIzquierda(n);
            }

        } else {
            if (dato < n.getClave()) {
                n.setHijoIzquierdo(EliminarNodo(n.getHijoIzquierdo(), dato));
            }
            if (dato > n.getClave()) {
                n.setHijoDerecho(EliminarNodo(n.getHijoDerecho(), dato));
            }
        }
        return balancear(n);
    }

    private Nodo EliminarRaizIzquierda(Nodo n) {
        if (n.getHijoIzquierdo().getHijoDerecho() == null) {
            n.setClave(n.getHijoIzquierdo().getClave());
            n.setHijoIzquierdo(n.getHijoIzquierdo().getHijoIzquierdo());
            n = balancear(n);
        } else {
            Nodo aux = n.getHijoIzquierdo().getHijoDerecho();
            while (aux.getHijoDerecho() != null) {
                aux = aux.getHijoDerecho();
            }
            int clave = aux.getClave();
            n.setClave(clave);
            if (aux.getHijoIzquierdo() == null) {
                EliminarHoja(n.getHijoIzquierdo(), clave);
            } else {
                n= EliminarNodo(n.getHijoIzquierdo(), clave);
            }
        }
        return n;
    }

    private Nodo EliminarRaizDerecha(Nodo n) {
        if (n.getHijoDerecho().getHijoIzquierdo() == null) {
            n.setClave(n.getHijoDerecho().getClave());
            n.setHijoDerecho(n.getHijoDerecho().getHijoDerecho());
            n = balancear(n);
        } else {
            Nodo aux = n.getHijoDerecho().getHijoIzquierdo();
            while (aux.getHijoIzquierdo() != null) {
                aux = aux.getHijoIzquierdo();
            }
            int clave = aux.getClave();
            n.setClave(clave);
            if (aux.getHijoDerecho() == null) {
                EliminarHoja(n.getHijoDerecho(), clave);
            } else {
                n= EliminarNodo(n.getHijoDerecho(), clave);
            }
        }
        return n;
    }

    /*
     * private boolean existeYEsHoja(Nodo n, int dato) {
     * if (dato == n.getClave()) {
     * if ((n.getHijoDerecho() != null) && (n.getHijoIzquierdo() != null)) {
     * return false;
     * } else
     * return true;
     * }
     * if (dato < n.getClave()) {
     * return existeYEsHoja(n.getHijoIzquierdo(), dato);
     * } else {
     * return existeYEsHoja(n.getHijoDerecho(), dato);
     * }
     * }
     */

    public void inOrden() {
        if (raiz != null) {
            raiz.inOrden();
        }
    }

    public void preOrden() {
        if (raiz != null) {
            raiz.preOrden();
        }
    }

    public void postOrden() {
        if (raiz != null) {
            raiz.postOrden();
        }
    }

}
