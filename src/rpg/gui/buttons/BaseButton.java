package rpg.gui.buttons;

import rpg.gui.ui.HoverButtonUI;
import rpg.utils.cache.ImageCache;

import javax.swing.*;
import java.awt.*;

public class BaseButton extends JButton {

    // Constructor de la clase BaseButton
    public BaseButton(String text) {
        super(text);  // Llamamos al constructor de JButton con el texto
        initIcons();  // Inicializamos los iconos
        setUI(new HoverButtonUI());  // Usamos la UI personalizada
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /**
     * Método para inicializar los iconos del botón.
     */
    protected void initIcons() {
        // Aquí inicializamos los iconos utilizando ImageCache
        setIcon(new ImageIcon(ImageCache.addImage("ATACAR", "window_sections.png")));
        setRolloverIcon(new ImageIcon(ImageCache.addImage("shopHover", "window_sections.png")));
    }
}
