/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package masyvai;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Masyvai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int [] masyvas= new int [6];
//        
//        masyvas[0] = 651;
//        masyvas[1] = 1;
//        masyvas[2] = 12;
//        masyvas[3] = 6;
//        masyvas[4] = 31;
//        masyvas[5] = 88;
//        
//        int sk=2;
//        
//        System.out.println(masyvas [sk]);
//
//        int sum=0;
//    for ( int i=0; i <masyvas.length; i++)
//    { sum+=masyvas[i];}
//        System.out.println(sum);

//           Scanner sc=new Scanner(System.in);
//          System.out.println("Kiek bus elementų: ");
//          int dydis=sc.nextInt();
//          int[] masyvas=new int [dydis];
//          
//          
//          for (int i=0; i<masyvas.length; i++) {
//              System.out.println(i);
//              masyvas[i]=sc.nextInt();
//          }
//          
//          
//    for (int i=0; i<masyvas.length; i++) {
//             System.out.println(masyvas [i]);
//             System.out.println(" ");
//          }
//          System.out.println();
//          
//        int[] m = {651, 818, 987, 2, -4, 721, -15};
//        for (int i = 0; i < m.length; i++) {
//            if (m[0] > m[i]) {
//                m[0] = m[i];
//            }
//        }
//
//        for (int i = 0; i < m.length; i++) {
//            System.out.println(m[i]);
//            System.out.print(" ");
//
//        }
//        System.out.println();
//
// int[] m = {651, 818, 987, 2, -4, 721, -15}; padidinti masyva
// int [] n  = new int [m.length +2];
//// * 0 0 0 0 0 0 0 0 0 prisidejo 2, bet uzpidyta 0
//int[] m = {652, 818, 987, 2, -4, 721, -15};
//int [] n= new int [m.length-1];
//for (int i=0; i<m.length-1; i++)
//{System.out.println(i);
//m[i]
//}
//      
//                
//int eilutes = 3;
//int elementai=4;
//double elementas=0;
//        
//double [] [] a = new double [eilutes] [elementai];
//double [] vienas =new double [eilutes];
//
//
//      for (int i=0; i<a.length;i++) {
//      for (int j=0; j<a[i].length; j++) {
//      elementas=((Math.random()*10)+1);
//      a[i][j]=elementas;
//          System.out.print(a[i][j]);
//          System.out.println(" ");
//      }
//          System.out.println();
//          
//          
//          for ( i=0; i<a.length; i++) {
//          double suma=0;
//          double vidurkis;
//          for (int j=0; j<a[i].length; j++)
//          {suma+=a[i][j];
//          }
//          vidurkis =suma/a[i].length;
//          vienas[i]=vidurkis;
//          }
//          
//          for (int j=0; j<vienas.length; j++)
//          {System.out.println(vienas [j]);
//          }

//Vidurkių įrašymas į naują vienmtį masyvą
//        int[][] masyvas = {
//            {2, 12, 13, 14, 15},
//            {21, 22, 23, 24, 25},
//            {31, 32, 33, 34, 35}
//        };
//
//        /*   Vienmatis masyvas, kuriame rašomi vidurkiai */
//        double[] m1 = new double[masyvas.length];
//
//        for (int y = 0; y < masyvas.length; y++) {
//            double sum = 0;
//        for (int x = 0; x < masyvas[y].length; x++)
//        {sum += masyvas[y][x];
//            }
//        double average=sum/masyvas[y].length;
//        m1[y]=average;
//        }
////Spausdiname pradinį daugiamatį masyvą
//            for (int y = 0; y < masyvas.length; y++) {
//                for (int x = 0; x < masyvas[y].length; x++) {
//                    System.out.print(masyvas[y][x]);
//                    System.out.print("  ");
//                }
//                System.out.println();
//
//            }
//
////spausdina vienmatį masyvą
//            for (int i = 0; i < m1.length; i++) {
//                System.out.print(m1[i]);
//                System.out.print("  ");
//            }
//            System.out.println();
//            
//            pabaiga
//            
            
            
            
            
            
            

//for (int y=0; y<a.length; y++)
//{ for (int x=0; x<a [y] [x]);
//
//    System.out.println("");}
//        System.out.println();
//for (int i=0; i<m.length; i++){
//    System.out.println(m[i]);
//    System.out.println(n[i]);
//    System.out.print("");}
//        System.out.println();}
// 
//

//ištrynimas
int kuris=0;     
int [] m = 
{10,15,20,25,30,35,40};

if (m.length>0 && kuris>=0 && kuris<m.length){
int [] n = new int [m.length-1];
for (int i=0; i<m.length; i++)
    if (kuris>i)
    {n[i]=m[i];
    }
    else if (kuris<i) {
    n[i-1]=m[i];
    }
m=n;
}

  for(int i=0; i<m.length; i++){
      System.out.println(m[i]);
      System.out.print("");
  }
    
    
        }
    }

