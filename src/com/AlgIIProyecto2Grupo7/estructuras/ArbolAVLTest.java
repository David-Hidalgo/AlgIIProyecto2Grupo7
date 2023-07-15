package com.AlgIIProyecto2Grupo7.estructuras;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArbolAVLTest {

    private ArbolAVL<Integer> arbol;

    @BeforeEach
    public void setUp() {
        arbol = new ArbolAVL<>();
    }

    @Test
    public void testInsertar() {
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(8);

        Assertions.assertTrue(arbol.buscar(5));
        Assertions.assertTrue(arbol.buscar(3));
        Assertions.assertTrue(arbol.buscar(7));
        Assertions.assertTrue(arbol.buscar(2));
        Assertions.assertTrue(arbol.buscar(4));
        Assertions.assertTrue(arbol.buscar(6));
        Assertions.assertTrue(arbol.buscar(8));
    }

    @Test
    public void testEliminar() {
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(8);

        arbol.eliminar(5);
        arbol.eliminar(3);
        arbol.eliminar(7);

        Assertions.assertFalse(arbol.buscar(5));
        Assertions.assertFalse(arbol.buscar(3));
        Assertions.assertFalse(arbol.buscar(7));
        Assertions.assertTrue(arbol.buscar(2));
        Assertions.assertTrue(arbol.buscar(4));
        Assertions.assertTrue(arbol.buscar(6));
        Assertions.assertTrue(arbol.buscar(8));
    }

    @Test
    public void testInOrden() {
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(8);

        arbol.inOrden(); // should print "2 3 4 5 6 7 8"
    }

    @Test
    public void testPostOrden() {
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(8);

        arbol.postOrden(); // should print "2 4 3 6 8 7 5"
    }

    @Test
    public void testPreOrden() {
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(8);

        arbol.preOrden(); // should print "5 3 2 4 7 6 8"
    }
}