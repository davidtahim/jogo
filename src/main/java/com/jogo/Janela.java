package com.jogo;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Janela extends JFrame {
    private JPanel tela;

    public Janela() {
       tela = new JPanel(){
        @Override
        public void paintComponent(Graphics g) {
            //os elementos aparecem aqui
        }

       } ;    

       super.getContentPane().add(tela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);
        setVisible(true);
        
    }
public static void main(String[] args) {
    new Janela();
}
}
