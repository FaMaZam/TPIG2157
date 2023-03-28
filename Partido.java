/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegrador.tpintegrador.g2.clase157;

/**
 *
 * @author Fabiana
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Partido {
	String path;
	String elResultado[][];
	
	
	public Partido (){
	}
	public Partido (String path){
		this.path = path;
	}

	public String [][] evaluaResultado() throws IOException{ //String elResultado[][]
			
//*********************************************************
        this.path= "D:\\Fabiana\\Documents\\NetBeansProjects\\tpintegrador-g2-clase157\\tpintegrador-g2-clase157\\src\\main\\java\\trabajointegrador\\tpintegrador\\g2\\clase157\\resultados.csv";
        BufferedReader reader;
	this.elResultado = new String[3][4];
	reader = new BufferedReader(new FileReader(path));
	String line = reader.readLine();
        int i=0;
	while (line != null) {
        	elResultado[i]= line.split(";");
		//System.out.println(line);
		line = reader.readLine();
                i++;
			}
	reader.close();

		return elResultado;
	}
//**************************************************************************
        
public String[] mostrarResultadoPartido( String [][] elResultado){
    int filas=elResultado.length-1;
    String [] resultadoPartido = new String [filas];
    int j=1;
    for (int i=0; i<filas;i++){
          
            if (Integer.parseInt(elResultado[i+1][j])>Integer.parseInt(elResultado[i+1][j+1])){
                resultadoPartido[i]="L";
            }else{
                  if(Integer.parseInt(elResultado[i+1][j+1])>Integer.parseInt(elResultado[i+1][j])){
                            resultadoPartido[i]="V";
                  }else{
                      if(Integer.parseInt(elResultado[i+1][j])==Integer.parseInt(elResultado[i+1][j+1])){
                        resultadoPartido[i]="E";
                      
                  }
                
            }
        }
    
            
        }
      
    
    
    return resultadoPartido;
        }
}
    
    
