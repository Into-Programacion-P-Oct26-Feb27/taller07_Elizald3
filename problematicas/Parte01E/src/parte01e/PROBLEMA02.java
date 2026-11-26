/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte01e;

/**
 *
 * @author ASUS
 */
public class PROBLEMA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
    
        int n = 1;
        int termino;
        String reporte = "";   // cadena de acumulación

        while (n <= 10) {
            termino = n * (n + 1);
            reporte = String.format("%s%d\n", reporte, termino);
            n++;
        }

        System.out.printf("%s", reporte);
        
        
        
    }
    
}

