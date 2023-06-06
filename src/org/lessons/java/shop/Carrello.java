package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome:");
        String nome = scanner.nextLine();

        System.out.println("Inserisci la descrizione:");
        String descrizione = scanner.nextLine();

        System.out.println("Inserisci il prezzo:");
        double prezzo = scanner.nextDouble();

        System.out.println("Inserisci l'IVA:");
        double iva = scanner.nextDouble();

        System.out.println("Inserisci il tipo di prodotto da aggiungere (1 - Smartphone, 2 - Televisori, 3 - Cuffie):");
        int scelta = scanner.nextInt();
        scanner.nextLine();

        switch (scelta) {
            case 1:
                System.out.println("Inserisci l'IMEI:");
                int imei = scanner.nextInt();

                System.out.println("Inserisci la memoria:");
                int memoria = scanner.nextInt();

                Smartphone smartphone = new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);
                System.out.println(smartphone);
                break;

            case 2:
                System.out.println("Inserisci le dimensioni:");
                int dimensioni = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Il televisore è smart? (si/no):");
                String rispostaSmart = scanner.nextLine();
                boolean isSmart = rispostaSmart.equalsIgnoreCase("si");

                Televisori televisore = new Televisori(nome, descrizione, prezzo, iva, dimensioni, isSmart);
                System.out.println(televisore);
                break;

            case 3:
                System.out.println("Inserisci il colore:");
                String colore = scanner.nextLine();

                System.out.println("Le cuffie sono wireless? (si/no):");
                String rispostaWireless = scanner.nextLine();
                boolean isWireless = rispostaWireless.equalsIgnoreCase("si");

                Cuffie cuffie = new Cuffie(nome, descrizione, prezzo, iva, colore, isWireless);
                System.out.println(cuffie);
                break;

            default:
                System.out.println("Scelta non valida.");
                break;
        }

        scanner.close();
    }
}
