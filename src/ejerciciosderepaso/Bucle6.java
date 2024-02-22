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
public class Bucle6 {
    public static void main(String[] args){
        int cont = 1;
        int num = 0;
        int pos = 0;
        int neg = 0;
        
        Scanner sc = new Scanner(System.in);
        
        while(cont <= 10){
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            if(num > 0){
                System.out.println("**POSITIVO**");
                pos++;
            }
            else if(num < 0){
                System.out.println("**Negativo**");
                neg++;
            }
            cont++;
        }
        System.out.println("*Hay " + pos + "números POSITIVOS*");
        System.out.println("*Hay " + neg + "números NEGATIVOS*");
        
        /*
        for(int i = 0;i <= 10; i++){
            System.out.println("Introduce un número");
            num = sc.nextInt();
            if(num > 0){
                System.out.println("**POSITIVO**");
                pos++;
            }
            else if(num < 0){
                System.out.println("**NEGATIVO**");
                neg++;
            }
        }
        System.out.println("Hay tantos números positivos " + pos);
        System.out.println("Hay tantos números negativos " + neg);
        */
        
        
    }
}
