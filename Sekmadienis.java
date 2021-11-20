/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sekmadienis;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Sekmadienis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int c;
        int sk = 0;
        int didziausias=0;

        System.out.println("Įvesk kiek skaičių reikės įvesti:");
        i = sc.nextInt();

       for (c=1;c<=i;c++)
       { System.out.println("Įvesk skaičius:");
       sk = sc.nextInt();
       
        if (sk>didziausias){ didziausias=sk;}
    
        }
       
      System.out.println("Didžiausias: "+ didziausias);
       }
      
    }


