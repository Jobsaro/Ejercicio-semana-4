/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.semana.pkg4.pkg2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjercicioSemana42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // abrimos un scannner 
        Scanner scanner = new Scanner (System.in);
        
        //hacemos print para que me muestrre y se me ingrese el dia de la semana
        System.out.println("Ingrese un dia de la semana: ");
        String dia = scanner.nextLine().toLowerCase();
        
        //creamos un switchs para que cuando se ingrese un dia se muestre un print diferente en pantalla
        switch(dia){
            case "lunes":
                System.out.println("Es un dia para chambear");
                break;
            case "martes":
                System.out.println("Es un dia para chambear");
                break;
            case "miercoles":
                System.out.println("Es un dia para chambear");
                break;
            case "jueves":
                System.out.println("Es un dia para chambear");
                break;
            case "viernes":
                System.out.println("Es un dia para chambear");
                break;
            case "sabado":
                System.out.println("Es un dia de relax");
                break;
            case "domingo":
                System.out.println("Es un dia de relax");
                break;
        }
        

    }
    
}
