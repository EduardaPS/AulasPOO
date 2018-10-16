package Jogo;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

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
    private JButton novoJogoButton;
    private JLabel ganhou;
    private JPanel jogador1;
    private JPanel jogador2;
    private JLabel pontosJogadorO;
    private JLabel pontosJogadorX;
    private JTextField textFieldJogadorO;
    private JTextField textFieldJogadorX;
    private JLabel nomeJogadorOLabel;
    private JLabel nomeJogadorXLabel;

    public void trocaSimbulo(JLabel qual){
        if(qual.getText().equals("") && qual.isEnabled()) {
            qual.setText(nomeJogadorVez.getText());
            nomeJogadorVez.setText((nomeJogadorVez.getText().equals("O"))? "X" : "O");
        }
    }
    public void limpa(){
        p11.setText("");
        p12.setText("");
        p13.setText("");
        p21.setText("");
        p22.setText("");
        p23.setText("");
        p31.setText("");
        p32.setText("");
        p33.setText("");
        ganhou.setText("");

    }
    public String ganhou(){
        if(p11.getText().equals(p12.getText()) && p11.getText().equals(p13.getText()) && !p11.getText().isEmpty()){
            return p11.getText();
        }
        if(p21.getText().equals(p22.getText()) && p21.getText().equals(p23.getText()) && !p21.getText().isEmpty()){
            return p21.getText();
        }
        if(p31.getText().equals(p32.getText()) && p31.getText().equals(p33.getText()) && !p31.getText().isEmpty()){
            return p31.getText();
        }

        if(p11.getText().equals(p21.getText()) && p11.getText().equals(p31.getText()) && !p11.getText().isEmpty()){
            return p11.getText();
        }
        if(p21.getText().equals(p22.getText()) && p12.getText().equals(p32.getText()) && !p12.getText().isEmpty()){
            return p12.getText();
        }
        if(p13.getText().equals(p23.getText()) && p13.getText().equals(p33.getText()) && !p13.getText().isEmpty()){
            return p13.getText();
        }

        if(p11.getText().equals(p22.getText()) && p11.getText().equals(p33.getText()) && !p11.getText().isEmpty()){
            return p11.getText();
        }
        if(p13.getText().equals(p22.getText()) && p13.getText().equals(p31.getText()) && !p13.getText().isEmpty()){
            return p13.getText();
        }
        return "";
    }


    public Principal() {

        MouseAdapter listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                trocaSimbulo((JLabel)e.getSource());
                if(!ganhou().isEmpty()){
                    p11.setEnabled(false);
                    p12.setEnabled(false);
                    p13.setEnabled(false);
                    p21.setEnabled(false);
                    p22.setEnabled(false);
                    p23.setEnabled(false);
                    p31.setEnabled(false);
                    p32.setEnabled(false);
                    p33.setEnabled(false);
                    if(ganhou().equals("O")) {
                        int pontos = Integer.parseInt(pontosJogadorO.getText());
                        pontosJogadorO.setText(Integer.toString(pontos + 1));
                        ganhou.setText(nomeJogadorOLabel.getText() + " ganhou!!!!!!!!!!!!!!!!");
                    } else if(ganhou().equals("X")){
                        int pontos = Integer.parseInt(pontosJogadorX.getText());
                        pontosJogadorX.setText(Integer.toString(pontos + 1));
                        ganhou.setText(nomeJogadorXLabel.getText() + " ganhou!!!!!!!!!!!!!!!!");
                    }

                }
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
        novoJogoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Random aleatorio = new Random();
                nomeJogadorVez.setText((aleatorio.nextBoolean())? "X" : "O");
                p11.setEnabled(true);
                p12.setEnabled(true);
                p13.setEnabled(true);
                p21.setEnabled(true);
                p22.setEnabled(true);
                p23.setEnabled(true);
                p31.setEnabled(true);
                p32.setEnabled(true);
                p33.setEnabled(true);
                limpa();
                if(pontosJogadorO.getText().isEmpty()){
                    pontosJogadorO.setText("0");
                    pontosJogadorX.setText("0");
                    textFieldJogadorO.setEnabled(false);
                    textFieldJogadorX.setEnabled(false);
                    nomeJogadorOLabel.setText(textFieldJogadorO.getText());
                    nomeJogadorXLabel.setText(textFieldJogadorX.getText());
                }
            }
        });
        KeyAdapter listener1 = new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                super.keyReleased(keyEvent);
                if(!textFieldJogadorO.getText().isEmpty() && !textFieldJogadorX.getText().isEmpty()){
                    novoJogoButton.setEnabled(true);
                } else{
                    novoJogoButton.setEnabled(false);
                }
            }
        };
        textFieldJogadorO.addKeyListener(listener1);
        textFieldJogadorX.addKeyListener(listener1);
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
