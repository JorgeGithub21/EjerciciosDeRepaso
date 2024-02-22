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
public class Activar {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige el proyecto que quieras ejecutar");
        int activar = sc.nextInt();
        
        switch(activar){
            case 1:
                Bucle1 bucle1 = new Bucle1();
                bucle1.activar();
                break;
            case 2:
                Bucle9 bucle9 = new Bucle9();
                bucle9.activar();
                break;
            case 3:
                Bucle10 bucle10 = new Bucle10();
                bucle10.activar();
                break;
        }          
    }
}
