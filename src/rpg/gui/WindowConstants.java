<<<<<<< HEAD
package rpg.gui;

import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Constantes para las dimensiones de las ventanas.
 */
public interface WindowConstants {
    /**
     * Ancho de la ventana.
     */
    int WINDOW_WIDTH = 1020;
    /**
     * Alto de la parte superior de la ventana.
     */
    int BOTTOM_HEIGHT = 180;
    /**
     *
     * Alto de la parte media de la ventana.
     */
    int TOP_HEIGHT = 180;
    /**
     * Alto de la parte inferior de la ventana.
     */
    int MIDDLE_HEIGHT = 400;

    /**
     * Margen simple.
     */
    int SIMPLE_MARGIN = 5;
    /**
     * Dimensión de la parte superior de la ventana.
     */
    Dimension TOP_DIMENSION = new Dimension(WINDOW_WIDTH, BOTTOM_HEIGHT);
    /**
     * Dimensión de la parte media de la ventana.
     */
    Dimension MIDDLE_DIMENSION = new Dimension(WINDOW_WIDTH, TOP_HEIGHT);
    /**
     * Dimensión de la parte inferior de la ventana.
     */
    Dimension BOTTOM_DIMENSION = new Dimension(WINDOW_WIDTH, MIDDLE_HEIGHT);
    /**
     * Borde vacío de margen simple. Que se puede usar para dar un margen a los paneles.
     */
    EmptyBorder EMPTY_BORDER = new EmptyBorder(SIMPLE_MARGIN, SIMPLE_MARGIN,
            SIMPLE_MARGIN, SIMPLE_MARGIN);
=======
package rpg.gui;

import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Constantes para las dimensiones de las ventanas.
 */
public interface WindowConstants {
    /**
     * Ancho de la ventana.
     */
    int WINDOW_WIDTH = 1020;
    /**
     * Alto de la parte superior de la ventana.
     */
    int BOTTOM_HEIGHT = 180;
    /**
     *
     * Alto de la parte media de la ventana.
     */
    int TOP_HEIGHT = 180;
    /**
     * Alto de la parte inferior de la ventana.
     */
    int MIDDLE_HEIGHT = 400;

    /**
     * Margen simple.
     */
    int SIMPLE_MARGIN = 5;
    /**
     * Dimensión de la parte superior de la ventana.
     */
    Dimension TOP_DIMENSION = new Dimension(WINDOW_WIDTH, BOTTOM_HEIGHT);
    /**
     * Dimensión de la parte media de la ventana.
     */
    Dimension MIDDLE_DIMENSION = new Dimension(WINDOW_WIDTH, TOP_HEIGHT);
    /**
     * Dimensión de la parte inferior de la ventana.
     */
    Dimension BOTTOM_DIMENSION = new Dimension(WINDOW_WIDTH, MIDDLE_HEIGHT);
    /**
     * Borde vacío de margen simple. Que se puede usar para dar un margen a los paneles.
     */
    EmptyBorder EMPTY_BORDER = new EmptyBorder(SIMPLE_MARGIN, SIMPLE_MARGIN,
            SIMPLE_MARGIN, SIMPLE_MARGIN);
>>>>>>> origin/master
}