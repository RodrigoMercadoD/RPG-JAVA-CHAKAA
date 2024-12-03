package rpg.gui.ui;

import rpg.utils.cache.FontCache;

import javax.swing.border.EmptyBorder;
import java.awt.*;

public interface UIConstants {
    int CORNER_WIDTH = 52;
    int CORNER_HEIGHT = 77;
    Font FONT = new Font("Arial", Font.PLAIN, 12);  // Usa el tipo de fuente, estilo y tamaño que necesites
    //Font BAR_LABEL_FONT = FontCache.addFont("PAE", "fonts/PixelAE.ttf").deriveFont(16f);
    Font LABEL_FONT = new Font("Arial", Font.PLAIN, 12);
    int WINDOW_WIDTH = 1500;
    int TOP_HEIGHT = 150;
    int MIDDLE_HEIGHT = 320;
    int BOTTOM_HEIGHT = 350;
    int SIMPLE_MARGIN = 18;
    int CENTER_WIDTH = 350 - 2 * CORNER_WIDTH;
    Dimension BAR_ICON = new Dimension(58, 58);
    Dimension BAR_DISPLAY = new Dimension(179, 58);
    Dimension TOP_DIMENSION = new Dimension(WINDOW_WIDTH, TOP_HEIGHT);
    Dimension MIDDLE_DIMENSION = new Dimension(WINDOW_WIDTH, MIDDLE_HEIGHT);
    Dimension BOTTOM_DIMENSION = new Dimension(WINDOW_WIDTH, BOTTOM_HEIGHT);
    Dimension CORNER_DIMENSION = new Dimension(52, 77);
    Dimension CENTER_DIMENSION = new Dimension(CENTER_WIDTH, 77);
    Dimension BAR_LABEL = new Dimension(172, 51);
    EmptyBorder EMPTY_BORDER = new EmptyBorder(14, SIMPLE_MARGIN,
            SIMPLE_MARGIN, SIMPLE_MARGIN);
    /**
     * Ancho de la ventana
    /**
     * Alto de la parte superior de la ventana.
     */
    /**
     * Alto de la parte media de la ventana.
     */
    /**
     * Alto de la parte inferior de la ventana.
     */

    /**
     * Margen simple.
     */
    int INTERNAL_FRAME_HEADER_HEIGHT = 77;
    int STATUS_FRAME_WIDTH = 565;
    int STATUS_FRAME_HEIGHT = 715;

    /**
     * Dimensión de la parte superior de la ventana.
     */

    /**
     * Dimensión de la parte media de la ventana.
     */

    /**
     * Dimensión de la parte inferior de la ventana.
     */
    Dimension START_WINDOW_DIMENSION = new Dimension(800, 600);

    /**
     *
     */

    Dimension MESSAGE_DIMENSION = new Dimension(1100, 287);
    Dimension NEW_PLAYER_PANEL_DIMENSION = new Dimension(786, 250);
    Dimension FILES_PANEL_DIMENSION = new Dimension(786, 563);
}
