/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skaiciai;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Skaiciai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int sk1;
//        int sk2;
//        System.out.println("Ivesk 1-a skaiciu");
//         sk1 = sc.nextInt();
//        System.out.println("Ivesk 2-a skaiciu");
//        sk2 = sc.nextInt();
//        System.out.println("suma");
//        System.out.println(sk1 + sk2);
//        // TODO code application logic here
int a;
int b;
int c;

        System.out.println("iveskite 1-a skaiciu");
        a=sc.nextInt();
         System.out.println("iveskite 2-a skaiciu");
          b=sc.nextInt();
          System.out.println("iveskite 3-a skaiciu");
           c=sc.nextInt();
           
           
           if (a+b>c){
               if (b+c>a) { 
                   if (c+a>b) {
                       System.out.println("taip");
                   } else {
                       System.out.println("ne");
                   }
           }else {
                   System.out.println("ne");
               }
           ;
           
     
          


    }

}
