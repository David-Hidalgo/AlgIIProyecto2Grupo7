package edu.ucab.Estructuras;

public class Prueba {
	public static void main(String[] args) {
		ArbolAVL arbol = new ArbolAVL();
		arbol.insertar(10);
		arbol.insertar(5);
		arbol.insertar(13);
		arbol.insertar(1);
		arbol.insertar(6);
		arbol.insertar(17);

		System.out.println("Preorden");
		arbol.preOrden(arbol.getRaiz());
		System.out.println("Inorden");
		arbol.inOrden(arbol.getRaiz());
		System.out.println("Postorden");
		arbol.postOrden(arbol.getRaiz());
		
	}
}
