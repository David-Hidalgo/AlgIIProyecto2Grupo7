package com.AlgIIProyecto2Grupo7.GestionVehiculos.InterfazGestionVehiculo;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.awt.*;

//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

public class ConsultarGeneral extends JFrame implements MouseListener {

	// private JMenuBar mb;
	// private JMenu menuAgregar , menuModificar , menuEliminar , menuConsultar ,
	// menuListar , menuSalir;
	// private JMenuItem miNuevoAgregar;
	private JLabel labelNombreEnEspanol, labelNombreIngles, labelNombreConductor, labelTipoDeCaucho;
	private JLabel labelTamanoDeCaucho, labelVelocidadDelVehiculo, labelResistenciaBomba;
	private JLabel labelResistenciaPiedra, labelResistenciaLiquido, labelComoSeVe ;

	private JLabel labelModificar,labelOpcion;

	private JTextField txtNombreEnEspanol, txtNombreIngles, txtNombreConductor,txtOpcion;
	private JTextField txtVelocidadDelVehiculo, txtResistenciaBomba, txtResistenciaPiedra;
	private JTextField txtResistenciaLiquido;
	private JComboBox comboTipoDeCaucho, comboTamanoDeCaucho, comboComoSeVe;
	private JButton boton1, menuAgregar, menuModificar, menuEliminar, menuConsultar, menuListar, menuSalir;

	public ConsultarGeneral() {
		setLayout(null);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(87, 35, 100));
		setIconImage(new ImageIcon(getClass().getResource("imagenesAutosLocos/icono.png")).getImage());
		// colocar imagen de fondo
		/*
		 * mb = new JMenuBar();
		 * mb.setBackground(new Color(87,35,100));
		 * setJMenuBar(mb);
		 * 
		 * menuAgregar = new JMenu("Agregar");
		 * menuAgregar.setBackground(new Color(87,35,100));
		 * menuAgregar.setFont(new Font("Andele Mono",1,14));
		 * menuAgregar.setForeground(new Color(255,255,255));
		 * mb.add(menuAgregar);
		 * menuAgregar.addMouseListener(this);
		 * 
		 * menuModificar = new JMenu("Modificar");
		 * menuModificar.setBackground(new Color(87,35,100));
		 * menuModificar.setFont(new Font("Andele Mono",1,14));
		 * menuModificar.setForeground(new Color(255,255,255));
		 * mb.add(menuModificar);
		 * menuModificar.addMouseListener(this);
		 * 
		 * menuEliminar = new JMenu("Eliminar");
		 * menuEliminar.setBackground(new Color(87,35,100));
		 * menuEliminar.setFont(new Font("Andele Mono",1,14));
		 * menuEliminar.setForeground(new Color(255,255,255));
		 * mb.add(menuEliminar);
		 * menuEliminar.addMouseListener(this);
		 * 
		 * menuConsultar = new JMenu("Consultar");
		 * menuConsultar.setBackground(new Color(87,35,100));
		 * menuConsultar.setFont(new Font("Andele Mono",1,14));
		 * menuConsultar.setForeground(new Color(255,255,255));
		 * mb.add(menuConsultar);
		 * menuConsultar.addMouseListener(this);
		 * 
		 * menuListar = new JMenu("Listar");
		 * menuListar.setBackground(new Color(87,35,100));
		 * menuListar.setFont(new Font("Andele Mono",1,14));
		 * menuListar.setForeground(new Color(255,255,255));
		 * mb.add(menuListar);
		 * menuListar.addMouseListener(this);
		 * 
		 * menuSalir = new JMenu("Salir");
		 * menuSalir.setBackground(new Color(87,35,100));
		 * menuSalir.setFont(new Font("Andele Mono",1,14));
		 * menuSalir.setForeground(new Color(255,255,255));
		 * mb.add(menuSalir);
		 * menuSalir.addMouseListener(this);
		 */

		/*
		 * miNuevoAgregar = new JMenuItem("Nuevo");
		 * miNuevoAgregar.setFont(new Font("Andale Mono", 1,14));
		 * miNuevoAgregar.setForeground(new Color(87,35,100));
		 * menuAgregar.add(miNuevoAgregar);
		 * miNuevoAgregar.addMouseListener(this);
		 * 
		 */

		// ------------------------------------------------

		/*
		 * 
		 * label2 = new JLabel("Sistema de Gestion de Vehiculos");
		 * label2.setBounds(35,135,300,30);
		 * label2.setFont(new Font("Andale Mono", 3,18));
		 * label2.setForeground(new Color(255,255,255));
		 * add(label2);
		 * 
		 * label3 = new JLabel("Ingrese su nombre");
		 * label3.setBounds(45,212,200,30);
		 * label3.setFont(new Font("Andale Mono", 1,12));
		 * label3.setForeground(new Color(255,255,255));
		 * add(label3);
		 * 
		 * label4 = new JLabel("Universidad Catolica Andres Bello");
		 * label4.setBounds(85,375,300,30);
		 * label4.setFont(new Font("Andale Mono", 1,12));
		 * label4.setForeground(new Color(255,255,255));
		 * add(label4);
		 * 
		 * textfield1 = new JTextField();
		 * textfield1.setBounds(45,240,255,25);
		 * textfield1.setBackground(new Color(224,224,224));
		 * textfield1.setFont(new Font("Andale Mono", 1,14));
		 * textfield1.setForeground(new Color(87,35,100));
		 * add(textfield1);
		 * 
		 */

		boton1 = new JButton("Buscar Vehiculo");
		boton1.setBounds(475, 600, 200, 30);
		boton1.setBackground(new Color(255, 255, 255));
		boton1.setFont(new Font("Andale Mono", 1, 14));
		boton1.setForeground(new Color(87, 35, 100));
		boton1.addMouseListener(this);
		add(boton1);

		labelModificar = new JLabel("Consultar");
		labelModificar.setBounds(40, 30, 300, 50);
		labelModificar.setFont(new Font("Andale Mono", 1, 40));
		// labelConsultar.setForeground(new Color(235,235,0)); // color amarillo
		labelModificar.setForeground(new Color(200, 200, 200)); // color gris
		add(labelModificar);

		// menu de botones

		menuAgregar = new JButton("Agregar Vehiculo");
		menuAgregar.setBounds(0, 0, 200, 30);
		menuAgregar.setBackground(new Color(60, 20, 80));
		menuAgregar.setFont(new Font("Andele Mono", 1, 14));
		menuAgregar.setForeground(new Color(255, 255, 255));
		menuAgregar.addMouseListener(this);
		menuAgregar.setBorderPainted(false);
		add(menuAgregar);

		menuModificar = new JButton("Modificar Vehiculo");
		menuModificar.setBounds(200, 0, 200, 30);
		menuModificar.setBackground(new Color(60, 20, 80));
		menuModificar.setFont(new Font("Andele Mono", 1, 14));
		menuModificar.setForeground(new Color(255, 255, 255));
		menuModificar.addMouseListener(this);
		menuModificar.setBorderPainted(false);
		add(menuModificar);

		menuEliminar = new JButton("Eliminar Vehiculo");
		menuEliminar.setBounds(400, 0, 200, 30);
		menuEliminar.setBackground(new Color(60, 20, 80));
		menuEliminar.setFont(new Font("Andele Mono", 1, 14));
		menuEliminar.setForeground(new Color(255, 255, 255));
		menuEliminar.addMouseListener(this);
		menuEliminar.setBorderPainted(false);
		add(menuEliminar);

		menuConsultar = new JButton("Consultar Vehiculo");
		menuConsultar.setBounds(600, 0, 200, 30);
		menuConsultar.setBackground(new Color(87, 35, 100));
		menuConsultar.setFont(new Font("Andele Mono", 1, 14));
		menuConsultar.setForeground(new Color(255, 255, 255));
		menuConsultar.addMouseListener(this);
		menuConsultar.setBorderPainted(false);
		add(menuConsultar);

		menuListar = new JButton("Listar Vehiculos");
		menuListar.setBounds(800, 0, 200, 30);
		menuListar.setBackground(new Color(60, 20, 80));
		menuListar.setFont(new Font("Andele Mono", 1, 14));
		menuListar.setForeground(new Color(255, 255, 255));
		menuListar.addMouseListener(this);
		menuListar.setBorderPainted(false);
		add(menuListar);

		menuSalir = new JButton("Salir");
		menuSalir.setBounds(1000, 0, 200, 30);
		menuSalir.setBackground(new Color(60, 20, 80));
		menuSalir.setFont(new Font("Andele Mono", 1, 14));
		menuSalir.setForeground(new Color(255, 255, 255));
		menuSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		menuSalir.addMouseListener(this);
		menuSalir.setBorderPainted(false);
		add(menuSalir);

		labelOpcion = new JLabel("Elige opcion:");
	labelOpcion.setBounds(225,520,300,30);
	labelOpcion.setFont(new Font("Andale Mono",1,20));
	labelOpcion.setForeground(new Color(255,255,255));
	add(labelOpcion);

	txtOpcion = new JTextField();
	txtOpcion.setBounds(525,520,300,30);
	txtOpcion.setBackground(new java.awt.Color(224,224,224));
	txtOpcion.setFont(new java.awt.Font("Andale Mono",1,14));
	txtOpcion.setForeground(new java.awt.Color(87,35,100));
	add(txtOpcion);


	}

	public void mouseClicked(MouseEvent e) {
		/*
		 * if (evento.getSource() == boton1){
		 * etiqueta1.setText("Hizo clic en mi bot�n");
		 * }
		 * if (evento.getSource() == labelTitulo){
		 * etiqueta1.setText("Hizo clic en el Titulo");
		 */
		if (e.getSource() == boton1) {
			ConsultarPreciso consultar = new ConsultarPreciso();
			consultar.setBounds(0, 0, 1200, 750);
			consultar.setVisible(true);
			consultar.setResizable(false);
			consultar.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == menuAgregar) {
			Agregar agregar = new Agregar();
			agregar.setBounds(0, 0, 1200, 750);
			agregar.setVisible(true);
			agregar.setResizable(false);
			agregar.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == menuModificar) {

			ModificarGeneral modificarGeneral = new ModificarGeneral();
			modificarGeneral.setBounds(0, 0, 1200, 750);
			modificarGeneral.setVisible(true);
			modificarGeneral.setResizable(false);
			modificarGeneral.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == menuEliminar) {
			Eliminar eliminar = new Eliminar();
			eliminar.setBounds(0, 0, 1200, 750);
			eliminar.setVisible(true);
			eliminar.setResizable(false);
			eliminar.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == menuConsultar) {
			ConsultarGeneral consultarGeneral = new ConsultarGeneral();
			consultarGeneral.setBounds(0, 0, 1200, 750);
			consultarGeneral.setVisible(true);
			consultarGeneral.setResizable(false);
			consultarGeneral.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == menuListar) {
			Listar listar = new Listar();
			listar.setBounds(0, 0, 1200, 750);
			listar.setVisible(true);
			listar.setResizable(false);
			listar.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == menuSalir) {
			int respuesta = JOptionPane.showConfirmDialog(this,
					"¿Esta seguro que desea salir?", "Confirmacion",
					JOptionPane.YES_NO_OPTION);
			if (respuesta == JOptionPane.YES_NO_OPTION) {
				this.dispose();
			}
		}

	}

	public void mousePressed(MouseEvent e) {
		/*
		 * etiqueta1.setText("");
		 * if (evento.getSource() == boton1){
		 * etiqueta2.setText("Presiono el bot�n");
		 * }
		 * if (evento.getSource() == labelTitulo){
		 * etiqueta2.setText("Presiono el Titulo");
		 * }
		 */

		if (e.getSource() == boton1) {

		}
		if (e.getSource() == menuAgregar) {

		}
		if (e.getSource() == menuModificar) {

		}
		if (e.getSource() == menuEliminar) {

		}
		if (e.getSource() == menuConsultar) {

		}
		if (e.getSource() == menuListar) {

		}
		if (e.getSource() == menuSalir) {

		}

	}

	public void mouseReleased(MouseEvent e) {
		/*
		 * if (evento.getSource() == boton1){
		 * etiqueta2.setText("Libero el bot�n");
		 * }
		 * if (evento.getSource() == labelTitulo){
		 * etiqueta2.setText("Libero el Titulo");
		 * }
		 */
	}

	public void mouseExited(MouseEvent e) {
		/*
		 * if (evento.getSource() == boton1){
		 * etiqueta1.setText("Salio del bot�n");
		 * }
		 * if (evento.getSource() == labelTitulo){
		 * etiqueta1.setText("Salio del Titulo");
		 * }
		 * etiqueta2.setText("");
		 */
	}

	public void mouseEntered(MouseEvent e) {
		/*
		 * if (evento.getSource() == boton1){
		 * etiqueta1.setText("Entro a mi bot�n");
		 * }
		 * if (evento.getSource() == labelTitulo){
		 * etiqueta1.setText("Entro al Titulo");
		 * }
		 * etiqueta2.setText("");
		 */
	}

	public static void main(String args[]) {
		ConsultarGeneral consultarGeneral = new ConsultarGeneral();
		consultarGeneral.setBounds(0, 0, 1200, 750);
		consultarGeneral.setVisible(true);
		consultarGeneral.setResizable(false);
		consultarGeneral.setLocationRelativeTo(null);
	}
}
