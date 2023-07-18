package com.AlgIIProyecto2Grupo7.estructuras;

public class Vehiculo {
    private String nombreEs;
    private String nombreEn;
    private String conductor;
    private String tipoCaucho;
    private String tamanoCaucho;
    private int monsterTruck;
    private int velocidad;
    private int velocidadKm;
    private int ResBomba;
    private int ResPiedra;
    private int ResLiquido;
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

    public int getMonsterTruck() {
        return monsterTruck;
    }

    public void setMonsterTruck(int monsterTruck) {
        this.monsterTruck = monsterTruck;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadKm() {
        return velocidadKm;
    }

    public void setVelocidadKm(int velocidadKm) {
        this.velocidadKm = velocidadKm;
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
