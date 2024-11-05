/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.semana.pkg4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjercicioSemana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // llamamos al scanner y creamos un arreglo para que me me agrege el numero de ventas
        Scanner manito = new Scanner (System.in);
        ArrayList<Double> ventas = new ArrayList<>();
    
       //que imprima y ingrese el n umero de ventas
        System.out.println("Ingrese el numero de a ingresar de ventas: ");
        int numventas = manito.nextInt();
        
        // creamos un ciclo for para que me corra una vez y me proses los numeros de ventas que se van a ejecutar
        for (int i = 0; i < numventas; i++) {
            System.out.println("Ingrese el valor de la venta "+(i+1)+": ");
            double venta = manito.nextDouble();
            ventas.add(venta);
        }
        
        //abrimos otro ciuclo for para que me haga la suma de las ventas totales
        double totalventas = 0;
        for (double venta : ventas){
            totalventas += venta;
        }
        System.out.println("La suma de todas las ventas es: "+ totalventas);
    }
    
}
