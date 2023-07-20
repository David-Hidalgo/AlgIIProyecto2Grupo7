/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlgIIProyecto2Grupo7.GestionPistas.lienzoarbol;

import java.awt.Graphics;
import javax.swing.JPanel;
import com.AlgIIProyecto2Grupo7.estructuras.avl.PistaAvl;
import com.AlgIIProyecto2Grupo7.estructuras.avl.NodoParada;

/**
 *
 * @author daniel
 */
public class Lienzo extends JPanel {
    protected PistaAvl objArbol;
    public static final int DIAMETRO = 30;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 50;

    public void setObjArbol(PistaAvl objArbol) {
        this.objArbol = objArbol;
        repaint();
    }

    public PistaAvl getObjArbol() {
        return objArbol;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        pintar(g, getWidth() / 2, 20, objArbol.getRaiz());
    }
    
    private void pintar(Graphics g, int x, int y, NodoParada n) {
        if (n == null)
        {}
        else {
            int EXTRA = n.nodosCompletos(n) * (ANCHO / 2);
            g.drawOval(x, y, DIAMETRO, DIAMETRO);
            g.drawString(n.toString(), x + 12, y + 18);
            if (n.getHijoIzquierdo() != null)
            g.drawLine(x + RADIO, y + RADIO, x - ANCHO - EXTRA + RADIO, y + ANCHO + RADIO);
            if (n.getHijoDerecho() != null)
            g.drawLine(x + RADIO, y + RADIO, x + ANCHO + EXTRA + RADIO, y + ANCHO + RADIO);
            pintar(g, x - ANCHO - EXTRA, y + ANCHO, n.getHijoIzquierdo());
            pintar(g, x + ANCHO + EXTRA, y + ANCHO, n.getHijoDerecho());
        }
    }
}
