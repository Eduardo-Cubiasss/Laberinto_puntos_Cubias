/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jueguito;
import Jueguito.Laberinto;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author 50369
 */
public class SegundoPersonaje {
    private int x = 0; // Posición inicial del nuevo personaje
    private int y = 280;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;
    private Laberinto laberinto;
     
    public SegundoPersonaje(Laberinto laberinto) {
        this.laberinto = laberinto;
    }
    public void paint(Graphics grafico){
        
        grafico.setColor(Color.green);
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.yellow);
        grafico.drawOval(x, y, ancho, alto);
        
    }
    public void verificarCasillaGanadora() {
        int[][] laberintoArray = laberinto.obtieneLaberinto();
        if (laberintoArray[y / 40][x / 40] == 2) {
            JOptionPane.showMessageDialog(null, "Has ganado jugador amarillito");
        }
    }
    
    public void  teclaPresionada(KeyEvent evento){
        int [][] laberintoArray =laberinto.obtieneLaberinto();
        if (evento.getKeyCode()==65) {//IZQUIERDA
            if (laberintoArray[y/40][(x/40)-1]!=1) {
                x=x-movimiento;
            }
        }
        if (evento.getKeyCode()==68) {//DERECHA
            if (laberintoArray[y/40][(x/40)+1]!=1) {
                x=x+movimiento;
            }
        }
        if (evento.getKeyCode()==83) {//ABAJO
            if (laberintoArray[(y/40)+1][x/40]!=1) {
                y=y+movimiento;
            }
        }
        if (evento.getKeyCode()==87) {//ARRIBA
            if (laberintoArray[(y/40)-1][x/40]!=1) {
                y=y-movimiento;
            }
        }
        verificarCasillaGanadora();
    }
    
}
