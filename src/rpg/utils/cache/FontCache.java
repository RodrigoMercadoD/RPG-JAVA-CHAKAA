<<<<<<< HEAD
package rpg.utils.cache;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FontCache {

    public static final Map<String, Font> cache = new HashMap<>();

    public static Font addFont(String fontName, String fontPath) {

        Font font;
        if (!cache.containsKey(fontName)) {

            font = FontLoader.loadFont(fontPath);
            cache.put(fontName, font);
        } else {
            font = cache.get(fontName);
        }
        return font;
    }

    public static Font getFont(String fontName, int style, int size) {

        return cache.getOrDefault(fontName, Font.getFont("Arial")).deriveFont(style, size);
    }

    public static Font getFont(String fontName) {

        return getFont(fontName, Font.PLAIN, 12);
    }

    public static Font getFont(String fontName, int size) {

        return getFont(fontName, Font.PLAIN, size);
    }
=======
package rpg.utils.cache;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FontCache {
    // Mapa para almacenar las fuentes cargadas
    private static Map<String, Font> fontCache = new HashMap<>();

    public static Font loadFont(String path) {
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(12f);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la fuente: " + path,
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Font.getFont("Arial").deriveFont(12f);
    }

    // Método para agregar una fuente al caché
    public static void addFont(String fontName, String path) {
        Font font = loadFont(path);
        if (font != null) {
            fontCache.put(fontName, font);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la fuente: " + fontName,
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para obtener una fuente del caché
    public static Font getFont(String fontName) {
        return fontCache.getOrDefault(fontName, Font.getFont("Arial").deriveFont(12f));
    }

    // Método para derivar una fuente a un tamaño específico
    public static Font deriveFont(String fontName, float size) {
        Font font = getFont(fontName);
        if (font != null) {
            return font.deriveFont(size);
        } else {
            JOptionPane.showMessageDialog(null, "Fuente no encontrada: " + fontName,
                    "Error", JOptionPane.ERROR_MESSAGE);
            return Font.getFont("Arial").deriveFont(size); // Fuente predeterminada
        }
    }
>>>>>>> origin/master
}