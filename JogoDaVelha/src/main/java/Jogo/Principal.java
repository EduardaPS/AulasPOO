package Jogo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal {

    private JPanel painelTotal;
    private JPanel tabuleiro;
    private JLabel p21;
    private JLabel nomeJogadorVez;
    private JLabel p11;
    private JLabel p12;
    private JLabel p13;
    private JLabel p22;
    private JLabel p23;
    private JLabel p31;
    private JLabel p32;
    private JLabel p33;

    public void trocaSimbulo(JLabel qual){
        if(qual.getText().equals("")) {
            qual.setText(nomeJogadorVez.getText());
            nomeJogadorVez.setText((nomeJogadorVez.getText().equals("O"))? "X" : "O");
        }
    }



    public Principal() {

        MouseAdapter listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                trocaSimbulo((JLabel)e.getSource());
            }
        };
        p13.addMouseListener(listener);
        p11.addMouseListener(listener);
        p12.addMouseListener(listener);
        p21.addMouseListener(listener);
        p31.addMouseListener(listener);
        p22.addMouseListener(listener);
        p23.addMouseListener(listener);
        p32.addMouseListener(listener);
        p33.addMouseListener(listener);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().painelTotal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setLocationRelativeTo(null);//centralizando

        frame.setResizable(false);//não podendo mover a tela

        frame.setVisible(true);
    }
}
