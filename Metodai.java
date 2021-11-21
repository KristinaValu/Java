/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodai;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Metodai {

    public static int perimetras(int a, int b, int c) {
        int p = a + b + c;
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įvesk trikampio kraštinių ilgį?");
        System.out.println("pirma kraštine");
        int a1 = sc.nextInt();
        System.out.println("antra krastinė");
        int b1 = sc.nextInt();
        System.out.println("trecia krastinė");
        int c1 = sc.nextInt();

        System.out.println("Įvesk antro trikampio kraštinių ilgį?");
        System.out.println("pirma kraštine");
        int a2 = sc.nextInt();
        System.out.println("antra krastinė");
        int b2 = sc.nextInt();
        System.out.println("trecia krastinė");
        int c2 = sc.nextInt();

        int trikampis1 = perimetras(a1, b1, c1);
        System.out.println("Pirno trikampio perimetras");
        System.out.println(trikampis1);

        int trikampis2 = perimetras(a2, b2, c2);
        System.out.println("Antro trikampio perimetras");
        System.out.println(trikampis2);

        if (trikampis1 > trikampis2) {
            System.out.println("Pirmo trikampio perimetras didesnis");
        }
        if (trikampis1< trikampis2) {
            System.out.println("Antro trikampio perimetras didenis");
        } if (trikampis1==trikampis2) {
            System.out.println("Trikampiai lygūs");

        }

//        int[] skM = new int[kiek];
//        
//
//        for (int i = 0; i < kiek; i++) {
//            System.out.println("Ivesk skaiciu");
//            skM[i] = sc.nextInt();
//        
//       public static void spausdinamSakaiciuMasyva(int[] masyvas) {
//        for (int i = 0; i < masyvas.length; i++) {
////            System.out.print(masyvas[i]);
////            System.out.print(" ");
//            spausdinamTaskus(masyvas[i]);
//        }
////        System.out.println();
//    }
//
//    public static int suma (int a, int b) {
//        int s = a + b;
//        return s;
//    }
//
//    public static void spausdinamTaskus (int kiek) {
//        for (int i = 0; i < kiek; i++) {
//            System.out.print(".");
//        }
//        System.out.println();
//    }
// 
//    public static void main(String[] args) {
// 
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Kiek bus skaiciu?");
//        int kiek = sc.nextInt();
//
//        int[] skM = new int[kiek];
//
//        for (int i = 0; i < kiek; i++) {
//            System.out.println("Ivesk skaiciu");
//            skM[i] = sc.nextInt();
//        }
//
//        int[] kvM = new int[kiek];
//
//        for (int i = 0; i < kiek; i++) {
//            kvM[i] = skM[i] * skM[i];
//        }
//
//        spausdinamSakaiciuMasyva(skM);
////        for (int i = 0; i < skM.length; i++) {
////            System.out.print(skM[i]);
////            System.out.print(" ");
////        }
////        System.out.println();
// 
//        spausdinamSakaiciuMasyva(kvM);
////        for (int i = 0; i < kvM.length; i++) {
////            System.out.print(kvM[i]);
////            System.out.print(" ");
////        }
////        System.out.println();
//
    }

}
