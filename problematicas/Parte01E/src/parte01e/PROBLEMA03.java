/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte01;

/**
 *
 * @author LEGION
 */
public class PROBLEMA03 {

    public static void main(String[] args) {
        int n = 1;
        int limite = 6;
        int resultado = 0;
        String reporte = "";

        while (n <= limite) {
            resultado = (n * n) + 1;
            reporte = String.format("%s%d\n", reporte, resultado);
            n = n + 1;
        }

        System.out.printf("%s", reporte);
    }
}