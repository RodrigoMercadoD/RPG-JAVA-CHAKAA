package rpg.gui;

import javax.swing.*;
import rpg.gui.buttons.BaseButton;
import rpg.gui.panels.BottomPanel;
import rpg.gui.panels.MiddlePanel;
import rpg.gui.panels.TopPanel;

import java.awt.*;

public class MainWindow extends JFrame {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel bottomPanel;
    private JButton pocionButton;
    private JDesktopPane desktopPane;
    public JPanel Estado;
    public JPanel Juego;
    public JPanel Accion;

    public MainWindow() {
        createUIComponents();
        initComponents();
    }

    private void initComponents() {
        desktopPane=new JDesktopPane();
        desktopPane.setPreferredSize(mainPanel!=null?mainPanel.getPreferredSize():null);
        mainPanel.setBounds(0, 0, mainPanel.getPreferredSize().width,
                mainPanel.getPreferredSize().height);
        desktopPane.add(mainPanel, JLayeredPane.DEFAULT_LAYER);
        setContentPane(desktopPane);
        setTitle("RPG Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainWindow());
    }

    private void createUIComponents() {

        Accion = new TopPanel();
        Estado = new MiddlePanel();
        Juego = new BottomPanel();
        pocionButton = new BaseButton("Button 1");
    }
}
