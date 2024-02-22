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
public class Bucle10 {
    public static void main (String[] args){
        
        int num;
        boolean num10 = false;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            
            if(num == 10){
                num10 = true;
            }
            
        }while(num != -1);
        
        if(num10){
            System.out.println("Se ha encontrado al menos una nota con un 10");
        }
        else{
            System.out.println("No se ha encontrado ninguna nota con un valor 10"); 
        }
            
    }
}
