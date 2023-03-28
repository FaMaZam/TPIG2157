/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegrador.tpintegrador.g2.clase157;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
 /*
 * @author Fabiana
 */
public class Persona {
    public String ruta;
    public String tempo[][];
    
    public String [][] leerPronostico()throws IOException{
        this.ruta= "D:\\Fabiana\\Documents\\NetBeansProjects\\tpintegrador-g2-clase157\\tpintegrador-g2-clase157\\src\\main\\java\\trabajointegrador\\tpintegrador\\g2\\clase157\\pronostico.csv";
        BufferedReader reader;
	this.tempo = new String[3][5];
	reader = new BufferedReader(new FileReader(ruta));
	String line = reader.readLine();
        int i=0;
	while (line != null) {
        	tempo[i]= line.split(";");
		//System.out.println(line);
		line = reader.readLine();
                i++;
			}
	reader.close();
        return tempo;
    }
    public String [] mostraResultadoPronostico (String[][] tempo){
        int filas = tempo.length-1;
        String [] resultadoPronostico = new String[filas];
        int j=1;
        for (int i=0; i<filas;i++){
            if(tempo[i+1][j].equals("x")){
                resultadoPronostico[i]="L";
            }else{
                if (tempo[i+1][j+1].equals("x")){
                   resultadoPronostico[i]="E"; 
                }else{
                    if (tempo[i+1][j+2].equals("x")){
                   resultadoPronostico[i]="V"; 
                }
                }
            }
              
            
        }
        return resultadoPronostico;
    }
    
}


