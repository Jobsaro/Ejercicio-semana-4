/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.semana.pkg4.pkg3;

/**
 *
 * @author DELL
 */
public class EjercicioSemana43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("los numeros primos entre 1 y 100 son:");
// creamos un for para indicar que un rango de 1 a 100 
        for (int num = 2; num <= 100; num++) {
            if (NumPrimo(num)) {
                System.out.print(num + " ");
            }
        }
    }
    // creamos un metodo para verificar si un numero es primo de for anterior
    public static boolean NumPrimo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
