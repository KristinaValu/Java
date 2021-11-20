/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namudarbai;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class NamuDarbai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sk;
        double sumaLyginiu = 0;
        double sumaNelyginiu = 0;
        double kiekisLyginiu = 0;
        double kiekisNelyginiu = 0;

        System.out.println("Įvesk kiek skaičių reikės įvesti: ");
        i = sc.nextInt();
        while (i > 0) {
            System.out.println("Įvesk skaičius: ");
            sk = sc.nextInt();
            if (sk % 2 == 0) {
                sumaLyginiu = sumaLyginiu + sk;
                kiekisLyginiu = kiekisLyginiu + 1;
            } else {
                sumaNelyginiu = sumaNelyginiu + sk;
                kiekisNelyginiu = kiekisNelyginiu + 1;

            }
            i--;

        }
        if (kiekisLyginiu > 0) {
            System.out.println("Lyginių skaičių suma");
            System.out.println(sumaLyginiu);
            System.out.println("Lyginių skaičių vidurkis");
            System.out.println(sumaLyginiu / kiekisLyginiu);
        } else {
            System.out.println("Lyginių skaičių nebuvo įvesta");
        }
        if (kiekisNelyginiu>0){
            System.out.println("Nelyginių skaičių suma");
            System.out.println(sumaNelyginiu);
            System.out.println("Nelyginiu skaičių vidurkis");
            System.out.println(sumaNelyginiu/kiekisNelyginiu);
        }
        else {
            System.out.println("Nelyginių skaičių nebuvo įvesta");
        }
            
            
//            
//            
//        for (int c = 1; c <= i; c++) {
//            System.out.println("Įvesk skaičius: ");
//            sk = sc.nextInt();
//            if (sk % 2 == 0) {
//                sumaLyginiu = sumaLyginiu + sk;
//                kiekisLyginiu = kiekisLyginiu + 1;
//
//                if (kiekisLyginiu < 1) {
//                    System.out.println("Lyginių skaičių neįvesta");
//                }
//            } else {
//                sumaNelyginiu = sumaNelyginiu + sk;
//                kiekisNelyginiu = kiekisNelyginiu + 1;
//            }
//        }
//
//        System.out.println("Lyginių skaičių suma: ");
//        System.out.println(sumaLyginiu);
//        System.out.println("Nelyginių skaičių suma: ");
//        System.out.println(sumaNelyginiu);
//        if (sumaLyginiu == 0) {
//            System.out.println("Lyginių skaičių vidurkis=0");
//        } else {
//            System.out.println("Lyginių skaičius vidurkis: ");
//            System.out.println(vidurkisLyginiu = sumaLyginiu / kiekisLyginiu);
//        }
//
//        if (sumaNelyginiu == 0) {
//            System.out.println("Nelyginių skaičių vidurkis=0.0 ");
//
//        } else {
//            System.out.println("Nelyginių skaičius vidurkis: ");
//            System.out.println(vidurkisNelyginiu = sumaNelyginiu / kiekisNelyginiu);
//        }

    }

}
