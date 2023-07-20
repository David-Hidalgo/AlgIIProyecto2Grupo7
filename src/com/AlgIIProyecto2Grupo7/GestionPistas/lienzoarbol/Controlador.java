/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlgIIProyecto2Grupo7.GestionPistas.lienzoarbol;

import com.AlgIIProyecto2Grupo7.estructuras.avl.PistaAvl;

/**
 *
 * @author daniel
 */
public class Controlador {
    private Lienzo objLienzo; //VISTA
    private PistaAvl objArbol; //MODELO

    public Controlador(Lienzo objLienzo, PistaAvl objArbol) {
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
    }
    
    public void iniciar() {
        objLienzo.setObjArbol(objArbol);
    }
}
