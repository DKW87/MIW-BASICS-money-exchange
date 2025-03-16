package controller;

import java.util.Scanner;

/* Dit is een programma dat uitrekent hoeveel buitenlandse valuta een klant krijgt voor zijn euro’s.
Er kan vanuit Euro naar USD/GBP/Yen omgerekend worden.
Mvg, Danny Kwant */
public class MoneyExchange {

    public static double eurosOmrekenenNaarUSD(double bedragInEurosOmwisselen) {
        final double minTransactieKosten = 2.0;
        final double maxTransactieKosten = 15.0;
        final double percentageTransactiekosten = 0.015;
        final double wisselkoersUSD = 1.23843;
        double omgerekendInUSD;

        if (bedragInEurosOmwisselen < 134) {
            omgerekendInUSD = (bedragInEurosOmwisselen - minTransactieKosten) * wisselkoersUSD;
            omgerekendInUSD = Math.round(omgerekendInUSD);
            return omgerekendInUSD;
        } else if (bedragInEurosOmwisselen > 1000) {
            omgerekendInUSD = (bedragInEurosOmwisselen - maxTransactieKosten) * wisselkoersUSD;
            omgerekendInUSD = Math.round(omgerekendInUSD);
            return omgerekendInUSD;
        } else {
            omgerekendInUSD = (bedragInEurosOmwisselen - (bedragInEurosOmwisselen * percentageTransactiekosten)) * wisselkoersUSD;
            omgerekendInUSD = Math.round(omgerekendInUSD);
            return omgerekendInUSD;
        }

    }

    public static double eurosOmrekenenNaarGBP(double bedragInEurosOmwisselen) {
        final double minTransactieKosten = 2.0;
        final double maxTransactieKosten = 15.0;
        final double percentageTransactiekosten = 0.015;
        final double wisselkoersGBP = 0.88459;
        double omgerekendInGBP;


        if (bedragInEurosOmwisselen < 134) {
            omgerekendInGBP = (bedragInEurosOmwisselen - minTransactieKosten) * wisselkoersGBP;
            omgerekendInGBP = Math.round(omgerekendInGBP);
            return omgerekendInGBP;
        } else if (bedragInEurosOmwisselen > 1000) {
            omgerekendInGBP = (bedragInEurosOmwisselen - maxTransactieKosten) * wisselkoersGBP;
            omgerekendInGBP = Math.round(omgerekendInGBP);
            return omgerekendInGBP;
        } else {
            omgerekendInGBP = (bedragInEurosOmwisselen - (bedragInEurosOmwisselen * percentageTransactiekosten)) * wisselkoersGBP;
            omgerekendInGBP = Math.round(omgerekendInGBP);
            return omgerekendInGBP;
        }

    }

    public static double eurosOmrekenenNaarJPY(double bedragInEurosOmwisselen) {
        final double minTransactieKosten = 2.0;
        final double maxTransactieKosten = 15.0;
        final double percentageTransactiekosten = 0.015;
        final double wisselkoersJPY = 134.64711;
        double omgerekendInJPY;

        if (bedragInEurosOmwisselen < 134) {
            omgerekendInJPY = (bedragInEurosOmwisselen - minTransactieKosten) * wisselkoersJPY;
            omgerekendInJPY = Math.round(omgerekendInJPY);
            return omgerekendInJPY;
        } else if (bedragInEurosOmwisselen > 1000) {
            omgerekendInJPY = (bedragInEurosOmwisselen - maxTransactieKosten) * wisselkoersJPY;
            omgerekendInJPY = Math.round(omgerekendInJPY);
            return omgerekendInJPY;
        } else {
            omgerekendInJPY = (bedragInEurosOmwisselen - (bedragInEurosOmwisselen * percentageTransactiekosten)) * wisselkoersJPY;
            omgerekendInJPY = Math.round(omgerekendInJPY);
            return omgerekendInJPY;
        }

    }


    public static void main(String[] args) {

        // variabelen
        int bedragInEurosOmwisselen;
        double bedragInEurosOmwisselenDouble;
        double totaleTransactieKosten;
        final double wisselkoersUSD = 1.23843;
        final double wisselkoersGBP = 0.88459;
        final double wisselkoersJPY = 134.64711;
        final double percentageTransactiekosten = 0.015;
        Scanner input;

        // Scanner init
        input = new Scanner(System.in);

        System.out.print("In te wisselen bedrag (alleen gehele getallen): ");
        bedragInEurosOmwisselen = input.nextInt();
        bedragInEurosOmwisselenDouble = bedragInEurosOmwisselen;
        totaleTransactieKosten = bedragInEurosOmwisselenDouble - (bedragInEurosOmwisselenDouble * percentageTransactiekosten);

        System.out.print("\n");

        if (bedragInEurosOmwisselen < 134) {
            System.out.println("De transactiekosten bedragen 2 euro. ");
            System.out.printf("We rekenen daarom %d Euro voor je om.%n", bedragInEurosOmwisselen - 2);
        } else if (bedragInEurosOmwisselen > 1000) {

            System.out.println("De transactiekosten bedragen 15 euro. ");
            System.out.printf("We rekenen daarom %d Euro voor je om.%n", bedragInEurosOmwisselen - 15);
        } else {

            System.out.println("De transactiekosten bedragen " + bedragInEurosOmwisselen * percentageTransactiekosten + " euro. ");
            System.out.printf("We rekenen daarom %.0f Euro voor je om.%n", totaleTransactieKosten);
        }

        System.out.printf("Je krijgt hiervoor: %.0f Dollar (wisselkoers: %.5f).%n", eurosOmrekenenNaarUSD(bedragInEurosOmwisselen), wisselkoersUSD);
        System.out.printf("Je krijgt hiervoor: %.0f Pond (wisselkoers: %.5f).%n", eurosOmrekenenNaarGBP(bedragInEurosOmwisselen), wisselkoersGBP);
        System.out.printf("Je krijgt hiervoor: %.0f Yen (wisselkoers: %.5f).%n", eurosOmrekenenNaarJPY(bedragInEurosOmwisselen), wisselkoersJPY);
    }
}
