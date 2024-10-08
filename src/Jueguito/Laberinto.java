package Jueguito;

import java.awt.Color;
import java.awt.Graphics;


public class Laberinto {
    private int fila =0;
    private int columna=0;
    private final int numeroFilas=13;
    private final int numeroColumnas=23;
    private final int anchoBloque=40;
    private final int altoBloque=40;
    
    public void paint(Graphics grafico){
        int[][] laberinto = obtieneLaberinto();
        
        for(fila=0;fila<numeroFilas;fila++){
            for(columna=0;columna<numeroColumnas;columna++){
                if (laberinto[fila][columna]==1) {
                    grafico.setColor(Color.black);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque);
                    grafico.setColor(Color.yellow);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
                if (laberinto[fila][columna]==2) {
                    grafico.setColor(Color.yellow);
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque);
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                    
                }
            }
        }
    }
    
    public int[] [] obtieneLaberinto(){
        int laberinto[][]=
            {{0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1},
            { 1,0,1,0,0,1,1,1,0,0,0,0,1,0,0,0,1,0,1,1,1,1,1},
            { 1,0,0,0,0,1,1,1,0,1,1,0,1,0,1,1,1,0,1,0,0,0,0},
            { 1,1,1,1,0,1,0,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,0},
            { 1,1,1,1,0,1,1,1,0,1,1,0,0,0,1,1,1,0,0,0,1,1,0},
            { 1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2},
            { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            { 0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1},
            { 1,0,1,0,0,1,1,1,0,0,0,0,1,0,0,0,1,0,1,1,1,1,1},
            { 1,0,0,0,0,1,1,1,0,1,1,0,1,0,1,1,1,0,1,0,0,0,0},
            { 1,1,1,1,0,1,0,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,0},
            { 1,1,1,1,0,1,1,1,0,1,1,0,0,0,1,1,1,0,0,0,1,1,0},
            { 1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,2}
            };
        return laberinto;
    }
}
