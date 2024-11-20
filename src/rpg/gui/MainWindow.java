package rpg.gui;

import javax.swing.*;

import rpg.gui.buttons.BaseButton;
import rpg.gui.labels.PortraitLabel;
import rpg.gui.panels.BottomPanel;
import rpg.gui.panels.MiddlePanel;
import rpg.gui.panels.TopPanel;

/**
 * Clase principal que representa la ventana principal del juego RPG.
 * Extiende JFrame y contiene paneles para organizar la interfaz de usuario.
 */
public class MainWindow extends JFrame {
    private JPanel mainPanel;   // Panel principal que contiene otros paneles
    private JPanel topPanel;    // Panel superior para la interfaz de usuario
    private JPanel middlePanel; // Panel medio que muestra el estado del juego
    private JPanel bottomPanel; // Panel inferior para la acción del juego
    private JDesktopPane desktopPane; // Pane que permite la gestión de capas
    private JButton FleeButton;
    private JLabel portraitLabel;

    /**
     * Constructor de MainWindow. Inicializa los componentes de la UI.
     */
    public MainWindow() {
        createUIComponents(); // Crear componentes de la interfaz de usuario
        initComponents();     // Inicializar la configuración de la ventana
    }

    /**
     * Inicializa los componentes de la ventana principal.
     * Configura el tamaño, el título y la visibilidad de la ventana.
     */
    private void initComponents() {
        desktopPane = new JDesktopPane(); // Crear un nuevo JDesktopPane
        desktopPane.setPreferredSize(mainPanel != null ? mainPanel.getPreferredSize() : null);
        mainPanel.setBounds(0, 0, mainPanel.getPreferredSize().width,
                mainPanel.getPreferredSize().height);
        desktopPane.add(mainPanel, JLayeredPane.DEFAULT_LAYER); // Añadir el panel principal al desktopPane
        setContentPane(desktopPane); // Establecer el contenido de la ventana
        setTitle("RPG Game"); // Título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cer rar la ventana
        pack(); // Ajustar el tamaño de la ventana
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true); // Hacer visible la ventana
        setResizable(false); // No permitir el redimensionamiento de la ventana
    }

    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainWindow()); // Ejecutar la interfaz de usuario en el hilo de eventos
    }

    /**
     * Crea los componentes de la interfaz de usuario.
     * Inicializa los paneles y el botón.
     */
    private void createUIComponents() {
        topPanel = new TopPanel();
        middlePanel = new MiddlePanel();
        bottomPanel = new BottomPanel();
        FleeButton = new BaseButton("Button 1");
        portraitLabel = new PortraitLabel();
        //lifeLabel = new BarLabel(100, 100, BarType.LIFE);
        //magicLabel = new BarLabel(30, 100, BarType.MAGIC);
        //expLabel = new BarLabel(0, 350, BarType.EXPERIENCE);
        //huirButton = new FleeButton();atacarButton = new AttackButton();
        //habilidadesButton = new SkillPanelButton();
    }
}
package rpg.gui;

import javax.swing.*;

import rpg.gui.buttons.AttackButton;
import rpg.gui.buttons.BaseButton;
import rpg.gui.labels.PortraitLabel;
import rpg.gui.panels.BottomPanel;
import rpg.gui.panels.MiddlePanel;
import rpg.gui.panels.TopPanel;

import java.awt.*;

/**
 * Clase principal que representa la ventana principal del juego RPG.
 * Extiende JFrame y contiene paneles para organizar la interfaz de usuario.
 */
public class MainWindow extends JFrame {
    private JPanel mainPanel;   // Panel principal que contiene otros paneles
    private JPanel topPanel;    // Panel superior para la interfaz de usuario
    private JPanel middlePanel; // Panel medio que muestra el estado del juego
    private JPanel bottomPanel; // Panel inferior para la acción del juego
    private JDesktopPane desktopPane; // Pane que permite la gestión de capas
    private JButton button1;
    private JLabel exampleLabel;

    /**
     * Constructor de MainWindow. Inicializa los componentes de la UI.
     */
    public MainWindow() {
        createUIComponents(); // Crear componentes de la interfaz de usuario
        initComponents();     // Inicializar la configuración de la ventana
    }

    /**
     * Inicializa los componentes de la ventana principal.
     * Configura el tamaño, el título y la visibilidad de la ventana.
     */
    private void initComponents() {
        desktopPane = new JDesktopPane(); // Crear un nuevo JDesktopPane
        desktopPane.setPreferredSize(mainPanel != null ? mainPanel.getPreferredSize() : null);
        mainPanel.setBounds(0, 0, mainPanel.getPreferredSize().width,
                mainPanel.getPreferredSize().height);
        desktopPane.add(mainPanel, JLayeredPane.DEFAULT_LAYER); // Añadir el panel principal al desktopPane
        setContentPane(desktopPane); // Establecer el contenido de la ventana
        setTitle("RPG Game"); // Título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cer rar la ventana
        pack(); // Ajustar el tamaño de la ventana
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true); // Hacer visible la ventana
        setResizable(false); // No permitir el redimensionamiento de la ventana
    }

    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainWindow()); // Ejecutar la interfaz de usuario en el hilo de eventos
    }

    /**
     * Crea los componentes de la interfaz de usuario.
     * Inicializa los paneles y el botón.
     */
    private void createUIComponents() {
        topPanel = new TopPanel();
        middlePanel = new MiddlePanel();
        bottomPanel = new BottomPanel();
        button1 = new BaseButton("Button 1");
        exampleLabel = new PortraitLabel();
    }
}

