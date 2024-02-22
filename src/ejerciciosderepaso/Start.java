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
public class Start {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Que ejercicio quiere activar?");
        String menu = sc.nextLine();
        
        switch(menu){
            case "Bucle13":
                Bucle13 bucle13 = new Bucle13();
                bucle13.start();
                break;
            case "Bucle14":
                Bucle14 bucle14 = new Bucle14();
                bucle14.start();
                break;
        }
    }
}
