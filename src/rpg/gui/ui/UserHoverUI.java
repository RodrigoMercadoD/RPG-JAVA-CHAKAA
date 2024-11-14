<<<<<<< HEAD
package rpg.gui.ui;

import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.AbstractButton;

public class UserHoverUI extends BasicButtonUI {
    // Aquí puedes personalizar la apariencia del botón cuando se pasa el ratón sobre él

    @Override
    public void paint(Graphics g, javax.swing.JComponent c) {
        super.paint(g, c);  // Llamamos al comportamiento base

        AbstractButton button = (AbstractButton) c;

        // Cambiamos el color de fondo cuando el ratón pasa sobre el botón
        if (button.getModel().isRollover()) {
            g.setColor(new Color(100, 150, 255)); // Color azul claro
            g.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 10, 10); // Fondo redondeado
        }
    }

    @Override
    protected void paintButtonPressed(Graphics g, AbstractButton b) {
        super.paintButtonPressed(g, b);
        g.setColor(new Color(50, 50, 200)); // Color cuando el botón es presionado
        g.fillRoundRect(0, 0, b.getWidth(), b.getHeight(), 10, 10); // Fondo presionado redondeado
    }

    // Eliminar o corregir paintButtonFocus si no existe en la superclase
}
=======
package rpg.gui.ui;

import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.AbstractButton;

public class UserHoverUI extends BasicButtonUI {
    // Aquí puedes personalizar la apariencia del botón cuando se pasa el ratón sobre él

    @Override
    public void paint(Graphics g, javax.swing.JComponent c) {
        super.paint(g, c);  // Llamamos al comportamiento base

        AbstractButton button = (AbstractButton) c;

        // Cambiamos el color de fondo cuando el ratón pasa sobre el botón
        if (button.getModel().isRollover()) {
            g.setColor(new Color(100, 150, 255)); // Color azul claro
            g.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 10, 10); // Fondo redondeado
        }
    }

    @Override
    protected void paintButtonPressed(Graphics g, AbstractButton b) {
        super.paintButtonPressed(g, b);
        g.setColor(new Color(50, 50, 200)); // Color cuando el botón es presionado
        g.fillRoundRect(0, 0, b.getWidth(), b.getHeight(), 10, 10); // Fondo presionado redondeado
    }

    // Eliminar o corregir paintButtonFocus si no existe en la superclase
}
>>>>>>> origin/master
