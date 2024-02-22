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
public class Bucle3 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige el bucle");
        int bucles = sc.nextInt();
        
        switch(bucles){
            case 1:
                int cont = 1;
                while(cont <= 200){
                    if(cont % 2 == 0){
                        System.out.println("Bucle 'WHILE': estos son sus números " + cont);
                    }
                cont++;
                }
                break;
            case 2:
                for(int i = 1;i <= 200; i++){
                    if(i % 2 == 0){
                        System.out.println("Bucle 'FOR': estos son sus números " + i);
                    }
                }
                break;
            default:
                System.out.println("Que no macho, elige un número " + 
                        "< que 3 y > que 0");
        }   
    }
}
