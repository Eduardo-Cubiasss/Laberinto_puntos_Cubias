package Jueguito;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Juego extends JPanel{
    
    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje();
    SegundoPersonaje segundoPersonaje = new SegundoPersonaje(laberinto);

    
    public Juego(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
                segundoPersonaje.teclaPresionada(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        setFocusable(true);
    }
    
    @Override
    public void paint(Graphics grafico){
        laberinto.paint(grafico);
        personaje.paint(grafico);
        segundoPersonaje.paint(grafico);
    }
    
    public static void main(String[] args) {
        JFrame miventa = new JFrame("Nombres grr");
        Juego game = new Juego();
        miventa.add(game);
        
        miventa.setSize(933, 558);
        miventa.setLocation(300, 22);
        miventa.setBackground(Color.WHITE);
        miventa.setVisible(true);
        
        miventa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true){
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            game.repaint();
            miventa.repaint();
        }
    }
}
