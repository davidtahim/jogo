package com.jogo;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UmJogo extends JFrame {
    private final int FPS = 1000/20;
    /**
     * Elemento
     */
    public class Elemento {
        public int x,y,largura,altura;
        public float velocidade;

        public Elemento (int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.largura = width;
            this.altura = height;
        }
        
    }

    private JPanel tela;
    private boolean jogando = true;
    private boolean fimDeJogo=false;

    private Elemento tiro;
    private Elemento jogador;
    private Elemento[] blocos;

    private int pontos;
    private int larg = 50;
    private int linhaLimite = 350;
    private java.util.Random r = new java.util.Random();

    private boolean[] controleTecla = new boolean[4];

    

}
