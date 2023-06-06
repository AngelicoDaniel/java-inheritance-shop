package org.lessons.java.shop;

public class Smartphone extends Prodotto{
    private int imei;
    private int memoria;

    public Smartphone(String nome, String descrizione, double prezzo, double iva, int imei, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    public int getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                ", memoria=" + memoria +
                "} " + super.toString();
    }
}
