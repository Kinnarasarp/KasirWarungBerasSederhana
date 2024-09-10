/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kasirwarungberas;

import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author kinna
 */
public class KasirWarungBeras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga, kg, hargasementara, diskon, hargafinal, uangpembeli, kembalian;
        
        System.out.println("Kasir Warung Beras Sederhana");
        System.out.print("Masukkan jumlah beras (KG)\t: ");
        kg = input.nextDouble();
        System.out.print("Masukkan harga beras /KG\t: Rp");
        harga = input.nextDouble();
        
        hargasementara = harga * kg;
        diskon = hargasementara * 0.05;
        hargafinal = hargasementara - diskon;
        
        System.out.println("Harga Kotor\t: Rp" + hargasementara);
        System.out.println("Diskon 5%\t: Rp" + diskon);
        System.out.println("Total\t\t: Rp" + hargafinal);
        
        System.out.print("Uang pembeli\t: Rp");
        uangpembeli = input.nextDouble();
            
        kembalian = uangpembeli - hargafinal;
        System.out.println("Kembalian\t: Rp" + kembalian);
    }
}
