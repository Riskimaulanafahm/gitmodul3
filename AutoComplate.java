package Modul3;

import java.util.Scanner;

public class AutoComplate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukan Panjang balok (cm): ");//autocomplita
        double panjang = scn.nextDouble();
        System.out.println("Masukan lebar blok (cm): ");//autocomplita
        double lebar = scn.nextDouble();
        System.out.println("Masukan tinggi balok (cm)");//autocomplita
        double tinggi = scn.nextDouble();
        //live template
        System.out.println("luas balok adalah: " +2*((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)));

    }

}
