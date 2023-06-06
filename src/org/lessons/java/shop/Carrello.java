package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SMARTPHONE
//        Smartphone smartphone = new Smartphone("nokia", "indistruttibile", 20,0.2, 1234, 666);
//        System.out.println(smartphone);
        System.out.println("Inserisci nome smartphone");
        String nome = scanner.nextLine();
        System.out.println("Inserisci la descrizione:");
        String descrizione = scanner.nextLine();
        System.out.println("Inserisci il prezzo:");
        double prezzo = scanner.nextDouble();
        System.out.println("Inserisci l'IVA:");
        double iva = scanner.nextDouble();
        System.out.println("Inserisci l'IMEI:");
        int imei = scanner.nextInt();
        System.out.println("Inserisci la memoria:");
        int memoria = scanner.nextInt();
        scanner.nextLine();
        Smartphone smartphone = new Smartphone(nome, descrizione,prezzo,iva,imei,memoria);
        System.out.println(smartphone);



        scanner.close();
    }
}
