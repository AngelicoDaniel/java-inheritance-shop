package org.lessons.java.shop;

public class Televisori extends Prodotto{
    private int dimensioni;
    private boolean isSmart;

    public Televisori(String nome, String descrizione, double prezzo, double iva, int dimensioni, boolean isSmart) {
        super(nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    public int getDimensioni() {
        return dimensioni;
    }


    public boolean isSmart() {
        return isSmart;
    }

    @Override
    public String toString() {
        return "Televisori{" +
                "dimensioni=" + dimensioni +
                ", isSmart=" + isSmart +
                "} " + super.toString();
    }
}
