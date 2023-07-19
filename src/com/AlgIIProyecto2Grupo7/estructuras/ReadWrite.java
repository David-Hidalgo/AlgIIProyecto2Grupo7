package com.AlgIIProyecto2Grupo7.estructuras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.AlgIIProyecto2Grupo7.estructuras.Vehiculo;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;


public class ReadWrite {

	/**
	 * Funcion que carga los vehiculos del archivo vehiculosDefault.txt en la lista de vehiculos
	 */
	public static ListaVehiculo cargarVehiculosDefault() {
		ListaVehiculo nuevaListaVehiculo = new ListaVehiculo();
		
		final String ruta = "src\\com\\AlgIIProyecto2Grupo7\\archivos\\vehiculosDefault.txt";
		File foo = new File(ruta);
		try {
			FileReader reader = new FileReader(foo);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] datos = line.split("/");
				Vehiculo vehiculo = new Vehiculo(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9]);
				nuevaListaVehiculo.insertarInicio(vehiculo);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return nuevaListaVehiculo;
	}

	public static void main(String[] args) {
		ListaVehiculo nueva =cargarVehiculosDefault();
		nueva.esVacia();
	}
}
