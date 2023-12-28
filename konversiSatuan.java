package Modul3;
import java.util.Scanner;
public class konversiSatuan {
    /**
     *
     * @param args eksekusi program
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Konversi Satuan=== ");
        System.out.println("1. Kilometer ke Meter");
        System.out.println("2. Meter ke Sentimeter");
        System.out.println("3. Sentimeter ke Milimeter");
        System.out.print(" pilih opsi (1/2/3): ");
        int opsi = scanner.nextInt();
        /**
         *menginput opsi untuk memilih konversi yang ingin dilakukan 1,2,atau 3
         */


        if (opsi ==1){
            /**
             * jika memilih opsi 1
             */
            System.out.print("Masukan nilai Kilometer:");
            double kilometer = scanner.nextDouble();
            /**
             * menginput nilai KM yang inging di konversi ke M
             */
            double meter = kilometer / 1000;
            /**
             * formula konversi M ke CM
             */
            System.out.println("hasil konversi dari("+kilometer+" km) ke meter adalah : "+meter);
            /**
             * menampulkan hasil konversi KM ke M
             */
        } else if (opsi ==2) {
            /**
             * jika memilih opsi 1
             */
            System.out.print("Masukan nilai Meter:");
            double meter = scanner.nextDouble();
            /**
             * menginput nilai M yang ingin di konversi ke CM
             */
            double cm = meter / 100;
            /**
             * formula konversi M ke CM
             */
            System.out.println("hasil konversi dari("+meter+" M) ke Sentimeter adalah : "+cm);
            /**
             * menampulkan hasil konversi M ke CM
             */
        } else if (opsi ==3) {
            /**
             * jika memilih opsi 1
             */
            System.out.print("Masukan nilai Sentimeter:");
            double Sentimeter = scanner.nextDouble();
            /**
             * menginput nilai CM yang ingin di konversi ke MM
             */
            double mm = Sentimeter / 10;
            /**
             * formula konversi CM ke MM
             */
            System.out.println("hasil konversi dari("+Sentimeter+" Cm) ke milimeter adalah : "+mm);
            /**
             * menampulkan hasil konversi CM ke MM
             */
        }else{
            /**
             * jika tidak menginput opsi (1/2/3)
             */
            System.out.println(" SALAH MENGINPUT OPSI!!!");
        }

    }
}