package Jueguito;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;



public class Personaje {
    Laberinto lab = new Laberinto();
    private int x=0;
    private int y=0;
    private final int ancho=40;
    private final int alto=40;
    private final int movimiento=40;
    
    public void paint(Graphics grafico){

        grafico.setColor(Color.black);
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.white);
        grafico.drawOval(x, y, ancho, alto);
    }
    public void verificarCasillaGanadora() {
        int[][] laberinto = lab.obtieneLaberinto();
        if (laberinto[y / 40][x / 40] == 2) {
            JOptionPane.showMessageDialog(null, "Has ganado jugador negrakso");
        }
    }
    public void  teclaPresionada(KeyEvent evento){
        int [][] laberinto =lab.obtieneLaberinto();
        if (evento.getKeyCode()==37) {//IZQUIERDA
            if (laberinto[y/40][(x/40)-1]!=1) {
                x=x-movimiento;
            }
        }
        if (evento.getKeyCode()==39) {//DERECHA
            if (laberinto[y/40][(x/40)+1]!=1) {
                x=x+movimiento;
            }
        }
        if (evento.getKeyCode()==40) {//ABAJO
            if (laberinto[(y/40)+1][x/40]!=1) {
                y=y+movimiento;
            }
        }
        if (evento.getKeyCode()==38) {//ARRIBA
            if (laberinto[(y/40)-1][x/40]!=1) {
                y=y-movimiento;
            }
        }
        verificarCasillaGanadora();
    }
    
    
}

