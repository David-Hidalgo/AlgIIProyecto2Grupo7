package com.AlgIIProyecto2Grupo7.GestionVehiculos.InterfazGestionVehiculo;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;



import com.AlgIIProyecto2Grupo7.estructuras.ReadWrite;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;

//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

public class Listar extends JFrame implements  MouseListener{

//private JMenuBar mb;
//private JMenu menuAgregar , menuModificar , menuEliminar , menuConsultar , menuListar , menuSalir;
//private JMenuItem miNuevoAgregar;


private JLabel labelModificar;
private ListaVehiculo nueva=ReadWrite.cargarVehiculos();

private JButton menuAgregar , menuModificar , menuEliminar , menuConsultar , menuListar , menuSalir;
private JScrollPane scrollPane;
private JTable tableVehiculos;



	public Listar(){
		getContentPane().setLayout(null);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(87,35,100));
		setIconImage(new ImageIcon(getClass().getResource("imagenesAutosLocos/icono.png")).getImage());
		
	labelModificar = new JLabel("Listar");
		labelModificar.setBounds(40,30,300,50);
		labelModificar.setFont(new Font("Andale Mono",1,40));
		//labelConsultar.setForeground(new Color(235,235,0)); // color amarillo
		labelModificar.setForeground(new Color(200,200,200)); // color gris
		getContentPane().add(labelModificar);

	// menu de botones

	menuAgregar = new JButton("Agregar Vehiculo");
		menuAgregar.setBounds(0,0,200,30);
		menuAgregar.setBackground(new Color(60, 20, 80));
		menuAgregar.setFont(new Font("Andele Mono",1,14));
		menuAgregar.setForeground(new Color(255,255,255));
		menuAgregar.addMouseListener(this);
		menuAgregar.setBorderPainted(false);
		getContentPane().add(menuAgregar);

	menuModificar = new JButton("Modificar Vehiculo");
		menuModificar.setBounds(200,0,200,30);
		menuModificar.setBackground(new Color(60, 20, 80));
		menuModificar.setFont(new Font("Andele Mono",1,14));
		menuModificar.setForeground(new Color(255,255,255));
		menuModificar.addMouseListener(this);
		menuModificar.setBorderPainted(false);
		getContentPane().add(menuModificar);

	menuEliminar = new JButton("Eliminar Vehiculo");
		menuEliminar.setBounds(400,0,200,30);
		menuEliminar.setBackground(new Color(60, 20, 80));
		menuEliminar.setFont(new Font("Andele Mono",1,14));
		menuEliminar.setForeground(new Color(255,255,255));
		menuEliminar.addMouseListener(this);
		menuEliminar.setBorderPainted(false);
		getContentPane().add(menuEliminar);

	menuConsultar = new JButton("Consultar Vehiculo");
		menuConsultar.setBounds(600,0,200,30);
		menuConsultar.setBackground(new Color(60, 20, 80));
		menuConsultar.setFont(new Font("Andele Mono",1,14));
		menuConsultar.setForeground(new Color(255,255,255));
		menuConsultar.addMouseListener(this);
		menuConsultar.setBorderPainted(false);
		getContentPane().add(menuConsultar);

	menuListar = new JButton("Listar Vehiculos");
		menuListar.setBounds(800,0,200,30);
		menuListar.setBackground(new Color(87,35,100));
		menuListar.setFont(new Font("Andele Mono",1,14));
		menuListar.setForeground(new Color(255,255,255));
		menuListar.addMouseListener(this);
		menuListar.setBorderPainted(false);
		getContentPane().add(menuListar);

	menuSalir = new JButton("Salir");
		menuSalir.setBounds(1000,0,200,30);
		menuSalir.setBackground(new Color(60, 20, 80));
		menuSalir.setFont(new Font("Andele Mono",1,14));
		menuSalir.setForeground(new Color(255,255,255));
		menuSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		menuSalir.addMouseListener(this);
		menuSalir.setBorderPainted(false);
		getContentPane().add(menuSalir);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(69, 128, 745, 353);
		getContentPane().add(scrollPane);
		
		tableVehiculos = new JTable();
		tableVehiculos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre Es", "Nombre En", "Conductores", "Motor", "Tipo Caucho", "Tama\u00F1o Caucho", "Velocidad", "ResBomb", "ResObs", "ResLiq"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tableVehiculos);

		//llenar tantas row como vehiculos haya
		


		System.out.println(tableVehiculos.getRowCount());
		tableVehiculos.addRowSelectionInterval(0, nueva.getTamano());
		for (int i = 0; i < nueva.getTamano(); i++) {
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getNombreEs(), i, 0);
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getNombreEn(), i, 1);
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getConductores(), i, 2);
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getMotor(), i, 3);
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getTipoCaucho(), i, 4);
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getTamanoCaucho(), i, 5);
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getVelocidad(), i, 6);
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getResBomba(), i, 7);
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getResPiedra(), i, 8);
			tableVehiculos.setValueAt(nueva.getVehiculo(i).getResLiquido(), i, 9);
		}
		
	}



	public void mouseClicked(MouseEvent e) {
		/* 
				if (evento.getSource() == boton1){
					etiqueta1.setText("Hizo clic en mi bot�n");
				}
				if (evento.getSource() == labelTitulo){
					etiqueta1.setText("Hizo clic en el Titulo");
					*/
/* 
			if(e.getSource() == boton1){
                    
			}
*/
			if(e.getSource() == menuAgregar){
				    Agregar agregar = new Agregar();
	                agregar.setBounds(0,0,1200,750);
	                agregar.setVisible(true);
	                agregar.setResizable(false);
	                agregar.setLocationRelativeTo(null);
                    this.setVisible(false);
			}
			if(e.getSource() == menuModificar){
				
                    ModificarGeneral modificarGeneral = new ModificarGeneral();
                    modificarGeneral.setBounds(0,0,1200,750);
                    modificarGeneral.setVisible(true);
                    modificarGeneral.setResizable(false);
                    modificarGeneral.setLocationRelativeTo(null);
                    this.setVisible(false);
			}
			if(e.getSource() == menuEliminar){
                    Eliminar eliminar = new Eliminar();
	                eliminar.setBounds(0,0,1200,750);
	                eliminar.setVisible(true);
	                eliminar.setResizable(false);
	                eliminar.setLocationRelativeTo(null);
                    this.setVisible(false);
			}
			if(e.getSource() == menuConsultar){
                    ConsultarGeneral consultarGeneral = new ConsultarGeneral();
	                consultarGeneral.setBounds(0,0,1200,750);
	                consultarGeneral.setVisible(true);
	                consultarGeneral.setResizable(false);
	                consultarGeneral.setLocationRelativeTo(null);
                    this.setVisible(false);
			}
			if(e.getSource() == menuListar){
                    Listar listar = new Listar();
	                listar.setBounds(0,0,1200,750);
	                listar.setVisible(true);
	                listar.setResizable(false);
	                listar.setLocationRelativeTo(null);
                    this.setVisible(false);
			}
			if(e.getSource() == menuSalir){

				int respuesta = JOptionPane.showConfirmDialog(this,
				"¿Esta seguro que desea salir?", "Confirmacion",
				JOptionPane.YES_NO_OPTION);
		if (respuesta == JOptionPane.YES_NO_OPTION)
		{
			this.dispose();
		}                
			}
				}
		
			public void mousePressed(MouseEvent e) {
				/* 
				etiqueta1.setText("");
				if (evento.getSource() == boton1){
					etiqueta2.setText("Presiono el bot�n");
				}
				if (evento.getSource() == labelTitulo){
					etiqueta2.setText("Presiono el Titulo");
				}
				*/
/* 
				if(e.getSource() == boton1){
			
                    
			}
*/
			if(e.getSource() == menuAgregar){
			
                
		
			}
			if(e.getSource() == menuModificar){
				
                
			
			}
			if(e.getSource() == menuEliminar){
			
			}
			if(e.getSource() == menuConsultar){
				
			}
			if(e.getSource() == menuListar){
			
			}
			if(e.getSource() == menuSalir){
		
			}
		
		}
		
			public void mouseReleased(MouseEvent e) {
				/* 
				if (evento.getSource() == boton1){
					etiqueta2.setText("Libero el bot�n");
				}
				if (evento.getSource() == labelTitulo){
					etiqueta2.setText("Libero el Titulo");
				}
				*/
			}
		
			public void mouseExited(MouseEvent e) {
				/* 
				if (evento.getSource() == boton1){
					etiqueta1.setText("Salio del bot�n");
				}
				if (evento.getSource() == labelTitulo){
					etiqueta1.setText("Salio del Titulo");
				}
				etiqueta2.setText("");
				*/
			}
		
			public void mouseEntered(MouseEvent e) {
				/* 
				if (evento.getSource() == boton1){
					etiqueta1.setText("Entro a mi bot�n");
				}
				if (evento.getSource() == labelTitulo){
					etiqueta1.setText("Entro al Titulo");
				}
				etiqueta2.setText("");
				*/
			}

	public static void main(String args[]){
	Listar listar = new Listar();
	listar.setBounds(0,0,1200,750);
	listar.setVisible(true);
	listar.setResizable(false);
	listar.setLocationRelativeTo(null);
	}
}
