/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monetoszaidimas;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MonetosZaidimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int pasirinkimas;
        do{
        System.out.println("Spėk (0/1/2)");
        pasirinkimas = sc.nextInt();
        if (pasirinkimas!=0){
//            1 H
//           2S       
            int moneta= (int) (Math.random() * 2)+1;
            
            if(pasirinkimas==moneta) {
                System.out.println("atspejai");}
            else{ System.out.println("neatspejai");
            }
        }
       
        } while (pasirinkimas!=0);
        
        System.out.println("pabaiga");
        }
        
        
    }
        
      
