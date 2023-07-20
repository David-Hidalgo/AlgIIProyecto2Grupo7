package com.AlgIIProyecto2Grupo7.GestionPistas.PistaInterfaz;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import com.AlgIIProyecto2Grupo7.GestionPistas.lienzoarbol.Lienzo;
import com.AlgIIProyecto2Grupo7.estructuras.ReadWrite;
import com.AlgIIProyecto2Grupo7.estructuras.avl.Pista;
import com.AlgIIProyecto2Grupo7.estructuras.avl.PistaAvl;
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

private JButton menuAgregar , menuModificar , menuListar , menuSalir;
private JScrollPane scrollPane;
private JTable tableVehiculos;
private int nivel=5;
private int numeroTrampas=5;



	public Listar(int n, int t){
		nivel=n;
		numeroTrampas=t;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(87,35,100));
		
	labelModificar = new JLabel("Listar");
		labelModificar.setBounds(40,30,300,50);
		labelModificar.setFont(new Font("Andale Mono",1,40));
		//labelConsultar.setForeground(new Color(235,235,0)); // color amarillo
		labelModificar.setForeground(new Color(200,200,200)); // color gris
		getContentPane().add(labelModificar);

	// menu de botones

	menuAgregar = new JButton("Configurar Pista");
		menuAgregar.setBounds(0,0,320,30);
		menuAgregar.setBackground(new Color(60, 20, 80));
		menuAgregar.setFont(new Font("Andele Mono",1,14));
		menuAgregar.setForeground(new Color(255,255,255));
		menuAgregar.addMouseListener(this);
		menuAgregar.setBorderPainted(false);
		getContentPane().add(menuAgregar);

	menuModificar = new JButton("Simular Carrera");
	menuModificar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
		menuModificar.setBounds(320,0,320,30);
		menuModificar.setBackground(new Color(60, 20, 80));
		menuModificar.setFont(new Font("Andele Mono",1,14));
		menuModificar.setForeground(new Color(255,255,255));
		menuModificar.addMouseListener(this);
		menuModificar.setBorderPainted(false);
		getContentPane().add(menuModificar);

	menuListar = new JButton("Listar Vehiculos");
		menuListar.setBounds(640,0,320,30);
		menuListar.setBackground(new Color(87,35,100));
		menuListar.setFont(new Font("Andele Mono",1,14));
		menuListar.setForeground(new Color(255,255,255));
		menuListar.addMouseListener(this);
		menuListar.setBorderPainted(false);
		getContentPane().add(menuListar);

	menuSalir = new JButton("Salir");
		menuSalir.setBounds(960,0,320,30);
		menuSalir.setBackground(new Color(60, 20, 80));
		menuSalir.setFont(new Font("Andele Mono",1,14));
		menuSalir.setForeground(new Color(255,255,255));
		menuSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		menuSalir.addMouseListener(this);
		menuSalir.setBorderPainted(false);
		getContentPane().add(menuSalir);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setEnabled(false);
		scrollPane.setBounds(23, 128, 1155, 388);
		getContentPane().add(scrollPane);
		
		tableVehiculos = new JTable();
		tableVehiculos.setSurrendersFocusOnKeystroke(true);
		tableVehiculos.setBorder(null);
		tableVehiculos.setFillsViewportHeight(true);
		tableVehiculos.setFont(new Font("Dialog", Font.PLAIN, 15));
		tableVehiculos.setColumnSelectionAllowed(true);
		tableVehiculos.setCellSelectionEnabled(true);
		tableVehiculos.setEnabled(false);
		tableVehiculos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
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
		tableVehiculos.getColumnModel().getColumn(0).setPreferredWidth(90);
		tableVehiculos.getColumnModel().getColumn(1).setPreferredWidth(90);
		tableVehiculos.getColumnModel().getColumn(2).setPreferredWidth(90);
		tableVehiculos.getColumnModel().getColumn(5).setPreferredWidth(80);
		tableVehiculos.getColumnModel().getColumn(6).setPreferredWidth(40);
		tableVehiculos.getColumnModel().getColumn(7).setPreferredWidth(40);
		tableVehiculos.getColumnModel().getColumn(8).setPreferredWidth(40);
		tableVehiculos.getColumnModel().getColumn(9).setPreferredWidth(40);
		scrollPane.setViewportView(tableVehiculos);

		//llenar tantas row como vehiculos haya


		System.out.println(tableVehiculos.getRowCount());
		tableVehiculos.addRowSelectionInterval(0, nueva.getTamano());
		for (int i = 0; i <nueva.getTamano() ; i++) {
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
				configurarPista configurarPista = new configurarPista();
				configurarPista.setBounds(0,0,800,450);
				configurarPista.setVisible(true);
				configurarPista.setResizable(false);
				configurarPista.setLocationRelativeTo(null);
                    this.setVisible(false);
			}
			if(e.getSource() == menuModificar){
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
			if(e.getSource() == menuListar){
                    Listar listar = new Listar(nivel, numeroTrampas);
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

	
}
