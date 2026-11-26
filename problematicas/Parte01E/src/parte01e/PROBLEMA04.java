/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte01e;

/**
 *
 * @author ASUS
 */
public class PROBLEMA04 {
     public static void main(String[] args) { 
          int contador = 1;
        int denominador = 1;
        int signo = 1;              
        double suma = 0;
        String serie = "";          

        while (contador <= 8) {
            suma = suma + signo * (1.0 / denominador);

            String operador;
            if (signo == 1) {
                operador = "+";
            } else {
                operador = "-";
            }

            if (contador == 1) {
                serie = String.format("%s1/%d", serie, denominador);
            } else {
                serie = String.format("%s %s 1/%d", serie, operador, denominador);
            }

            denominador = denominador + 2;
            signo = signo * -1;
            contador++;
        }

        System.out.printf("Serie: %s\n", serie);
        System.out.printf("Resultado: %.6f\n", suma);
      
        
        } 
}

      
    


    






    




    
    
    

