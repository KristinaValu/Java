/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciklai;

/**
 *
 * @author Asus
 */
public class Ciklai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        int sk1 = 1;
//        int sk2 = 5;
//        int suma=0;
//        while(sk1<=sk2) {
//            suma=suma+sk1;
//        sk1=sk1+1;}
//        System.out.println(suma);
//        
                
//        System.out.println("Įvesk jei skičius 1 jei herbas 2");
//        int spejimas =sc.nextInt();
//        if (spejimas ==0) {
//            System.out.println("baigiam");
//             }
//        else if (spejimas ==1 ||spejimas==2){
//            int atsitiktinis =(int) (Math.random ()*2)+1;
//            
//        }
//        
 
//            System.out.println("pabaiga");

        System.out.println("Įvesk skaičių nuo: ");
       int nuo = sc.nextInt();
        System.out.println("Įvesk skaičių iki: ");
        int iki = sc.nextInt();
               
        int i=nuo;
        while(i<= iki) {
            int j=nuo;
            while (j<=iki) { System.out.println("i*j");
                System.out.println("");
                j+=1;
            }
            System.out.println();
            i+=1;
        }
        
        
        

        }

    }
