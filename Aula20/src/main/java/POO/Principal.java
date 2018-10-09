package POO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal {
    private JPanel painelPrincipal;
    private JLabel nomeLebel;
    private JTextField nomeTextField;
    private JButton confirmarButton;
    private JLabel resulatdoLabel;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femininoRadioButton;


    public void chamaNome(){
        String mensagem = nomeTextField.getText();
        if(masculinoRadioButton.isSelected()) {
            resulatdoLabel.setText("Bom dia, Sr. " + mensagem);
        }
        else{
            resulatdoLabel.setText("Bom dia, Sra. "+mensagem);
        }
        nomeTextField.setText("");
        confirmarButton.setEnabled(false);
    }

    public Principal() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chamaNome();
            }
        });

        nomeTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(confirmarButton.isEnabled())
                chamaNome();
            }
        });
        nomeTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                    confirmarButton.setEnabled(!nomeTextField.getText().isEmpty());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        //para centralizar o JFframe na tela
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

    }
}
