package Modul3;
import java.util.Scanner;

public class AutocompleteAndTemplates {


    public static void main(String[] args) { //auto complite
        Scanner scn =new Scanner(System.in);
        System.out.print("Masukan panjang balok (cm): ");//auto complite
        double panjang = scn.nextDouble();
        System.out.print("masukan lebar balok (cm): ");//auto complite
        double lebar= scn.nextDouble();
        System.out.print("masukan tinggi balok (cm): "); //auto complite
        double tinggi= scn.nextDouble();

        //live template 'calculate'
        System.out.println("luas balok adalah: "+2*((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)));



    }


}
