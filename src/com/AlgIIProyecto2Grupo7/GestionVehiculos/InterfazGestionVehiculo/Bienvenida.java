package com.AlgIIProyecto2Grupo7.GestionVehiculos.InterfazGestionVehiculo;

import com.AlgIIProyecto2Grupo7.estructuras.ReadWrite;
import com.AlgIIProyecto2Grupo7.estructuras.listaVehiculo.ListaVehiculo;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Bienvenida extends JFrame implements MouseListener{

private JTextField textfield1;
private JLabel label1 , label2, label3, label4;
private JButton boton1;
private ListaVehiculo listaVehiculos=ReadWrite.cargarVehiculosDefault();
public static String texto = "";

	public Bienvenida(){
	setLayout(null);
	setTitle("Bienvenido");
	getContentPane().setBackground(new Color(87,35,100));
setIconImage(new ImageIcon(getClass().getResource("imagenesAutosLocos/icono.png")).getImage());
	// colocar imagen de fondo 

	/*
	creo que es asi:
	ImageIcon imagenFondo = new ImageIcon("imagenesAutosLocos/fotoIngresoDeAutosLocos.jpg");
	label1 = new JLabel(imagenFondo); 
	label1.setBounds(25,15,300,150);
	add(label1);
	*/

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

	boton1 = new JButton("Ingresar");
	boton1.setBounds(125,280,100,30);
	boton1.setBackground(new Color(255,255,255));
	boton1.setFont(new Font("Andale Mono", 1,14));
	boton1.setForeground(new Color(87,35,100));
	boton1.addMouseListener(this);
	add(boton1);
	}

	public void mouseClicked(MouseEvent e) {
		/* 
				if (evento.getSource() == boton1){
					etiqueta1.setText("Hizo clic en mi bot�n");
				}
				if (evento.getSource() == labelTitulo){
					etiqueta1.setText("Hizo clic en el Titulo");
					*/
					if(e.getSource() == boton1){
			texto = textfield1.getText().trim();
			if(texto.equals("")){
				JOptionPane.showMessageDialog(null , "Debes Ingresar tu nombre.");
			}else{
				Agregar agregar = new Agregar();
				agregar.setBounds(0,0,1200,750);
				agregar.setVisible(true);
				agregar.setResizable(false);
				agregar.setLocationRelativeTo(null);
				this.setVisible(false);
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
		
				if(e.getSource() == boton1){
			
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
	Bienvenida ventanaBienvenida = new Bienvenida();
	ventanaBienvenida.setBounds(0,0,360,450);
	ventanaBienvenida.setVisible(true);
	ventanaBienvenida.setResizable(false);
	ventanaBienvenida.setLocationRelativeTo(null);


	}




}