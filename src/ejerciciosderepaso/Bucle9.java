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
public class Bucle9 {
    public void activar(){
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1;i <= 10; i++){
            System.out.println("Introduzca un número: ");
            int num1 = sc.nextInt();
            System.out.println("Introduzca otro número: ");
            int num2 = sc.nextInt();
            
            int suma = num1 + num2;
            int producto = num1 * num2;
            
            System.out.println("Si sumas " + num1 + " + " 
                + num2 + " el resultado sera = " + suma);
            System.out.println("Si multiplicas  " + num1 + " * " 
                + num2 + " el resultado sera " + producto);
        }
        System.out.println("***EL PROGRAMA SE HA DETENIDO***");
        
    }
}
