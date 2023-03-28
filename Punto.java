/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegrador.tpintegrador.g2.clase157;

/**
 *
 * @author Fabiana
 */
public class Punto {
    String [] resultadoPronostico;
    String [] resultadoPartido;
    public int mostrarPuntos(String [] partido, String [] pronostico){
        this.resultadoPartido = partido;
        this.resultadoPronostico = pronostico;
        int cont=0;
        for (int i=0; i < resultadoPartido.length; i++ ){
            if (resultadoPartido[i].equals(resultadoPronostico[i]))
                cont++;
        }
        
        return cont;
    }
    
}
