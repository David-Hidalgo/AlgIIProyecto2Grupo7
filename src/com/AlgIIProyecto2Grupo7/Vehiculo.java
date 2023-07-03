package com.AlgIIProyecto2Grupo7;

public class Vehiculo {
    private String nombreEs;
    private String nombreEn;
    private String conductor;
    private int tipoCaucho;
    private String[] aTipoCaucho = { "Error", "Todoterreno", "Normal", "Anticoleo" };
    private int tamanoCaucho;
    private String[] aTamanoCaucho = { "Error", "Monstertruck", "Normal", "Pegado al piso" };
    private int monsterTruck;
    private int velocidad;
    private String[] aVelocidad = { "Error", "Perezoso", "Crucero", "SuperFerrari", "Delorean" };
    private int velocidadKm;
    private int resBomba;
    private int resPiedra;
    private int resLiquido;
    private String vehiculoEnPantalla;

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

    public int gettipoCaucho() {
        return tipoCaucho;
    }

    public void settipoCaucho(int tipoCaucho) {
        this.tipoCaucho = tipoCaucho;
    }

    public int gettamanoCaucho() {
        return tamanoCaucho;
    }

    public void settamanoCaucho(int tamanoCaucho) {
        this.tamanoCaucho = tamanoCaucho;
    }

    public int getmonsterTruck() {
        return monsterTruck;
    }

    public void setmonsterTruck(int monsterTruck) {
        this.monsterTruck = monsterTruck;
    }

    public int getvelocidad() {
        return velocidad;
    }

    public void setvelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getvelocidadKm() {
        return velocidadKm;
    }

    public void setvelocidadKm(int velocidadKm) {
        this.velocidadKm = velocidadKm;
    }

    public int getresBomba() {
        return resBomba;
    }

    public void setresBomba(int resBomba) {
        this.resBomba = resBomba;
    }

    public int getresPiedra() {
        return resPiedra;
    }

    public void setresPiedra(int resPiedra) {
        this.resPiedra = resPiedra;
    }

    public int getresLiquido() {
        return resLiquido;
    }

    public void setresLiquido(int resLiquido) {
        this.resLiquido = resLiquido;
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
