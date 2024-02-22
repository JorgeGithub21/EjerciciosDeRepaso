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
public class Bucle14 {
    public void start(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows");
        int rows = 8;
        
        for(int i=0; i <= rows -1; i++){
            for(int j=0; j <= i; j++){
                System.out.print("a" + "");
            }
            System.out.println("");
        }
        
    }
}
