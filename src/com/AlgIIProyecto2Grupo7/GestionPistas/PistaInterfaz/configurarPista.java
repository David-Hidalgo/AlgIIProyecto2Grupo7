package com.AlgIIProyecto2Grupo7.GestionPistas.PistaInterfaz;

import javax.swing.*;
import javax.swing.border.Border;
import com.AlgIIProyecto2Grupo7.Validaciones;
import com.AlgIIProyecto2Grupo7.estructuras.ReadWrite;
import com.AlgIIProyecto2Grupo7.estructuras.Vehiculo;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;
import com.AlgIIProyecto2Grupo7.estructuras.avl.PistaAvl;
import com.AlgIIProyecto2Grupo7.estructuras.avl.Pista;
import com.AlgIIProyecto2Grupo7.GestionPistas.AppGestionPistas;
import java.awt.event.*;
import java.awt.*;

//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

public class configurarPista extends JFrame implements MouseListener {

	// private JMenuBar mb;
	// private JMenu menuAgregar , menuModificar , menuEliminar , menuConsultar ,
	// menuListar , menuSalir;
	// private JMenuItem miNuevoAgregar;
	private JLabel labelNivelDePistal, labelNumerotrampas, labelCantidadVehiculos;

	private JLabel labelTitulo;
	private ListaVehiculo listaActual=ReadWrite.cargarVehiculos();

	private JTextField txtNivelPista, txtNumeroTrampas, txtCantidadVehiculos;
	private JButton boton1, menuSetPista, menuSimularCarrera, menuVehiculos, menuSalir;
	private int nivel;
	private int numeroTrampas;
	private int contadorVehiculos;

	public configurarPista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(87, 35, 100));
	//	setIconImage(new ImageIcon(getClass().getResource("imagenesAutosLocos/icono.png")).getImage());

		labelTitulo = new JLabel("Simulacion de la Carrera");
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setBounds(150, 41, 505, 50);
		labelTitulo.setFont(new Font("Andale Mono", 1, 40));
		// labelConsultar.setForeground(new Color(235,235,0)); // color amarillo
		labelTitulo.setForeground(new Color(200, 200, 200)); // color gris
		getContentPane().add(labelTitulo);

		

		labelNivelDePistal = new JLabel("Nivel de la Pista:");
		labelNivelDePistal.setVerticalAlignment(SwingConstants.TOP);
		labelNivelDePistal.setBounds(178, 167, 300, 57);
		labelNivelDePistal.setFont(new Font("Andale Mono", 1, 20));
		labelNivelDePistal.setForeground(new Color(255, 255, 255));
		getContentPane().add(labelNivelDePistal);

		txtNivelPista = new JTextField();
		txtNivelPista.setBounds(408, 168, 300, 30);
		txtNivelPista.setBackground(new java.awt.Color(224, 224, 224));
		txtNivelPista.setFont(new java.awt.Font("Andale Mono", 1, 14));
		txtNivelPista.setForeground(new java.awt.Color(87, 35, 100));
		getContentPane().add(txtNivelPista);

		labelNumerotrampas = new JLabel("Cantidad de Trampas:");
		labelNumerotrampas.setBounds(178, 235, 300, 30);
		labelNumerotrampas.setFont(new Font("Andale Mono", 1, 20));
		labelNumerotrampas.setForeground(new Color(255, 255, 255));
		getContentPane().add(labelNumerotrampas);

		txtNumeroTrampas = new JTextField();
		txtNumeroTrampas.setBounds(408, 238, 300, 30);
		txtNumeroTrampas.setBackground(new java.awt.Color(224, 224, 224));
		txtNumeroTrampas.setFont(new java.awt.Font("Andale Mono", 1, 14));
		txtNumeroTrampas.setForeground(new java.awt.Color(87, 35, 100));
		getContentPane().add(txtNumeroTrampas);

		labelCantidadVehiculos = new JLabel("Cantidad de Vehiculos:");
		labelCantidadVehiculos.setBounds(178, 290, 300, 30);
		labelCantidadVehiculos.setFont(new Font("Andale Mono", 1, 20));
		labelCantidadVehiculos.setForeground(new Color(255, 255, 255));
		getContentPane().add(labelCantidadVehiculos);

		txtCantidadVehiculos = new JTextField();
		txtCantidadVehiculos.setBounds(408, 293, 300, 30);
		txtCantidadVehiculos.setBackground(new java.awt.Color(224, 224, 224));
		txtCantidadVehiculos.setFont(new java.awt.Font("Andale Mono", 1, 14));
		txtCantidadVehiculos.setForeground(new java.awt.Color(87, 35, 100));
		getContentPane().add(txtCantidadVehiculos);

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

		boton1 = new JButton("Agregar");
		boton1.setBounds(350, 370, 100, 30);
		boton1.setBackground(new Color(255, 255, 255));
		boton1.setFont(new Font("Andale Mono", 1, 14));
		boton1.setForeground(new Color(87, 35, 100));
		boton1.addMouseListener(this);
		getContentPane().add(boton1);

		// menu de botones

		menuSetPista = new JButton("Configurar Pista\r\n");
		menuSetPista.setBounds(0, 0, 200, 30);
		menuSetPista.setBackground(new Color(87, 35, 100));
		menuSetPista.setFont(new Font("Andele Mono", 1, 14));
		menuSetPista.setForeground(new Color(255, 255, 255));
		menuSetPista.addMouseListener(this);
		menuSetPista.setBorderPainted(false);
		getContentPane().add(menuSetPista);

		menuSimularCarrera = new JButton("SimularCarrera");
		menuSimularCarrera.setBounds(400, 0, 200, 30);
		menuSimularCarrera.setBackground(new Color(60, 20, 80));
		menuSimularCarrera.setFont(new Font("Andele Mono", 1, 14));
		menuSimularCarrera.setForeground(new Color(255, 255, 255));
		menuSimularCarrera.addMouseListener(this);
		menuSimularCarrera.setBorderPainted(false);
		getContentPane().add(menuSimularCarrera);

		menuVehiculos = new JButton("Seleccionar Vehiculos");
		menuVehiculos.setBounds(200, 0, 200, 30);
		menuVehiculos.setBackground(new Color(60, 20, 80));
		menuVehiculos.setFont(new Font("Andele Mono", 1, 14));
		menuVehiculos.setForeground(new Color(255, 255, 255));
		menuVehiculos.addMouseListener(this);
		menuVehiculos.setBorderPainted(false);
		getContentPane().add(menuVehiculos);

		menuSalir = new JButton("Salir");
		menuSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuSalir.setBounds(600, 0, 200, 30);
		menuSalir.setBackground(new Color(60, 20, 80));
		menuSalir.setFont(new Font("Andele Mono", 1, 14));
		menuSalir.setForeground(new Color(255, 255, 255));
		menuSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		menuSalir.addMouseListener(this);
		menuSalir.setBorderPainted(false);
		getContentPane().add(menuSalir);
		
		

	}

	public void mouseClicked(MouseEvent e) {
		/*
		 * if (evento.getSource() == boton1){
		 * etiqueta1.setText("Hizo clic en mi bot�n");
		 * }
		 * if (evento.getSource() == labelTitulo){
		 * etiqueta1.setText("Hizo clic en el Titulo");
		 */
		boolean inserto = false;
		if ((e.getSource() == boton1)&& inserto==false) {
			inserto = true;
			// Datos de la pista
			if ((Validaciones.validarNumero(txtNivelPista.getText()))&&(Integer.parseInt(txtNivelPista.getText())>4)) {
				nivel = Integer.parseInt(txtNivelPista.getText());
				double lim = (Math.pow(2, nivel-1)*1.5)-4;
				int limInt=((int)lim);
				PistaAvl auxAvl;
				PistaAvl pista = Pista.crearPista(nivel);
				if ((Validaciones.validarNumero(txtNumeroTrampas.getText()))&&(Integer.parseInt(txtNumeroTrampas.getText())>4)&&(Integer.parseInt(txtNumeroTrampas.getText())<limInt)) {
					numeroTrampas = Integer.parseInt(txtNumeroTrampas.getText());
					Pista.generarTrampas(pista, nivel, numeroTrampas);
					auxAvl=pista.clone();
					if((Validaciones.validarNumero(txtCantidadVehiculos.getText()))&&(Integer.parseInt(txtCantidadVehiculos.getText())>1)&&(Integer.parseInt(txtCantidadVehiculos.getText())<(listaActual.getTamano()+1))){
						contadorVehiculos = Integer.parseInt(txtCantidadVehiculos.getText());
					}else{
						JOptionPane.showMessageDialog(null,"Cantidad de vehiculos ingresado invalido, el minimo es 2 y el maximo es "+ listaActual.getTamano());
						inserto=false;
					}
				}else{
					JOptionPane.showMessageDialog(null,"Cantidad de trampas ingresado invalido, el minimo es 5 y el maximo es "+(limInt+1));
					inserto=false;
				}
			}else{
				JOptionPane.showMessageDialog(null, "Valor de nivel de pista ingresado invalido, el minimo es 5");
				inserto=false;
			}
			
			if (!inserto){
			configurarPista agregar = new configurarPista();
			agregar.setBounds(0, 0, 800, 450);
			agregar.setVisible(true);
			agregar.setResizable(false);
			agregar.setLocationRelativeTo(null);
			this.setVisible(false);
			}
		}
		if (e.getSource() == menuVehiculos || inserto==true) {
			Listar listar = new Listar();
			listar.setBounds(0, 0, 1200, 750);
			listar.setVisible(true);
			listar.setResizable(false);
			listar.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == menuSimularCarrera) {
			AppGestionPistas.Simulacion();
			
		}
		if (e.getSource() == menuSalir) {
			int respuesta = JOptionPane.showConfirmDialog(this,
			"¿Esta seguro que desea salir?", "Confirmacion",
			JOptionPane.YES_NO_OPTION);
			if (respuesta == JOptionPane.YES_NO_OPTION) {
				this.dispose();
			}
			
		}
		
		if (e.getSource() == menuSetPista) {

			configurarPista agregar = new configurarPista();
			agregar.setBounds(0, 0, 800, 450);
			agregar.setVisible(true);
			agregar.setResizable(false);
			agregar.setLocationRelativeTo(null);
			this.setVisible(false);
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
		if (e.getSource() == menuSetPista) {

		}
		if (e.getSource() == menuSimularCarrera) {

		}
		if (e.getSource() == menuVehiculos) {

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
		configurarPista agregar = new configurarPista();
		agregar.setBounds(0, 0, 800, 450);
		agregar.setVisible(true);
		agregar.setResizable(false);
		agregar.setLocationRelativeTo(null);
	}
}