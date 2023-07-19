package com.AlgIIProyecto2Grupo7.estructuras;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;


public class ReadWrite {

	/**
	 * Funcion que carga los vehiculos del archivo vehiculosDefault.txt en la lista de vehiculos
	 */
	public static ListaVehiculo cargarVehiculosDefault() {
		ListaVehiculo nuevaListaVehiculo = new ListaVehiculo();
		File foo = new File("src\\com\\AlgIIProyecto2Grupo7\\archivos\\vehiculosDefault.txt");
		try {
			FileReader reader = new FileReader(foo);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] datos = line.split("/");
				Vehiculo vehiculo = new Vehiculo(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9]);
				nuevaListaVehiculo.insertarFinal(vehiculo);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return nuevaListaVehiculo;
	}
	public static ListaVehiculo cargarVehiculos() {
		ListaVehiculo nuevaListaVehiculo = new ListaVehiculo();
		File foo = new File("src\\com\\AlgIIProyecto2Grupo7\\archivos\\vehiculos.txt");
		try {
			FileReader reader = new FileReader(foo);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] datos = line.split("/");
				Vehiculo vehiculo = new Vehiculo(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9]);
				nuevaListaVehiculo.insertarFinal(vehiculo);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return nuevaListaVehiculo;
	}

	public static void guardarVehiculos(ListaVehiculo listaVehiculo) {
		FileWriter writer;
		try {
			writer = new FileWriter("src\\com\\AlgIIProyecto2Grupo7\\archivos\\vehiculos.txt", false);
			System.out.println(listaVehiculo.toString());
			writer.write(listaVehiculo.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void guardarHistorico(ListaVehiculo listaVehiculo) {
		FileWriter writer;
		try {
			writer = new FileWriter("src\\com\\AlgIIProyecto2Grupo7\\archivos\\vehiculos.txt", true);
			writer.write("\n");
			writer.write(listaVehiculo.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ListaVehiculo nueva =cargarVehiculosDefault();
		guardarVehiculos(nueva);
		nueva.esVacia();
	}
}
