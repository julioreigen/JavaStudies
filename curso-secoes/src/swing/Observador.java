package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Observador {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Encerrar ao fechar programa
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // Centralizar na tela

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu!!");
        });

        janela.setVisible(true);
    }
}
