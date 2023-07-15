package com.AlgIIProyecto2Grupo7.estructuras;

public class ArbolAVL<T extends Comparable<T>> {

    private NodoAVL<T> raiz;

    public ArbolAVL() {
        raiz = null;
    }

    public void insertar(T dato) {
        raiz = insertar(dato, raiz);
    }

    private NodoAVL<T> insertar(T dato, NodoAVL<T> nodo) {
        if (nodo == null) {
            return new NodoAVL<>(dato);
        }

        if (dato.compareTo(nodo.getDato()) < 0) {
            nodo.setIzquierdo(insertar(dato, nodo.getIzquierdo()));
        } else {
            nodo.setDerecho(insertar(dato, nodo.getDerecho()));
        }

        nodo.actualizarAltura();

        int balance = nodo.getBalance();

        if (balance > 1 && dato.compareTo(nodo.getIzquierdo().getDato()) < 0) {
            return rotacionDerecha(nodo);
        }

        if (balance < -1 && dato.compareTo(nodo.getDerecho().getDato()) > 0) {
            return rotacionIzquierda(nodo);
        }

        if (balance > 1 && dato.compareTo(nodo.getIzquierdo().getDato()) > 0) {
            nodo.setIzquierdo(rotacionIzquierda(nodo.getIzquierdo()));
            return rotacionDerecha(nodo);
        }

        if (balance < -1 && dato.compareTo(nodo.getDerecho().getDato()) < 0) {
            nodo.setDerecho(rotacionDerecha(nodo.getDerecho()));
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    private NodoAVL<T> rotacionDerecha(NodoAVL<T> nodo) {
        NodoAVL<T> izquierdo = nodo.getIzquierdo();
        NodoAVL<T> derecho = izquierdo.getDerecho();

        izquierdo.setDerecho(nodo);
        nodo.setIzquierdo(derecho);

        nodo.actualizarAltura();
        izquierdo.actualizarAltura();

        return izquierdo;
    }

    private NodoAVL<T> rotacionIzquierda(NodoAVL<T> nodo) {
        NodoAVL<T> derecho = nodo.getDerecho();
        NodoAVL<T> izquierdo = derecho.getIzquierdo();

        derecho.setIzquierdo(nodo);
        nodo.setDerecho(izquierdo);

        nodo.actualizarAltura();
        derecho.actualizarAltura();

        return derecho;
    }

    public void eliminar(T dato) {
        raiz = eliminar(dato, raiz);
    }

    private NodoAVL<T> eliminar(T dato, NodoAVL<T> nodo) {
        if (nodo == null) {
            return null;
        }

        if (dato.compareTo(nodo.getDato()) < 0) {
            nodo.setIzquierdo(eliminar(dato, nodo.getIzquierdo()));
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            nodo.setDerecho(eliminar(dato, nodo.getDerecho()));
        } else {
            if (nodo.getIzquierdo() == null || nodo.getDerecho() == null) {
                nodo = (nodo.getIzquierdo() != null) ? nodo.getIzquierdo() : nodo.getDerecho();
            } else {
                NodoAVL<T> sucesor = buscarSucesor(nodo.getDerecho());
                nodo.setDato(sucesor.getDato());
                nodo.setDerecho(eliminar(sucesor.getDato(), nodo.getDerecho()));
            }
        }

        if (nodo == null) {
            return null;
        }

        nodo.actualizarAltura();

        int balance = nodo.getBalance();

        if (balance > 1 && nodo.getIzquierdo().getBalance() >= 0) {
            return rotacionDerecha(nodo);
        }

        if (balance > 1 && nodo.getIzquierdo().getBalance() < 0) {
            nodo.setIzquierdo(rotacionIzquierda(nodo.getIzquierdo()));
            return rotacionDerecha(nodo);
        }

        if (balance < -1 && nodo.getDerecho().getBalance() <= 0) {
            return rotacionIzquierda(nodo);
        }

        if (balance < -1 && nodo.getDerecho().getBalance() > 0) {
            nodo.setDerecho(rotacionDerecha(nodo.getDerecho()));
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    private NodoAVL<T> buscarSucesor(NodoAVL<T> nodo) {
        NodoAVL<T> actual = nodo;
        while (actual.getIzquierdo() != null) {
            actual = actual.getIzquierdo();
        }
        return actual;
    }

    public boolean buscar(T dato) {
        return buscar(dato, raiz);
    }

    private boolean buscar(T dato, NodoAVL<T> nodo) {
        if (nodo == null) {
            return false;
        }

        if (dato.compareTo(nodo.getDato()) < 0) {
            return buscar(dato, nodo.getIzquierdo());
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            return buscar(dato, nodo.getDerecho());
        } else {
            return true;
        }
    }

    public void inOrden() {
        inOrden(raiz);
    }
    
    private void inOrden(NodoAVL<T> nodo) {
        if (nodo != null) {
            inOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            inOrden(nodo.getDerecho());
        }
    }

    public void postOrden() {
        postOrden(raiz);
    }

    private void postOrden(NodoAVL<T> nodo) {
        if (nodo != null) {
            postOrden(nodo.getIzquierdo());
            postOrden(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
        }
    }

    public void preOrden() {
        preOrden(raiz);
    }

    private void preOrden(NodoAVL<T> nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            preOrden(nodo.getIzquierdo());
            preOrden(nodo.getDerecho());
        }
    }


    // agregando funciones

    public void mostrarArbol(NodoAVL<T> nodo , int cont) {
        if (nodo == null){
            return;
        } else {
            mostrarArbol(nodo.getDerecho(), cont+1);
            for(int i = 0 ; i < cont ; i++){
                System.out.print(" ");
            }
            System.out.println(nodo.getDato());
            mostrarArbol(nodo.getIzquierdo(), cont+1);
        }
    }

    public void niveles(NodoAVL<T> nodo , int cont , int N){
        if (nodo == null){
            return;
        } else {
            niveles(nodo.getDerecho(), cont+1 , N);
            if (cont == N) System.out.print(nodo.getDato());
            niveles(nodo.getDerecho(), cont+1, N);
        }
    }

    public int altura1(NodoAVL<T> nodo) {
    if (nodo == null) {
        return -1; // La altura de un nodo nulo es -1
    } else {
        int alturaIzq = altura1(nodo.getIzquierdo()); // Altura del subárbol izquierdo
        int alturaDer = altura1(nodo.getDerecho()); // Altura del subárbol derecho
        return Math.max(alturaIzq, alturaDer) + 1; // Altura del nodo actual es la máxima altura de sus subárboles + 1
    }
}

    public int altura2(NodoAVL<T> nodo) {
    int izquierda , derecha;
    if (nodo != null){
        if (nodo.getIzquierdo() != null || nodo.getDerecho() != null ) {
            izquierda = altura2(nodo.getIzquierdo());
            derecha = altura2(nodo.getDerecho());
            if(izquierda > derecha){
                return (izquierda + 1);   
            }else return(derecha +1);
        }
    }
    return 0;
}


    public void impirmirNivel(NodoAVL<T> nodo){
        int N,i,cont = 0;
        //N = altura1(nodo);
        N = altura2(nodo);
        if (nodo != null){
            for(i = 0 ; i <= N ; i++){
                niveles(nodo, cont, N);
            }
        } 
    }
}