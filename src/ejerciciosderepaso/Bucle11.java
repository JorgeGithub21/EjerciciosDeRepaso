/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosderepaso;

/**
 *
 * @author AlumnoT
 */
public class Bucle11 {
    public static void main(String[] args){
        int cont = 1;
        int par = 0;
        int impar = 0;
        
        while(cont <= 200){
            if(cont % 2 == 0){
                par = par + cont;
            }
            else{
                impar = impar + cont;
            }
            cont++;
        }
        System.out.println("Está es la suma total de los números pares: " + par);
        System.out.println("Está es la suma total de los números impares: " + impar);
    }
}
