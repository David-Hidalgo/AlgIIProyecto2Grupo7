package com.AlgIIProyecto2Grupo7.estructuras;

public class Vehiculo {
    private String nombreEs;
    private String nombreEn;
    private String conductor;
    private String tipoCaucho;
    private String tamanoCaucho;
    private int monsterTruck;
    private int velocidad;
    private int ResBomba;
    private int ResPiedra;
    private int ResLiquido;
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
        monsterTruck=0;
        velocidad=0;
        ResBomba=0;
        ResPiedra=0;
        ResLiquido=0;
        vehiculoEnPantalla="";
    }

    public Vehiculo(String nombreEs, String nombreEn, String conductor, String tipoCaucho, String tamanoCaucho,
            String monsterTruck, String velocidad, String ResBomba, String ResPiedra,
            String ResLiquido, String vehiculoEnPantalla) {
        this.nombreEs = nombreEs;
        this.nombreEn = nombreEn;
        this.conductor = conductor;
        this.tipoCaucho = tipoCaucho;
        this.tamanoCaucho = tamanoCaucho;
        this.monsterTruck = Integer.parseInt(monsterTruck);
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
