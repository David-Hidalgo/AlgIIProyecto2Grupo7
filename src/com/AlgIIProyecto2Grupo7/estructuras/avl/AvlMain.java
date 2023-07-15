package com.AlgIIProyecto2Grupo7.estructuras.avl;

public class AvlMain {

    public static void main(String[] args) {
        int n =10;
        Avl ArbolAVL = new Avl(15);
        ArbolAVL.insertar(9);
        ArbolAVL.insertar(10);
        ArbolAVL.insertar(11);
        ArbolAVL.insertar(12);
        ArbolAVL.insertar(13);
        ArbolAVL.insertar(14);
        ArbolAVL.insertar(15);
        ArbolAVL.insertar(1);
        ArbolAVL.insertar(2);
        ArbolAVL.insertar(3);
        ArbolAVL.insertar(4);
        ArbolAVL.insertar(5);
        ArbolAVL.insertar(6);
        ArbolAVL.insertar(7);
        ArbolAVL.insertar(8);
        ArbolAVL.insertar(19);
        ArbolAVL.insertar(18);
        ArbolAVL.insertar(17);
        ArbolAVL.insertar(16);
        ArbolAVL.inOrden();
        System.out.println("Prueba borrar " + n);
        ArbolAVL.eliminar(n);
        ArbolAVL.inOrden();
    }
}
