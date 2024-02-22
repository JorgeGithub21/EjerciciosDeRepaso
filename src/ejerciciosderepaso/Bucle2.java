/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosderepaso;

import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class Bucle2 {
    public static void main (String [] args){

        
        //while(cont <= 200){
          //  System.out.println("Número: " + cont);
            //cont+=2;
        //}
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige el bucle que quieras ejecutar");
        int bucles = sc.nextInt();
        
        
        switch (bucles){
            case 1:
                int cont = 2;
                while(cont <= 200){
                System.out.println("Bucle 'while': este es el número " + cont);
                break;
            }
            case 2:
                for(int i = 2;i <= 200; i+=2){
                    System.out.println("Bucle 'for': este es el número: " + i);
                }
                break;
            default:
                System.err.println("No no, elige un número < que 3 y > que 0");
        }  
    }
}
