package rpg.gui;

import javax.swing.*;

public class MainWindow extends JFrame {
    private JPanel mainPanel; // Declaración del panel principal
    private JButton pocionButton;
    private JPanel Estado;
    private JPanel Juego;
    private JPanel Accion;

    public MainWindow() {
        // Inicializar el panel principal
        setTitle("RPG Chaka");
        setContentPane(mainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow(); //
    }

    private void createUIComponents() {
        Estado =new JPanel();
        Estado.setPreferredSize(WindowConstants.TOP_DIMENSION);
        Accion =new JPanel();
        Accion.setPreferredSize(WindowConstants.TOP_DIMENSION);
        Juego =new JPanel();
        Juego.setPreferredSize(WindowConstants.TOP_DIMENSION);
    }
}