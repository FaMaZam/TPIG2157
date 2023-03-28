/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabajointegrador.tpintegrador.g2.clase157;

import java.io.IOException;

/**
 *
 * @author Fabiana
 */
public class TpintegradorG2Clase157 {

    public static void main(String[] args)throws IOException {
        Persona per1=new Persona();
        String pronostico[][]=per1.leerPronostico();
        
        System.out.print("\n\n******************** Muestra la info del archivo pronóstico *********************\n");
        for (int i=0; i< 3;i++){
            for( int j=0; j<5; j++){
                System.out.print(pronostico[i][j]+"\t\t");
            }
            System.out.println("\n");
        }
        System.out.print("************************************************************************************\n\n");
        System.out.print("\n\n******************* Muestra la info del archivo partido *************************\n");
        Partido par1= new Partido();
        String resultados[][]=par1.evaluaResultado();
        for (int i=0; i< 3;i++){
            for( int j=0; j<4; j++){
                System.out.print(resultados[i][j]+"\t\t");
            }
            System.out.println("\n");
        }
        System.out.print("**************************************************************************************\n\n");
        System.out.print("\n\n********** Muestra RESULTADOS Partido *******************\n");
        String [] parti = par1.mostrarResultadoPartido(resultados);
        for( int i=0; i< parti.length;i++){
            System.out.print(parti[i]+"   ");
        }
        System.out.print("\n***********************************************************\n\n");
        System.out.print("\n\n********** Muestra RESULTADOS Pronóstico *******************\n");
        String [] prono = per1.mostraResultadoPronostico(per1.leerPronostico());
        for( int i=0; i< prono.length;i++){
            System.out.print(prono[i]+"   ");
        }
        System.out.print("\n***********************************************************\n\n");
        System.out.print("\n\n***************** PUNTOS OBTENIDOS ************************\n");
        int puntos;
        Punto punto = new Punto();
        puntos = punto.mostrarPuntos(parti, prono);
        System.out.print("\n                        "+ puntos+"         ");
        System.out.print("\n***********************************************************\n");
    }
}
