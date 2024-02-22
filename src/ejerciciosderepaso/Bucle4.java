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
public class Bucle4 {
    public static void main (String[] args){
    int cont = 1;
        
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Introduzca un número, por favor");
    int num = sc.nextInt();

        while(cont <= num){
            System.out.println("Llegas hasta aquí " + cont);
            cont++;
        }
    }
}
