package com.jogo;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Interativo2 extends JFrame {
    private JPanel tela;
    private int px;
    private int py;
    private boolean jogando = true;
  
    private final int FPS = 1000 / 20;
    private boolean[] controleTecla = new boolean[4]; 


    public Interativo2() {
        super.addKeyListener(new KeyListener() {
            @Override
            // evento para cada tecla apertada
            public void keyTyped(KeyEvent e) {
                
            }
            @Override
            // evento para cada tecla liberada
            public void keyReleased(KeyEvent e) {
                setaTecla(e.getKeyCode(), false);
            }

            @Override
            // evento para cada tecla pressionada
            public void keyPressed(KeyEvent e) {
                setaTecla(e.getKeyCode(), true);
                
            }

        });
        // desenhar os elementos na tela
        tela = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, tela.getWidth(), tela.getHeight());

                int x = tela.getWidth()/2 - 20 + px;
                int y = tela.getHeight()/2 - 20 + py;
                g.setColor(Color.BLUE);
                g.fillRect(x, y, 40, 40);
                g.drawString("Agora eu estou em " + x + "x" + y, 5, 10);
            }

        };
        getContentPane().add(tela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);
        setVisible(true);

        // executar a interatividade do jogo
        
    }

    public void inicia() {
        long prxAtualizacao = 0;
        while (jogando) {
            if (System.currentTimeMillis() >= prxAtualizacao) {
                atualizaJogo();
                tela.repaint();
                prxAtualizacao = System.currentTimeMillis() + FPS;
            }
        }
    }
    private void atualizaJogo() {
            if (controleTecla[0]) 
                py--; //vai pra cima
             else if (controleTecla[1]) 
                py++; // vai pra baixo
             if (controleTecla[2]) 
                px--; //vai pra esquerda               
             else if (controleTecla[3]) 
                px++;  // vai pra direita
    }

    private void setaTecla(int tecla, boolean pressionada) {
        switch (tecla) {
            case KeyEvent.VK_ESCAPE:
                // tecla esc
                jogando = false;
                dispose();
                break;
            case KeyEvent.VK_UP:
                // seta pra cima
                controleTecla[0] = pressionada;
               
                break;
            case KeyEvent.VK_DOWN:
                // seta pra baixo
                controleTecla[1] = pressionada;
               
                break;
            case KeyEvent.VK_LEFT:
                // seta pra esquerda
                controleTecla[2] = pressionada;
               
                break;
            case KeyEvent.VK_RIGHT:
                // seta pra direita
                controleTecla[3] = pressionada;
               
                break;
        }
    }  


    public static void main(String[] args) {
        Interativo2 jogo = new Interativo2();
        jogo.inicia();
    }

}
