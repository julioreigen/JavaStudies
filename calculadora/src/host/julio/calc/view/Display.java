package host.julio.calc.view;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {
    private final JLabel label;
    public Display() {
        setBackground(new Color(46, 49, 50));
        label = new JLabel("123,56");
        add(label);
    }
}
