package com.AlgIIProyecto2Grupo7.GestionVehiculos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Modificar extends JFrame implements ActionListener{

//private JMenuBar mb;
//private JMenu menuAgregar , menuModificar , menuEliminar , menuConsultar , menuListar , menuSalir;
//private JMenuItem miNuevoAgregar;
private JLabel labelNombreEnEspanol , labelNombreIngles , labelNombreConductor , labelTipoDeCaucho ;
private JLabel labelTamanoDeCaucho , labelVelocidadDelVehiculo , labelResistenciaBomba ;
private JLabel labelResistenciaPiedra , labelResistenciaLiquido , labelComoSeVe;

private JLabel labelModificar;

private JTextField txtNombreEnEspanol , txtNombreIngles , txtNombreConductor  ;
private JTextField txtVelocidadDelVehiculo , txtResistenciaBomba ,txtResistenciaPiedra ;
private JTextField txtResistenciaLiquido  ;
private JComboBox comboTipoDeCaucho,comboTamanoDeCaucho,comboComoSeVe ;
private JButton boton1,menuAgregar , menuModificar , menuEliminar , menuConsultar , menuListar , menuSalir;



	public Modificar(){
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
	labelComoSeVe = new JLabel("como se ve:");
	labelComoSeVe.setBounds(225,110,300,30);
	labelComoSeVe.setFont(new Font("Andale Mono",1,20));
	labelComoSeVe.setForeground(new Color(255,255,255));
	add(labelComoSeVe);


	labelModificar = new JLabel("Modificar");
	labelModificar.setBounds(40,30,300,50);
	labelModificar.setFont(new Font("Andale Mono",1,40));
	//labelConsultar.setForeground(new Color(235,235,0)); // color amarillo
	labelModificar.setForeground(new Color(200,200,200)); // color gris
	add(labelModificar);
	

	// aqui debe ir el cambo de como se ve la imgen
	ImageIcon imagen1 = new ImageIcon("imagenesAutosLocos/carro1.jpg");
	ImageIcon imagen2 = new ImageIcon("imagenesAutosLocos/carro2.jpg");
	ImageIcon imagen3 = new ImageIcon("imagenesAutosLocos/carro3.jpg");
	ImageIcon imagen4 = new ImageIcon("imagenesAutosLocos/carro4.jpg");
	ImageIcon imagen5 = new ImageIcon("imagenesAutosLocos/carro5.jpg");
	ImageIcon imagen6 = new ImageIcon("imagenesAutosLocos/carro6.jpg");
	ImageIcon imagen7 = new ImageIcon("imagenesAutosLocos/carro7.jpg");
	ImageIcon imagen8 = new ImageIcon("imagenesAutosLocos/carro8.jpg");
	ImageIcon imagen9 = new ImageIcon("imagenesAutosLocos/carro9.jpg");
	ImageIcon imagen10 = new ImageIcon("imagenesAutosLocos/carro10.jpg");
	ImageIcon imagen11 = new ImageIcon("imagenesAutosLocos/carro11.jpg");
		
	//comboComoSeVe = newJ ComboBox();
	JComboBox<ImageIcon> comboComoSeVe = new JComboBox<>();
	comboComoSeVe.setBounds(525,60,300,160);
	comboComoSeVe.setBackground(new java.awt.Color(224,224,224));
	comboComoSeVe.setFont(new java.awt.Font("Andale Mono",1,14));
	comboComoSeVe.setForeground(new java.awt.Color(87,35,100));
	add(comboComoSeVe);
	comboComoSeVe.addItem(imagen1);
	comboComoSeVe.addItem(imagen2);
	comboComoSeVe.addItem(imagen3);
	comboComoSeVe.addItem(imagen4);
	comboComoSeVe.addItem(imagen5);
	comboComoSeVe.addItem(imagen6);
	comboComoSeVe.addItem(imagen7);
	comboComoSeVe.addItem(imagen8);
	comboComoSeVe.addItem(imagen9);
	comboComoSeVe.addItem(imagen10);
	comboComoSeVe.addItem(imagen11);
//	

	labelNombreEnEspanol = new JLabel("Nombre en espanol:");
	labelNombreEnEspanol.setBounds(225,230,300,30);
	labelNombreEnEspanol.setFont(new Font("Andale Mono",1,20));
	labelNombreEnEspanol.setForeground(new Color(255,255,255));
	add(labelNombreEnEspanol);

	txtNombreEnEspanol = new JTextField();
	txtNombreEnEspanol.setBounds(525,230,300,30);
	txtNombreEnEspanol.setBackground(new java.awt.Color(224,224,224));
	txtNombreEnEspanol.setFont(new java.awt.Font("Andale Mono",1,14));
	txtNombreEnEspanol.setForeground(new java.awt.Color(87,35,100));
	add(txtNombreEnEspanol);

	labelNombreIngles = new JLabel("Nombre en ingles:");
	labelNombreIngles.setBounds(225,260,300,30);
	labelNombreIngles.setFont(new Font("Andale Mono",1,20));
	labelNombreIngles.setForeground(new Color(255,255,255));
	add(labelNombreIngles);

	txtNombreIngles = new JTextField();
	txtNombreIngles.setBounds(525,260,300,30);
	txtNombreIngles.setBackground(new java.awt.Color(224,224,224));
	txtNombreIngles.setFont(new java.awt.Font("Andale Mono",1,14));
	txtNombreIngles.setForeground(new java.awt.Color(87,35,100));
	add(txtNombreIngles);

	labelNombreConductor = new JLabel("Nombre del conductor:");
	labelNombreConductor.setBounds(225,290,300,30);
	labelNombreConductor.setFont(new Font("Andale Mono",1,20));
	labelNombreConductor.setForeground(new Color(255,255,255));
	add(labelNombreConductor);

	txtNombreConductor = new JTextField();
	txtNombreConductor.setBounds(525,290,300,30);
	txtNombreConductor.setBackground(new java.awt.Color(224,224,224));
	txtNombreConductor.setFont(new java.awt.Font("Andale Mono",1,14));
	txtNombreConductor.setForeground(new java.awt.Color(87,35,100));
	add(txtNombreConductor);

	labelTipoDeCaucho = new JLabel("Tipo de caucho:");
	labelTipoDeCaucho.setBounds(225,320,300,30);
	labelTipoDeCaucho.setFont(new Font("Andale Mono",1,20));
	labelTipoDeCaucho.setForeground(new Color(255,255,255));
	add(labelTipoDeCaucho);

	//comboTipoDeCaucho = new JComboBox();
	JComboBox<String> comboTipoDeCaucho = new JComboBox<String>();
	comboTipoDeCaucho.setBounds(525,320,300,30);
	comboTipoDeCaucho.setBackground(new java.awt.Color(224,224,224));
	comboTipoDeCaucho.setFont(new java.awt.Font("Andale Mono",1,14));
	comboTipoDeCaucho.setForeground(new java.awt.Color(87,35,100));
	add(comboTipoDeCaucho);
	comboTipoDeCaucho.addItem("tipo1");
	comboTipoDeCaucho.addItem("tipo2");
	comboTipoDeCaucho.addItem("tipo3");
	comboTipoDeCaucho.addItem("tipo4");

	labelTamanoDeCaucho = new JLabel("Tamano de caucho:");
	labelTamanoDeCaucho.setBounds(225,350,300,30);
	labelTamanoDeCaucho.setFont(new Font("Andale Mono",1,20));
	labelTamanoDeCaucho.setForeground(new Color(255,255,255));
	add(labelTamanoDeCaucho);

	//comboTamanoDeCaucho = new JComboBox();
	JComboBox<String> comboTamanoDeCaucho = new JComboBox<String>();
	comboTamanoDeCaucho.setBounds(525,350,300,30);
	comboTamanoDeCaucho.setBackground(new java.awt.Color(224,224,224));
	comboTamanoDeCaucho.setFont(new java.awt.Font("Andale Mono",1,14));
	comboTamanoDeCaucho.setForeground(new java.awt.Color(87,35,100));
	add(comboTamanoDeCaucho);
	comboTamanoDeCaucho.addItem("tipo1");
	comboTamanoDeCaucho.addItem("tipo2");
	comboTamanoDeCaucho.addItem("tipo3");
	comboTamanoDeCaucho.addItem("tipo4");

	labelVelocidadDelVehiculo = new JLabel("Velocidad del vehiculo:");
	labelVelocidadDelVehiculo.setBounds(225,380,300,30);
	labelVelocidadDelVehiculo.setFont(new Font("Andale Mono",1,20));
	labelVelocidadDelVehiculo.setForeground(new Color(255,255,255));
	add(labelVelocidadDelVehiculo);

	txtVelocidadDelVehiculo = new JTextField();
	txtVelocidadDelVehiculo.setBounds(525,380,300,30);
	txtVelocidadDelVehiculo.setBackground(new java.awt.Color(224,224,224));
	txtVelocidadDelVehiculo.setFont(new java.awt.Font("Andale Mono",1,14));
	txtVelocidadDelVehiculo.setForeground(new java.awt.Color(87,35,100));
	add(txtVelocidadDelVehiculo);

	labelResistenciaBomba = new JLabel("Resistecia bomba:");
	labelResistenciaBomba.setBounds(225,410,300,30);
	labelResistenciaBomba.setFont(new Font("Andale Mono",1,20));
	labelResistenciaBomba.setForeground(new Color(255,255,255));
	add(labelResistenciaBomba);

	txtResistenciaBomba = new JTextField();
	txtResistenciaBomba.setBounds(525,410,300,30);
	txtResistenciaBomba.setBackground(new java.awt.Color(224,224,224));
	txtResistenciaBomba.setFont(new java.awt.Font("Andale Mono",1,14));
	txtResistenciaBomba.setForeground(new java.awt.Color(87,35,100));
	add(txtResistenciaBomba);

	labelResistenciaPiedra = new JLabel("Resistencia piedra:");
	labelResistenciaPiedra.setBounds(225,440,300,30);
	labelResistenciaPiedra.setFont(new Font("Andale Mono",1,20));
	labelResistenciaPiedra.setForeground(new Color(255,255,255));
	add(labelResistenciaPiedra);

	txtResistenciaPiedra = new JTextField();
	txtResistenciaPiedra.setBounds(525,440,300,30);
	txtResistenciaPiedra.setBackground(new java.awt.Color(224,224,224));
	txtResistenciaPiedra.setFont(new java.awt.Font("Andale Mono",1,14));
	txtResistenciaPiedra.setForeground(new java.awt.Color(87,35,100));
	add(txtResistenciaPiedra);

	labelResistenciaLiquido = new JLabel("Resistencia liquido:");
	labelResistenciaLiquido.setBounds(225,470,300,30);
	labelResistenciaLiquido.setFont(new Font("Andale Mono",1,20));
	labelResistenciaLiquido.setForeground(new Color(255,255,255));
	add(labelResistenciaLiquido);

	txtResistenciaLiquido = new JTextField();
	txtResistenciaLiquido.setBounds(525,470,300,30);
	txtResistenciaLiquido.setBackground(new java.awt.Color(224,224,224));
	txtResistenciaLiquido.setFont(new java.awt.Font("Andale Mono",1,14));
	txtResistenciaLiquido.setForeground(new java.awt.Color(87,35,100));
	add(txtResistenciaLiquido);

	
	


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

	boton1 = new JButton("Modificar");
	boton1.setBounds(550,600,100,30);
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
	Modificar modificar = new Modificar();
	modificar.setBounds(0,0,1200,750);
	modificar.setVisible(true);
	modificar.setResizable(false);
	modificar.setLocationRelativeTo(null);

    

	}




}