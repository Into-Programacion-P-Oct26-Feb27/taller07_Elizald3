/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author LEGION
 */
public class PROBLEMA01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String repo_final = "Listado de jugadores\n";
        String repo_edades="Listado de edades\n";
        String info_final="";
        String nombre;
        String posicion;
        int edad;
        double estatura;
        int cont=0;
        double sumaEdades = 0;
        double sumaEstaturas = 0;
        double promedioedades = 0;
        double promedioestatura=0;
  
       
        boolean bandera = true;
        while (bandera == true) {//true==true//false===true
            System.out.println("Nombre del jugador:");//estoy en el ciclo
            nombre = entrada.nextLine();

            System.out.println("Ingrese posicion del jugador:");
            posicion = entrada.nextLine();//100//-100
            System.out.println("Edad del jugador:");//estoy en el ciclo
            edad = entrada.nextInt();
            System.out.println("Estatura del jugador:");//estoy en el ciclo
            estatura = entrada.nextDouble();
            entrada.nextLine();
            cont= cont + 1;
            sumaEdades= sumaEdades+ edad;
            sumaEstaturas= sumaEstaturas+estatura;
            repo_final = String.format("%s%d. %s -%s-,"
                    + "edad %d, estatura %.2f\n", repo_final, cont, nombre, posicion
            , edad, estatura);
            repo_edades=String.format("%s%d\n",repo_edades, edad);
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si:");
            salir = entrada.nextLine();
            if (salir.equals("si")) {//100==-100
                bandera = false;
            }
            }
            if(cont>0){
                promedioedades= sumaEdades/cont;
                promedioestatura = sumaEstaturas/cont;
                        }
            info_final=String.format("%s%sPromedio de edades:  %.1f\n"
                    + "Promedio de estaturas: %.2f\n",repo_final, repo_edades, 
                    promedioedades, promedioestatura);

            System.out.printf("%s", info_final);
            
        }
    }