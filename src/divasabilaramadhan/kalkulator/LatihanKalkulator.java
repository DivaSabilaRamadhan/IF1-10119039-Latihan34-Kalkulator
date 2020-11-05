package divasabilaramadhan.kalkulator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini berisi kalkulator dengan konsep pendekatan objek
 */
public class LatihanKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Kalkulator calculator = new Kalkulator();
        System.out.println("Aplikasi Kalkulator Bilangan");
        System.out.print("Masukan Angka ke-1 : ");
        calculator.value1 = input.nextDouble();
        
        System.out.print("Masukan Angka ke-2 : ");
        calculator.value2 = input.nextDouble();
        System.out.println();
        
        System.out.println("Hasil Pertambahan : " + calculator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + calculator.kurangBilangan());
        System.out.println("Hasil Perkalian   : " + calculator.kaliBilangan());
        System.out.println("Hasil Pembagian   : " + calculator.bagiBilangan());
        System.out.println("Hasil Sisa        : " + calculator.sisaBilangan());
        
    }
    
}
