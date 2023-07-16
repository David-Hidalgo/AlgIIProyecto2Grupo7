package com.AlgIIProyecto2Grupo7.GestionPistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazAutosLocos {
    private JFrame frame;
    private JPanel panel;
    private JButton btnJugar;
    private JButton btnOpciones;
    private JButton btnSalir;

    public InterfazAutosLocos() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Autos Locos");
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 1, 0, 10));

        JLabel lblTitulo = new JLabel("Autos Locos");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblTitulo);

        btnJugar = new JButton("Jugar");
        btnJugar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InterfazJuego juego = new InterfazJuego();
                JTabbedPane tabbedPane = new JTabbedPane();
                tabbedPane.addTab("Juego", juego.getPanel());
                frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
                frame.setVisible(true);
            }
        });
        panel.add(btnJugar);

        btnOpciones = new JButton("Opciones");
        btnOpciones.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí iría el código para mostrar las opciones del juego
            }
        });
        panel.add(btnOpciones);

        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(btnSalir);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        InterfazAutosLocos interfaz = new InterfazAutosLocos();
    }
}

class InterfazJuego {
    private JPanel panel;

    public InterfazJuego() {
        initialize();
    }

    private void initialize() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("Juego de Autos Locos");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblTitulo, BorderLayout.NORTH);

        // Aquí iría el código para crear la interfaz del juego

    }

    public JPanel getPanel() {
        return panel;
    }
}