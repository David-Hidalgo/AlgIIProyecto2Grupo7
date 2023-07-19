package com.AlgIIProyecto2Grupo7.estructuras.avl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AvlTest {

    private Avl arbol;

    @Before
    public void setUp() throws Exception {
        arbol = new Avl();
    }

    @Test
    public void testInsertar() {
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(50);
        arbol.insertar(25);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(35);
        arbol.insertar(45);
        arbol.insertar(55);
        assertTrue(arbol.existe(10));
        assertTrue(arbol.existe(20));
        assertTrue(arbol.existe(30));
        assertTrue(arbol.existe(40));
        assertTrue(arbol.existe(50));
        assertTrue(arbol.existe(25));
        assertTrue(arbol.existe(5));
        assertTrue(arbol.existe(15));
        assertTrue(arbol.existe(35));
        assertTrue(arbol.existe(45));
        assertTrue(arbol.existe(55));
    }

    @Test
    public void testEliminar() {
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(50);
        arbol.insertar(25);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(35);
        arbol.insertar(45);
        arbol.insertar(55);
        assertTrue(arbol.eliminar(10));
        assertFalse(arbol.existe(10));
        assertTrue(arbol.eliminar(20));
        assertFalse(arbol.existe(20));
        assertTrue(arbol.eliminar(30));
        assertFalse(arbol.existe(30));
        assertTrue(arbol.eliminar(40));
        assertFalse(arbol.existe(40));
        assertTrue(arbol.eliminar(50));
        assertFalse(arbol.existe(50));
        assertTrue(arbol.eliminar(25));
        assertFalse(arbol.existe(25));
        assertTrue(arbol.eliminar(5));
        assertFalse(arbol.existe(5));
        assertTrue(arbol.eliminar(15));
        assertFalse(arbol.existe(15));
        assertTrue(arbol.eliminar(35));
        assertFalse(arbol.existe(35));
        assertTrue(arbol.eliminar(45));
        assertFalse(arbol.existe(45));
        assertTrue(arbol.eliminar(55));
        assertFalse(arbol.existe(55));
    }

    @Test
    public void testExiste() {
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(40);
        arbol.insertar(50);
        arbol.insertar(25);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(35);
        arbol.insertar(45);
        arbol.insertar(55);
        assertTrue(arbol.existe(10));
        assertTrue(arbol.existe(20));
        assertTrue(arbol.existe(30));
        assertTrue(arbol.existe(40));
        assertTrue(arbol.existe(50));
        assertTrue(arbol.existe(25));
        assertTrue(arbol.existe(5));
        assertTrue(arbol.existe(15));
        assertTrue(arbol.existe(35));
        assertTrue(arbol.existe(45));
        assertTrue(arbol.existe(55));
        assertFalse(arbol.existe(100));
    }

}