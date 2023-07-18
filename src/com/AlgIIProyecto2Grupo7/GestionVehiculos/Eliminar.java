package com.AlgIIProyecto2Grupo7.GestionVehiculos;

	import javax.swing.*;
	import java.awt.event.*;
	import java.awt.*;
	
	public class Eliminar extends JFrame implements ActionListener{
	
	//private JMenuBar mb;
	//private JMenu menuAgregar , menuModificar , menuEliminar , menuConsultar , menuListar , menuSalir;
	//private JMenuItem miNuevoAgregar;
	private JLabel labelNombreEnEspanol , labelNombreIngles , labelNombreConductor , labelTipoDeCaucho ;
	private JLabel labelTamanoDeCaucho , labelVelocidadDelVehiculo , labelResistenciaBomba ;
	private JLabel labelResistenciaPiedra , labelResistenciaLiquido , labelComoSeVe;
	
	private JLabel labelEliminar;
	
	private JTextField txtNombreEnEspanol , txtNombreIngles , txtNombreConductor  ;
	private JTextField txtVelocidadDelVehiculo , txtResistenciaBomba ,txtResistenciaPiedra ;
	private JTextField txtResistenciaLiquido  ;
	private JComboBox comboTipoDeCaucho,comboTamanoDeCaucho,comboComoSeVe ;
	private JButton boton1 , menuAgregar , menuModificar , menuEliminar , menuConsultar , menuListar , menuSalir;
	
	
		public Eliminar(){
		setLayout(null);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(87,35,100));
	setIconImage(new ImageIcon(getClass().getResource("imagenesAutosLocos/icono.png")).getImage());
		// colocar imagen de fondo 
	
	/* 
		mb = new JMenuBar();
		mb.setBackground(new Color(87,35,100));
		setJMenuBar(mb);
	
		menuAgregar = new JMenu("Agregar");
		menuAgregar.setBackground(new Color(87,35,100));
		menuAgregar.setFont(new Font("Andele Mono",1,14));
		menuAgregar.setForeground(new Color(255,255,255));
		mb.add(menuAgregar);
		menuAgregar.addActionListener(this);
	
		menuModificar = new JMenu("Modificar");
		menuModificar.setBackground(new Color(87,35,100));
		menuModificar.setFont(new Font("Andele Mono",1,14));
		menuModificar.setForeground(new Color(255,255,255));
		mb.add(menuModificar);
		menuModificar.addActionListener(this);
	
		menuEliminar = new JMenu("Eliminar");
		menuEliminar.setBackground(new Color(87,35,100));
		menuEliminar.setFont(new Font("Andele Mono",1,14));
		menuEliminar.setForeground(new Color(255,255,255));
		mb.add(menuEliminar);
		menuEliminar.addActionListener(this);
	
		menuConsultar = new JMenu("Consultar");
		menuConsultar.setBackground(new Color(87,35,100));
		menuConsultar.setFont(new Font("Andele Mono",1,14));
		menuConsultar.setForeground(new Color(255,255,255));
		mb.add(menuConsultar);
		menuConsultar.addActionListener(this);
	
		menuListar = new JMenu("Listar");
		menuListar.setBackground(new Color(87,35,100));
		menuListar.setFont(new Font("Andele Mono",1,14));
		menuListar.setForeground(new Color(255,255,255));
		mb.add(menuListar);
		menuListar.addActionListener(this);
	
		menuSalir = new JMenu("Salir");
		menuSalir.setBackground(new Color(87,35,100));
		menuSalir.setFont(new Font("Andele Mono",1,14));
		menuSalir.setForeground(new Color(255,255,255));
		mb.add(menuSalir);
		menuSalir.addActionListener(this);
	
	*/
	
	/*
		miNuevoAgregar = new JMenuItem("Nuevo");
		miNuevoAgregar.setFont(new Font("Andale Mono", 1,14));
		miNuevoAgregar.setForeground(new Color(87,35,100));
		menuAgregar.add(miNuevoAgregar);
		miNuevoAgregar.addActionListener(this);
	*/
	
		//------------------------------------------------
		
	
	
		labelEliminar = new JLabel("Eliminar");
		labelEliminar.setBounds(40,30,300,50);
		labelEliminar.setFont(new Font("Andale Mono",1,40));
		//labelEliminar.setForeground(new Color(235,235,0)); // color amarillo
		labelEliminar.setForeground(new Color(200,200,200)); // color gris
		add(labelEliminar);
		
			
		//comboComoSeVe = newJ ComboBox();
	//	
	
		
	
	
	/*
	
		label2 = new JLabel("Sistema de Gestion de Vehiculos");
		label2.setBounds(35,135,300,30);
		label2.setFont(new Font("Andale Mono", 3,18));
		label2.setForeground(new Color(255,255,255));
		add(label2);
	
		label3 = new JLabel("Ingrese su nombre");
		label3.setBounds(45,212,200,30);
		label3.setFont(new Font("Andale Mono", 1,12));
		label3.setForeground(new Color(255,255,255));
		add(label3);
	
		label4 = new JLabel("Universidad Catolica Andres Bello");
		label4.setBounds(85,375,300,30);
		label4.setFont(new Font("Andale Mono", 1,12));
		label4.setForeground(new Color(255,255,255));
		add(label4);
		
		textfield1 = new JTextField();
		textfield1.setBounds(45,240,255,25);
		textfield1.setBackground(new Color(224,224,224));
		textfield1.setFont(new Font("Andale Mono", 1,14));
		textfield1.setForeground(new Color(87,35,100));
		add(textfield1);
	
	*/
	
		boton1 = new JButton("Confirmar eliminar");
		boton1.setBounds(550,600,200,30);
		boton1.setBackground(new Color(255,255,255));
		boton1.setFont(new Font("Andale Mono", 1,14));
		boton1.setForeground(new Color(87,35,100));
		boton1.addActionListener(this);
		add(boton1);
	
	
	// menu de botones
	
	menuAgregar = new JButton("Agregar Vehiculo");
		menuAgregar.setBounds(0,0,200,30);
		menuAgregar.setBackground(new Color(60, 20, 80));
		menuAgregar.setFont(new Font("Andele Mono",1,14));
		menuAgregar.setForeground(new Color(255,255,255));
		menuAgregar.addActionListener(this);
		menuAgregar.setBorderPainted(false);
		add(menuAgregar);
	
	menuModificar = new JButton("Modificar Vehiculo");
		menuModificar.setBounds(200,0,200,30);
		menuModificar.setBackground(new Color(60, 20, 80));
		menuModificar.setFont(new Font("Andele Mono",1,14));
		menuModificar.setForeground(new Color(255,255,255));
		menuModificar.addActionListener(this);
		menuModificar.setBorderPainted(false);
		add(menuModificar);
	
	menuEliminar = new JButton("Eliminar Vehiculo");
		menuEliminar.setBounds(400,0,200,30);
		menuEliminar.setBackground(new Color(60, 20, 80));
		menuEliminar.setFont(new Font("Andele Mono",1,14));
		menuEliminar.setForeground(new Color(255,255,255));
		menuEliminar.addActionListener(this);
		menuEliminar.setBorderPainted(false);
		add(menuEliminar);
	
	menuConsultar = new JButton("Consultar Vehiculo");
		menuConsultar.setBounds(600,0,200,30);
		menuConsultar.setBackground(new Color(60, 20, 80));
		menuConsultar.setFont(new Font("Andele Mono",1,14));
		menuConsultar.setForeground(new Color(255,255,255));
		menuConsultar.addActionListener(this);
		menuConsultar.setBorderPainted(false);
		add(menuConsultar);
	
	menuListar = new JButton("Listar Vehiculos");
		menuListar.setBounds(800,0,200,30);
		menuListar.setBackground(new Color(60, 20, 80));
		menuListar.setFont(new Font("Andele Mono",1,14));
		menuListar.setForeground(new Color(255,255,255));
		menuListar.addActionListener(this);
		menuListar.setBorderPainted(false);
		add(menuListar);
	
	menuSalir = new JButton("Salir");
		menuSalir.setBounds(1000,0,200,30);
		menuSalir.setBackground(new Color(60, 20, 80));
		menuSalir.setFont(new Font("Andele Mono",1,14));
		menuSalir.setForeground(new Color(255,255,255));
		menuSalir.addActionListener(this);
		menuSalir.setBorderPainted(false);
		add(menuSalir);
	
	
	
		}
	
		public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
		
		 }
		if(e.getSource() == menuAgregar){
			Agregar agregar = new Agregar();
			agregar.setBounds(0,0,1200,750);
			agregar.setVisible(true);
			agregar.setResizable(false);
			agregar.setLocationRelativeTo(null);
			this.setVisible(false);
		 }
		if(e.getSource() == menuModificar){
			Modificar modificar = new Modificar();
			modificar.setBounds(0,0,1200,750);
			modificar.setVisible(true);
			modificar.setResizable(false);
			modificar.setLocationRelativeTo(null);
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
			Consultar consultar = new Consultar();
			consultar.setBounds(0,0,1200,750);
			consultar.setVisible(true);
			consultar.setResizable(false);
			consultar.setLocationRelativeTo(null);
			this.setVisible(false);
		 }
		if(e.getSource() == menuListar){
		
		 }
		if(e.getSource() == menuSalir){
		
		 }
		}
	
		public static void main(String args[]){
		Eliminar eliminar = new Eliminar();
		eliminar.setBounds(0,0,1200,750);
		eliminar.setVisible(true);
		eliminar.setResizable(false);
		eliminar.setLocationRelativeTo(null);
	
		
	
		}
	
	
	
	
	}







