package com.AlgIIProyecto2Grupo7.estructuras.avl;

import com.AlgIIProyecto2Grupo7.estructuras.Vehiculo;
import java.util.Random;

/**
 * This class represents an AVL tree node that contains a key and two child
 * nodes (left and right).
 * It provides methods to insert, delete and search for nodes in the tree, as
 * well as methods to traverse the tree in-order, pre-order and post-order.
 * The tree is balanced using AVL rotations to ensure that the height difference
 * between the left and right subtrees of any node is at most 1.
 * 
 * @param raiz The root node of the AVL tree.
 */
public class PistaAvl implements Cloneable {
    protected NodoParada raiz;
    private Vehiculo vehiculo;
    protected boolean terminar = false;

    /**
     * Constructores
     */
    public PistaAvl() {
        raiz = null;
    }

    public PistaAvl(int valor) {
        raiz = new NodoParada(valor);
    }

    public PistaAvl(int valor, Vehiculo vehiculo) {
        raiz = new NodoParada(valor);
        this.vehiculo = vehiculo;
    }

    /**
     * Metodos
     */

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * set the vehiculo
     * 
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setRaiz(NodoParada raiz) {
        this.raiz = raiz;
    }

    public NodoParada getRaiz() {
        return raiz;
    }

    /**
     * @param valorInsertar
     * @param distancia
     */
    public void insertarConDistanvia(int valorInsertar, int distancia) {
        if (this.raiz == null) {
            this.raiz = new NodoParada(valorInsertar);
            this.raiz.setDistancia(distancia);
        } else {
            this.raiz = insertarConDistancia(valorInsertar, distancia, this.raiz);
        }
    }

    public void insertar(int valorInsertar) {
        if (this.raiz == null) {
            this.raiz = new NodoParada(valorInsertar);
        } else {
            this.raiz = insertar(valorInsertar, this.raiz);
        }
    }

    private NodoParada rotacionSimpleIzquierda(NodoParada nodo) {
        NodoParada aux = nodo.getHijoIzquierdo();
        nodo.setHijoIzquierdo(aux.getHijoDerecho());
        aux.setHijoDerecho(nodo);
        return aux;
    }

    private NodoParada rotacionSimpleDerecha(NodoParada nodo) {
        NodoParada aux = nodo.getHijoDerecho();
        nodo.setHijoDerecho(aux.getHijoIzquierdo());
        aux.setHijoIzquierdo(nodo);
        return aux;
    }

    private NodoParada rotacionDobleIzquierda(NodoParada nodo) {
        nodo.setHijoIzquierdo(rotacionSimpleDerecha(nodo.getHijoIzquierdo()));
        return rotacionSimpleIzquierda(nodo);

    }

    private NodoParada rotacionDobleDerecha(NodoParada nodo) {
        nodo.setHijoDerecho(rotacionSimpleIzquierda(nodo.getHijoDerecho()));
        return rotacionSimpleDerecha(nodo);
    }

    private NodoParada balancear(NodoParada nodo) {
        NodoParada hijoIzquierdo = nodo.getHijoIzquierdo();
        NodoParada hijoDerecho = nodo.getHijoDerecho();
        int alturaIzquierda = nodo.altura(nodo.getHijoIzquierdo());
        int alturaDerecha = nodo.altura(nodo.getHijoDerecho());

        if (alturaIzquierda - alturaDerecha > 1) {
            if (hijoIzquierdo.altura(hijoIzquierdo.getHijoIzquierdo()) >= hijoIzquierdo
                    .altura(hijoIzquierdo.getHijoDerecho())) {
                nodo = rotacionSimpleIzquierda(nodo);
            } else {
                nodo = rotacionDobleIzquierda(nodo);
            }
        } else if (alturaDerecha - alturaIzquierda > 1) {
            if (hijoDerecho.altura(hijoDerecho.getHijoDerecho()) >= hijoDerecho
                    .altura(hijoDerecho.getHijoIzquierdo())) {
                nodo = rotacionSimpleDerecha(nodo);
            } else {
                nodo = rotacionDobleDerecha(nodo);
            }
        }
        return nodo;
    }

    private NodoParada insertarConDistancia(int valorInsertar, int distancia, NodoParada nodo) {
        if (nodo.getClave() == 0) {
            nodo.setClave(valorInsertar);
        } else {
            if (nodo.getClave() > valorInsertar) {
                if (nodo.getHijoIzquierdo() == null) {
                    nodo.setHijoIzquierdo(new NodoParada(valorInsertar));
                    nodo.getHijoIzquierdo().setDistancia(distancia);
                } else {
                    nodo.setHijoIzquierdo(insertarConDistancia(valorInsertar, distancia, nodo.getHijoIzquierdo()));
                }
            } else if (nodo.getClave() < valorInsertar) {
                if (nodo.getHijoDerecho() == null) {
                    nodo.setHijoDerecho(new NodoParada(valorInsertar));
                    nodo.getHijoDerecho().setDistancia(distancia);
                } else {
                    nodo.setHijoDerecho(insertarConDistancia(valorInsertar, distancia, nodo.getHijoDerecho()));
                }
            }
        }
        return balancear(nodo);
    }

    private NodoParada insertar(int valorInsertar, NodoParada nodo) {
        if (nodo.getClave() == 0) {
            nodo.setClave(valorInsertar);
        } else {
            if (nodo.getClave() > valorInsertar) {
                if (nodo.getHijoIzquierdo() == null) {
                    nodo.setHijoIzquierdo(new NodoParada(valorInsertar));
                } else {
                    nodo.setHijoIzquierdo(insertar(valorInsertar, nodo.getHijoIzquierdo()));
                }
            } else if (nodo.getClave() < valorInsertar) {
                if (nodo.getHijoDerecho() == null) {
                    nodo.setHijoDerecho(new NodoParada(valorInsertar));
                } else {
                    nodo.setHijoDerecho(insertar(valorInsertar, nodo.getHijoDerecho()));
                }
            }
        }
        return balancear(nodo);
    }

    public boolean eliminar(int dato) {
        NodoParada aux = raiz.buscarNodo(dato);
        if (aux != null) {
            if (comprobarHoja(aux, dato)) {
                this.setRaiz(EliminarHoja(this.raiz, dato));
                return (true);
            } else {
                this.setRaiz(EliminarNodo(this.raiz, dato));
                return true;
            }
        } else
            return false;
    }

    private boolean comprobarHoja(NodoParada n, int dato) {

        if (dato == n.getClave()) {
            if ((n.getHijoDerecho() != null) || (n.getHijoIzquierdo() != null)) {
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

    private NodoParada EliminarHoja(NodoParada n, int dato) {
        if (dato == n.getClave()) {

            return null;

        }
        if (dato < n.getClave()) {
            n.setHijoIzquierdo(EliminarHoja(n.getHijoIzquierdo(), dato));
            return balancear(n);

        } else {
            n.setHijoDerecho(EliminarHoja(n.getHijoDerecho(), dato));
            return balancear(n);
        }
    }

    public boolean existe(int dato) {
        return existe(this.raiz, dato);
    }

    private boolean existe(NodoParada n, int dato) {
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

    private NodoParada EliminarNodo(NodoParada n, int dato) {
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

    private NodoParada EliminarRaizIzquierda(NodoParada n) {
        if (n.getHijoIzquierdo().getHijoDerecho() == null) {
            NodoParada aux = n.getHijoDerecho();
            n = n.getHijoIzquierdo();
            n.setHijoDerecho(aux);
        } else {
            NodoParada aux = n.getHijoIzquierdo().getHijoDerecho();
            while (aux.getHijoDerecho() != null) {
                aux = aux.getHijoDerecho();
            }
            int clave = aux.getClave();
            n.setClave(clave);
            if (aux.getHijoIzquierdo() == null) {
                n.setHijoIzquierdo(EliminarHoja(n.getHijoIzquierdo(), clave));
            } else {
                n.setHijoIzquierdo(EliminarNodo(n.getHijoIzquierdo(), clave));
            }
        }
        return balancear(n);
    }

    private NodoParada EliminarRaizDerecha(NodoParada n) {
        if (n.getHijoDerecho().getHijoIzquierdo() == null) {
            NodoParada aux = n.getHijoIzquierdo();
            n = n.getHijoDerecho();
            n.setHijoIzquierdo(aux);
        } else {
            NodoParada aux = n.getHijoDerecho().getHijoIzquierdo();
            while (aux.getHijoIzquierdo() != null) {
                aux = aux.getHijoIzquierdo();
            }
            int clave = aux.getClave();
            n.setClave(clave);
            if (aux.getHijoDerecho() == null) {
                n.setHijoDerecho(EliminarHoja(n.getHijoDerecho(), clave));
            } else {
                n.setHijoDerecho(EliminarNodo(n.getHijoDerecho(), clave));
            }
        }
        return balancear(n);
    }

    /*
     * private boolean existeYEsHoja(NodoAvlKilometro n, int dato) {
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

    public int getCantidadNodos() {
        int i = 0;
        if (raiz != null) {
            return raiz.getCantidadNodos(i);
        } else {
            return 0;
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

    private double penalizar(NodoParada n, Vehiculo v) { //penalizacion por trampa en minutos
        int opc = n.getTrampa().getId();
        double penalizacion;
        switch (opc) {
            case 1:
                penalizacion = (v.getResBomba() * v.getVelocidad() / 60);
                return penalizacion;
            case 2:
                penalizacion = (v.getResPiedra() * v.getVelocidad() / 60);
                return penalizacion;
            case 3:
                penalizacion = (v.getResLiquido() * v.getVelocidad() / 60);
                return penalizacion;
            default:
                return 0;
        }
    }

    public void copiar(PistaAvl pista) {
        if (pista.getRaiz() != null) {
            this.getRaiz().copiar(pista.getRaiz());
        }
    }

    private static double getTiempo(NodoParada n, Vehiculo v) {
        double tiempoMas = ((double) n.getDistancia() / (double) v.getVelocidad()) * 60;
        double tiempoAcumulado = (double) v.getTiempoDeLlegada();
        return tiempoAcumulado + tiempoMas;
    }

    public void simularCarrera(NodoParada n, Vehiculo v) {
        Random random = new Random();
        if (n != null && !terminar) {
            v.setUbicación(n);
            v.setTiempoDeLlegada(getTiempo(n, v));
            v.setDistanciaRecorrida(v.getDistanciaRecorrida() + n.getDistancia());
            if (n.getTrampa() == null) {
                int derechoIzquierdo = random.nextInt(2);
                if (derechoIzquierdo == 0) {
                    do {
                        simularCarrera(n.getHijoIzquierdo(), v);
                        if (n.getHijoIzquierdo() != null) {
                            if (n.getHijoIzquierdo().getTrampa() != null) {
                                eliminar(n.getHijoIzquierdo().getClave());
                            }
                        }
                        if (n.getHijoIzquierdo() == null) {
                            break;
                        }
                    } while (n.getHijoIzquierdo().getTrampa() != null);
                    simularCarrera(n.getHijoIzquierdo(), v);
                } else {
                    do {
                        simularCarrera(n.getHijoDerecho(), v);
                        if (n.getHijoDerecho() != null) {
                            if (n.getHijoDerecho().getTrampa() != null) {
                                eliminar(n.getHijoDerecho().getClave());
                            }

                        }
                        if (n.getHijoDerecho() == null) {
                            break;
                        }
                    } while (n.getHijoDerecho().getTrampa() != null);
                    simularCarrera(n.getHijoDerecho(), v);
                }
            } else {
                v.setTiempoDeLlegada(getTiempo(n, v) + penalizar(n, v));
                v.setDistanciaRecorrida(v.getDistanciaRecorrida() + n.getDistancia());

            }

        } else {

            if (!terminar) {
                System.out.println("Llegaste a la meta en: " + v.getTiempoDeLlegada() + " minutos");
            }
            terminar = true;
            // parar simulacion
        }

    }

    public PistaAvl clone() {
        PistaAvl cloned = new PistaAvl();
        if (this.raiz != null) {
            cloned.raiz = this.raiz.clone();
        }
        return cloned;
    }
}
