package com.AlgIIProyecto2Grupo7.estructuras.avl;

public class Trampa implements Cloneable {
    private int id;
    private String tipoTrampa;

    public Trampa(int num) {
        this.id =num;
        switch (num) {
            case 1:
                tipoTrampa = "Bomba";
                break;
            case 2:
                tipoTrampa = "Obstaculo";
                break;
            case 3:
                tipoTrampa = "Liquido";
                break;
        
            default:
                tipoTrampa = "Nada";
                break;
        }
    }

    public String getTipoTrampa() {
        return tipoTrampa;
    }

    public void settipoTrampa(String tipoTrampa) {
        this.tipoTrampa = tipoTrampa;
    }

    public int getId() {
        return id;
    }

    @Override
    public Trampa clone() {
        try {
            return (Trampa) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}