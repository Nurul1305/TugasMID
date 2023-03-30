//Nama  : Nurul Faisah
//Nim   : 13020210139

import java.util.Scanner;

public class Hitung0139 {
    public static void main(String[] args) {
        final double KONVERSI_MIL_KE_METER = 1609; // 1 mil = 1609 meter
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak dalam mil: ");
        double jarakMil = input.nextDouble();
        double jarakMeter = jarakMil * KONVERSI_MIL_KE_METER;
        System.out.println("Hasil " + jarakMil + " mil = " + jarakMeter + " meter");
    }
}