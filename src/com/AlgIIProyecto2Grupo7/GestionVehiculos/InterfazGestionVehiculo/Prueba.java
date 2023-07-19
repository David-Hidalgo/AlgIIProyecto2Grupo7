package com.AlgIIProyecto2Grupo7.GestionVehiculos.InterfazGestionVehiculo;



import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import com.AlgIIProyecto2Grupo7.Validaciones;
import com.AlgIIProyecto2Grupo7.estructuras.ReadWrite;
import com.AlgIIProyecto2Grupo7.estructuras.Vehiculo;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;

public class Prueba extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Prueba() {
		setLayout(null);
		
		JPanel background = new JPanel();
		background.setBackground(new Color(255, 255, 255));
		background.setBounds(0, 0, 1595, 972);
		add(background);
		background.setLayout(null);
		
		JLabel lblListarVehiculos = new JLabel("Listar Vehiculos");
		lblListarVehiculos.setBounds(64, 96, 403, 56);
		lblListarVehiculos.setFont(new Font("Public Sans", Font.BOLD, 48));
		background.add(lblListarVehiculos);
		
		JPanel headingSeparator = new JPanel();
		headingSeparator.setBounds(64, 164, 133, 4);
		headingSeparator.setBackground(new Color(7, 10, 19));
		background.add(headingSeparator);
		
		JLabel lblVehiculosDisponibles = new JLabel("Vehiculos Disponibles");
		lblVehiculosDisponibles.setBounds(64, 228, 338, 38);
		lblVehiculosDisponibles.setFont(new Font("Public Sans", Font.BOLD, 31));
		background.add(lblVehiculosDisponibles);
		
		JPanel separadorSubtitulo = new JPanel();
		separadorSubtitulo.setBounds(65, 274, 133, 2);
		separadorSubtitulo.setBackground(new Color(7, 10, 19));
		background.add(separadorSubtitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 306, 1279, 497);
		background.add(scrollPane);
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Nombre en Inglés");
		modelo.addColumn("Nombre Conductores");
		modelo.addColumn("Tamaño del Caucho");
		modelo.addColumn("Tipo de Caucho");
		modelo.addColumn("Velocidad Km/h");
		modelo.addColumn("Velocidad");
		modelo.addColumn("R. Obstáculos");
		modelo.addColumn("R. Líquidos");
		modelo.addColumn("R. Explosivos");
		llenarTabla(modelo);
		JTable table = new JTable(modelo);
		scrollPane.setViewportView(table);
		

	}
	
	private void llenarTabla(DefaultTableModel miTabla) {

	
		ListaVehiculo vehiculo = ReadWrite.cargarVehiculosDefault();

		while (vehiculo != null) {
		    Object[] fila = new Object[10];

			fila[0] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getNombreEs();
			fila[1] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getNombreEn();
			fila[2] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getConductores();
			fila[3] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getMotor();

			fila[4] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getTipoCaucho();
			fila[5] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getTamanoCaucho();
			fila[6] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getVelocidad();
			fila[7] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getResBomba();
			fila[8] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getResLiquido();
			fila[9] = vehiculo.getVehiculo(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).getResPiedra();

			miTabla.addRow(fila);
		}

	}
}