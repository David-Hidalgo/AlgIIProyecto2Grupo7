package com.AlgIIProyecto2Grupo7.GestionPistas;

import javax.swing.JFrame;
import com.AlgIIProyecto2Grupo7.GestionPistas.lienzoarbol.Lienzo;
import com.AlgIIProyecto2Grupo7.estructuras.ReadWrite;
import com.AlgIIProyecto2Grupo7.estructuras.avl.Pista;
import com.AlgIIProyecto2Grupo7.estructuras.avl.PistaAvl;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;

public class AppGestionPistas {
	public static void main(String[] args) {
			
		
		int nivel = 5;
		int numeroTrampas = 6;
		Lienzo lienzo = new Lienzo();
		
		JFrame ventana = new JFrame();
		ventana.getContentPane().add(lienzo);
		ventana.setDefaultCloseOperation(3);
		ventana.setSize(600, 600);
		ventana.setVisible(true);
		
        System.out.println("Hello, World!");
        ListaVehiculo listaCompetidores = ReadWrite.cargarVehiculosDefault();
		PistaAvl pista = Pista.crearPista(nivel);
		PistaAvl auxAvl = (PistaAvl) pista.clone();
		pista.inOrden();
		Pista.generarTrampas(pista, nivel, numeroTrampas);

		auxAvl=pista.clone();
		pista.inOrden();
		System.out.println("Pista clonada");
		auxAvl.inOrden();
		
		
		listaCompetidores=pista.ListaGanadores(listaCompetidores, lienzo);
        ReadWrite.guardarHistorico(listaCompetidores);
		System.out.println(listaCompetidores);
    }
}
