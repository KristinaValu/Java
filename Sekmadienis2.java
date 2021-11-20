/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sekmadienis2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Sekmadienis2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("Įvesk skaičių 1: ");
         int a= sc.nextInt();
         System.out.println("Įvesk skaičių 2: ");
         int b= sc.nextInt();
         System.out.println("Įvesk skaičių 3: ");
         int c= sc.nextInt();
         System.out.println("Įvesk skaičių 4: ");
         int d= sc.nextInt();
         
         System.out.println("Didžiausias skaičius: ");
        System.out.println(Math.max(a, d));
        System.out.println( );
       
         System.out.println("Skaičiai nuo mažiausio iki didžiausio: ");
        
         if (a<b && b<c && c<d){
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);}
         
         else if (a<b && b<d && d<c){
         System.out.println(a);
         System.out.println(b);
         System.out.println(d);
         System.out.println(c);}
         
         else if (a<d && d<b && b<c){
         System.out.println(a);
         System.out.println(d);
         System.out.println(b);
         System.out.println(c);}
         
         else if (a<d && d<c && c<b){
         System.out.println(a);
         System.out.println(d);
         System.out.println(c);
         System.out.println(b);}
         
         else if (a<c && c<d && d<b){
         System.out.println(a);
         System.out.println(c);
         System.out.println(d);
         System.out.println(b);}
         
         else if (a<c && c<b && b<d){
         System.out.println(a);
         System.out.println(c);
         System.out.println(b);
         System.out.println(d);}
         
         else if (b<a && a<c && c<d){
         System.out.println(b);
         System.out.println(a);
         System.out.println(c);
         System.out.println(d);}
         
         else if (b<a && a<d && d<c){
         System.out.println(b);
         System.out.println(a);
         System.out.println(d);
         System.out.println(c);}
         
         else if (b<c && c<a && a<d){
         System.out.println(b);
         System.out.println(c);
         System.out.println(a);
         System.out.println(d);}
         
         else if (b<c && c<d && d<a){
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(a);}
         
         else if (b<d && d<c && c<a){
         System.out.println(b);
         System.out.println(d);
         System.out.println(c);
         System.out.println(a);}
         
         else if (b<d && d<a && a<c){
         System.out.println(b);
         System.out.println(d);
         System.out.println(a);
         System.out.println(c);}
         
         else if (c<a && a<b && b<d){
         System.out.println(c);
         System.out.println(a);
         System.out.println(b);
         System.out.println(d);}
         
           else if (c<a && a<d && d<b){
         System.out.println(c);
         System.out.println(a);
         System.out.println(d);
         System.out.println(b);}
           
           else if (c<b && b<a && a<d){
         System.out.println(c);
         System.out.println(b);
         System.out.println(a);
         System.out.println(d);}
           
           else if (c<b && b<d && d<a){
         System.out.println(c);
         System.out.println(b);
         System.out.println(d);
         System.out.println(a);}
         
         
         else if (b<d && d<a && a<c){
         System.out.println(c);
         System.out.println(d);
         System.out.println(a);
         System.out.println(b);}
         
         else if (c<d && d<b && b<a){
         System.out.println(c);
         System.out.println(d);
         System.out.println(b);
         System.out.println(a);}
         
         else if (d<a && a<b && b<c){
         System.out.println(d);
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);}
         
         else if (d<a && a<c && c<b){
         System.out.println(d);
         System.out.println(a);
         System.out.println(c);
         System.out.println(b);}
         
         else if (d<b && b<a && a<c){
         System.out.println(d);
         System.out.println(b);
         System.out.println(a);
         System.out.println(c);}
         
         else if (d<b && b<c && c<a){
         System.out.println(d);
         System.out.println(b);
         System.out.println(c);
         System.out.println(a);}
         
         else if (d<c && c<b && b<a){
         System.out.println(d);
         System.out.println(c);
         System.out.println(b);
         System.out.println(a);}
         
         else if (d<c && c<a && a<b){
         System.out.println(d);
         System.out.println(c);
         System.out.println(a);
         System.out.println(b);}
                 
        
//int  [] arr = {a;b;c;d}
        
    }
    
}


