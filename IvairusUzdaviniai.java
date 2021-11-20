/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ivairus.uzdaviniai;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class IvairusUzdaviniai {

    /**
     * @param args the command line arguments
     */
//    1 uždvinys
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        
//        System.out.println("Įvesk skaičių:");
//        int i= sc.nextInt();
//        if (i>0){ 
//            System.out.println(Math.sqrt(i));}
//        else if (i<0) {System.out.println("Šaknies ištraukti negalima");}
//    }
//        
//       
//        
//    }
    
 public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        
//        System.out.println("Įvesk skaičių:");
//         int i= sc.nextInt();
//         if (i%4==0)
//         {System.out.println("Kvadratą sudaryti galima");}
//         
//         else { System.out.println("Kavdrato sudryti negalima");
//          }
//  
Scanner sc = new Scanner(System.in);
//
//        System.out.println("Kiek bus elementu: ");
//        int dydis = sc.nextInt();
//
//        int[] masyvas = new int[dydis];
//        double sum=0;
//        for (int i=0; i<masyvas.length;i++){
//            System.out.println("Skaicius: " + (i+1));
//            masyvas[i]=sc.nextInt();
//            sum+=masyvas[i];
//        }
//        sum=sum/masyvas.length;
//        for (int i=0; i<masyvas.length; i++)
//        {if (masyvas[i]>sum){System.out.println(masyvas[i] +"didesni už vidurkį: "+sum);
//        }
//        }
        
                

//        for (int i = 0; i < masyvas.length; i++) {
//            System.out.println(i);
//            masyvas[i] = sc.nextInt();
//        }
//        
//        for (int i = 0; i < masyvas.length; i++) {
//            System.out.println(masyvas[i]);
//         
//     }
//        
//        
//        for (int i=0; i<masyvas.length; i++) {
//            System.out.println(masyvas[i]);
//            System.out.println(" ");
//        }
//
//     System.out.println();
//     
//     double vidurkis=0;
//     int sum=0;
//     for (int i=0; i<masyvas.length; i++) {
//     sum+=masyvas[i];
//     }
//     
//     
     
     int[]m ={651,818,987,2,-4,721,-15};
     for (int i=0; i <m.length; i++) {
         System.out.println( "element" +i+ ":" + m[i]);
     }
         System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < m.length; i++){  
                        System.out.print(m[i] + " ");  
                }  
                System.out.println();  
                
                  bubbleSort(m);
     
     System.out.println("Array After Bubble Sort");  
                for(int i=0; i < m.length; i++){  
                        System.out.print(m[i] + " ");  
 }
 }
         
 

