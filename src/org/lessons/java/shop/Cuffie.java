package org.lessons.java.shop;

public class Cuffie  extends Prodotto{
    private String colore;
    private boolean isWireless;

    public Cuffie(String nome, String descrizione, double prezzo, double iva, String colore, boolean isWireless) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return isWireless;
    }

    @Override
    public String toString() {
        return "Cuffie{" +
                "colore='" + colore + '\'' +
                ", isWireless=" + isWireless +
                "} " + super.toString();
    }
}
