package com.AlgIIProyecto2Grupo7.estructuras.avl;

import com.AlgIIProyecto2Grupo7.estructuras.avl.Avl;
import com.AlgIIProyecto2Grupo7.estructuras.avl.Nodo;

public class AvlTest{

    public static void main(String[] args) {
        Avl avl = new Avl();

        // Test inserting values
        avl.insertar(10);
        avl.insertar(20);
        avl.insertar(30);
        avl.insertar(40);
        avl.insertar(50);
        avl.insertar(25);

        // Test in-order traversal
        System.out.println("In-order traversal:");
        avl.inOrden(); // Expected output: 10 20 25 30 40 50

        // Test pre-order traversal
        System.out.println("\nPre-order traversal:");
        avl.preOrden(); // Expected output: 30 20 10 25 40 50

        // Test post-order traversal
        System.out.println("\nPost-order traversal:");
        avl.postOrden(); // Expected output: 10 25 20 50 40 30

        // Test deleting a leaf node
        System.out.println("\nDeleting leaf node 25:");
        avl.eliminar(25);
        avl.inOrden(); // Expected output: 10 20 30 40 50

        // Test deleting a node with one child
        System.out.println("\nDeleting node 20 with one child:");
        avl.eliminar(20);
        avl.inOrden(); // Expected output: 10 30 40 50

        // Test deleting the root node
        System.out.println("\nDeleting root node 30:");
        avl.eliminar(30);
        avl.inOrden(); // Expected output: 10 40 50

        // Test deleting a non-existent node
        System.out.println("\nDeleting non-existent node 60:");
        boolean deleted = avl.eliminar(60);
        System.out.println("Node deleted: " + deleted); // Expected output: false

        // Test checking if a value exists in the tree
        System.out.println("\nChecking if value 40 exists:");
        boolean exists = avl.existe(40);
        System.out.println("Value exists: " + exists); // Expected output: true

        // Test checking if a non-existent value exists in the tree
        System.out.println("\nChecking if value 60 exists:");
        exists = avl.existe(60);
        System.out.println("Value exists: " + exists); // Expected output: false
    }
}