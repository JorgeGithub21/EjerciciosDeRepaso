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
public class Bucle12 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un primer número:");
        int a = sc.nextInt();
        System.out.println("Introduce un segundo número:");
        int b = sc.nextInt();
        
        int calculo = (int) Math.pow(a, b);
        
        System.out.println("Elevar este número " + a + " por este número " + b + " da este resultado " + calculo);
        
    }
}
