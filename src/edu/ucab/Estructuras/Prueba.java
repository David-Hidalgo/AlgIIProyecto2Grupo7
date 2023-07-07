package edu.ucab.Estructuras;

public class Prueba {
	public static void main(String[] args) {
		ArbolAVL arbol = new ArbolAVL();

		arbol.insertar(1);
		arbol.insertar(13);
		arbol.insertar(18);
		arbol.insertar(9);
		arbol.insertar(15);
		arbol.insertar(4);
		arbol.preOrden(arbol.getRaiz());
		System.out.println();
		arbol.inOrden(arbol.getRaiz());
		System.out.println();
		arbol.postOrden(arbol.getRaiz());
		System.out.println();
	}
}
