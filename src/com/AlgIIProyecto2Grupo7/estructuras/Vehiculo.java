package com.AlgIIProyecto2Grupo7.estructuras;

import com.AlgIIProyecto2Grupo7.estructuras.avl.NodoParada;

public class Vehiculo {
    private String nombreEs;
    private String nombreEn;
    private String conductor;
    private String tipoCaucho;
    private String tamanoCaucho;
    private String Motor;
    private int velocidad;
    private int ResBomba;
    private int ResPiedra;
    private int ResLiquido;
    private double tiempoDeLlegada;
    private NodoParada ubicación;
    private String vehiculoEnPantalla;
    
    /**
     * Constructor
	 */
    public Vehiculo(){
        nombreEs="";
        nombreEn="";
        conductor="";
        tipoCaucho="";
        tamanoCaucho="";
        velocidad=0;
        ResBomba=0;
        ResPiedra=0;
        ResLiquido=0;
        tiempoDeLlegada=0;
        vehiculoEnPantalla="";
    }

    public Vehiculo(int juan){
        nombreEs="Carro";
        nombreEn="Car";
        conductor="Juan";
        tipoCaucho="Normal";
        tamanoCaucho="Normal";
        velocidad=100;
        ResBomba=0;
        ResPiedra=0;
        ResLiquido=0;
        tiempoDeLlegada=0;
        vehiculoEnPantalla="";
    }

    public Vehiculo(String nombreEs, String nombreEn, String conductor, String tipoCaucho, String tamanoCaucho, String velocidad, String ResBomba, String ResPiedra,
            String ResLiquido, String vehiculoEnPantalla) {
        this.nombreEs = nombreEs;
        this.nombreEn = nombreEn;
        this.conductor = conductor;
        this.tipoCaucho = tipoCaucho;
        this.tamanoCaucho = tamanoCaucho;
        this.velocidad = Integer.parseInt(velocidad);
        this.ResBomba = Integer.parseInt(ResBomba);
        this.vehiculoEnPantalla = vehiculoEnPantalla;
    }

    /**
     * Metodos
     */

    
    public String getnombreEs() {
        return nombreEs;
    }

    public void setnombreEs(String nombreEs) {
        this.nombreEs = nombreEs;
    }

    public String getnombreEn() {
        return nombreEn;
    }

    public void setnombreEn(String nombreEn) {
        this.nombreEn = nombreEn;
    }

    public String getconductor() {
        return conductor;
    }

    public void setconductor(String conductor) {
        this.conductor = conductor;
    }

    public String getTipoCaucho() {
        return tipoCaucho;
    }

    public void setTipoCaucho(String TipoCaucho) {
        this.tipoCaucho = TipoCaucho;
    }

    public String getTamanoCaucho() {
        return tamanoCaucho;
    }
    
    public void setTamanoCaucho(String tamanoCaucho) {
        this.tamanoCaucho = tamanoCaucho;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getResBomba() {
        return ResBomba;
    }

    public void setResBomba(int ResBomba) {
        this.ResBomba = ResBomba;
    }

    public int getResPiedra() {
        return ResPiedra;
    }

    public void setResPiedra(int ResPiedra) {
        this.ResPiedra = ResPiedra;
    }

    public int getResLiquido() {
        return ResLiquido;
    }

    public void setResLiquido(int ResLiquido) {
        this.ResLiquido = ResLiquido;
    }

    public double getTiempoDeLlegada() {
        return tiempoDeLlegada;
    }

    public void setTiempoDeLlegada(double tiempoDeLlegada) {
        this.tiempoDeLlegada = tiempoDeLlegada;
    }

    
    public NodoParada getUbicación() {
        return ubicación;
    }

    public void setUbicación(NodoParada ubicación) {
        this.ubicación = ubicación;
    }

    public String getvehiculoEnPantalla() {
        return vehiculoEnPantalla;
    }

    public void setvehiculoEnPantalla(String vehiculoEnPantalla) {
        this.vehiculoEnPantalla = vehiculoEnPantalla;
    }

    @Override
	public String toString() {
		return "Los datos de la Carro son: nombreEs " + nombreEs  + ", nombreEn= " + nombreEn + ", velocidad= " + velocidad + ", vehiculoEnPantalla= " + vehiculoEnPantalla+"\n";
	}

}
