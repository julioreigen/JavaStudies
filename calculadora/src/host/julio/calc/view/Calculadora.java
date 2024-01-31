package host.julio.calc.view;

import javax.swing.*;

public class Calculadora extends JFrame {
    public Calculadora() {
        setTitle("Calculadora");
        setSize(332, 422);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        add(new PainelCalculadora());
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
