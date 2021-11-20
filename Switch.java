/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Įvesk mėnesio skaičių: ");
//         int a= sc.nextInt();
//         switch (a) {
//             case 12:
//             case 1:
//             case 2:
//                 System.out.println("Žiema");
//                 break;
//             case 3:
//             case 4:
//             case 5:
//                 System.out.println("Pavasaris");
//                 break;
//             case 6:
//             case 7:
//             case 8:
//             System.out.println("Vasara");
//             break;
//             case 9:
//             case 10:
//              case 11:
//              System.out.println("Ruduo");
//             break;
//    
//    }
        
         Scanner sc= new Scanner (System.in);
        int pasirinkimas;
         int taskuKiekis1=0;
         int taskuKiekis2=0;
        do{
        System.out.println("Mesk kauliuką 0/1");
        pasirinkimas = sc.nextInt();
        if (pasirinkimas!=0){
  
            int kauliukas= (int) (Math.random() * 6)+1;
            System.out.println(kauliukas);
            taskuKiekis1=+kauliukas;
        }
       
        } while (pasirinkimas!=0);
        
        System.out.println("pabaiga");
        
     
//        kompas meta kauliuka
                
         int kauliukask= (int) (Math.random() * 6)+1;
            System.out.println(kauliukask);
            taskuKiekis1=+kauliukask;
        
        
    
        
        System.out.println("Statistika");
        
        System.out.println(taskuKiekis1);
        }

    }
    

