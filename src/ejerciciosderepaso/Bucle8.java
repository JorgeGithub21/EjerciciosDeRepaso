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
public class Bucle8 {
    public static void main(String[] args){
        int pos = 0;
        int neg = 0;
        int num;
        
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("*INTRODUZCA UN NÚMERO*");
        num = sc.nextInt();
            if(num > 0){
                System.out.println("*POSITIVO*");
                pos++;
            }
            else if(num < 0){
                System.out.println("*NEGATIVO*");
                neg++;
            }
        }while(num != 0); 
        
        System.out.println("***EL PROGRAMA SE HA DETENIDO***");
        System.out.println("Hay tantos " + pos + " números POSITIVOS");
        System.out.println("Hay tantos " + neg + " números NEGATIVOS");
    }
}
