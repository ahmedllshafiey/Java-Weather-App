
import javax.swing.*;

public class Launcher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // display our weather app gui
            new GUI().setVisible(true);
        });
    }
}
