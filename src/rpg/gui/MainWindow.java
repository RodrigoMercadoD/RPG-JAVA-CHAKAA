package rpg.gui;

import javax.swing.*;
import rpg.gui.buttons.BaseButton;
import rpg.gui.panels.BottomPanel;
import rpg.gui.panels.MiddlePanel;
import rpg.gui.panels.TopPanel;

public class MainWindow extends JFrame {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel bottomPanel;
    private JButton button1;
    private JButton b2;
    private JButton b3;
    private JLabel exampleLabel;
    private JDesktopPane desktopPane;
    public JPanel Estado;
    public JPanel Juego;
    public JPanel Accion;
    private JButton pocionButton;
    public MainWindow() {
        initComponents();
    }

    private void initComponents() {
        // Creamos un DesktopPane para poder agregar los componentes
        desktopPane = new JDesktopPane();
        // Hacemos que el tamaño del DesktopPane sea igual al
        // tamaño del panel principal
        desktopPane.setPreferredSize(mainPanel != null ?
                mainPanel.getPreferredSize() : null);
        // Definimos los Bounds del panel principal
        mainPanel.setBounds(0, 0, mainPanel.getPreferredSize().width,
                mainPanel.getPreferredSize().height);
        // Agregamos el panel principal al DesktopPane
        desktopPane.add(mainPanel, JLayeredPane.DEFAULT_LAYER);
        // Agregamos el panel principal a la ventana
        setContentPane(desktopPane);
        // Definimos el título de la ventana
        setTitle("RPG Game");
        // Definimos la operación por defecto al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Tomamos el tamaño de los componentes
        pack();
        // Centramos la ventana
        setLocationRelativeTo(null);
        // Hacemos visible la ventana
        setVisible(true);
        // Definimos que la ventana no se pueda redimensionar
        setResizable(false);
    }

    public static void main(String[] args) {
        new MainWindow();
        SwingUtilities.invokeLater(() -> {
            new MainWindow();
        });
    }
    private void createUIComponents() {
        topPanel = new TopPanel();
        middlePanel = new MiddlePanel();
        bottomPanel = new BottomPanel();
        button1 = new BaseButton("Button 1");
        b2 = new BaseButton("Tiendas");
        b3 = new BaseButton("Inventario");
    }
    }

