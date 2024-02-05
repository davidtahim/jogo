package com.jogo;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Interativo extends JFrame {
    private JPanel tela;
    private int px;
    private int py;
    private boolean jogando = true;
    private final int FPS = 1000 / 20;

    public void inicia() {
        long prxAtualizacao = 0;
        while (jogando) {
            if (System.currentTimeMillis() >= prxAtualizacao) {
                tela.repaint();
                prxAtualizacao = System.currentTimeMillis() + FPS;
            }
        }
    }

    public Interativo() {
        super.addKeyListener(new KeyListener() {
            @Override
            //evento para cada tecla apertada
            public void keyTyped (KeyEvent e) {
                
            }
           
            @Override
            //evento para cada tecla liberada
            public void keyReleased (KeyEvent e) {

            }

            @Override
            //evento para cada tecla pressionada
            public void keyPressed(KeyEvent e) {
              int tecla = e.getKeyCode();
                switch (tecla) {
                    case KeyEvent.VK_ESCAPE:
                        //tecla esc
                        jogando = false;
                        dispose();
                        break;
                    case KeyEvent.VK_UP:
                        //seta pra cima
                    py--;
                    break;
                    case KeyEvent.VK_DOWN:
                        //seta pra baixo
                    py++;
                    break;
                    case KeyEvent.VK_LEFT:
                        //seta pra esquerda
                    px--;
                    break;
                    case KeyEvent.VK_RIGHT:
                        //seta pra direita
                    px++;
                    break;
                }
            }


        });
    // desenhar os elementos na tela
    // executar a interatividade do jogo    
    }

}
