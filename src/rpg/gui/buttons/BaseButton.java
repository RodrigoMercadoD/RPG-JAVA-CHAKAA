package rpg.gui.buttons;

import rpg.utils.cache.ImageCache;

import javax.swing.*;

public class BaseButton extends JButton {

    public BaseButton(String text) {

        setText(text);
        // Agregamos los iconos a la caché de imágenes.
        setIcon(
                new ImageIcon(ImageCache.addImage("shopIdle", "window_sections.png")));
        setRolloverIcon(
                new ImageIcon(ImageCache.addImage("shopHover", "window_sections.png")));
        // Establecemos el manger de UI.
        setUI(new HoverbuttonUI());
    }
}