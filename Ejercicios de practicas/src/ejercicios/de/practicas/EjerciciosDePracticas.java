/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.de.practicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EjerciciosDePracticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Ejercicio 1
        for (int i = 0; i < 50; i++) {
            if (i==10 || i==20 || i==30 || i==40 || i==50){
                System.out.println("");
        }
             System.out.print("@");
        
        
        
        
        
        
        
         /* Ejercio 2 
        int numero; 
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero"));
        
  
                
        for (int i = 0; i < 10; i++) {
            System.out.println(numero + "x" +i+"=" +numero* i);
         */
/* Ejercicio 3 */

      int filas; 
        filas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero para el numero de filas:" ));
      for (int i = 1; i <= filas ; i++) {
           for(int x= 1; x<=i; x++)
                System.out.println("*");
        }
        System.out.println("");
    }
}


