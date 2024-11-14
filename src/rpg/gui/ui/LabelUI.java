<<<<<<< HEAD
package rpg.gui.ui;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.*;

public class LabelUI extends BasicLabelUI {

    private Dimension size;
    ImageIcon icon;

    public LabelUI(Dimension size, ImageIcon icon) {

        this.size = size;
        this.icon = icon;
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        return size;
    }

    @Override
    public Dimension getMaximumSize(JComponent c) {
        return getPreferredSize(c);
    }

    @Override
    public Dimension getMinimumSize(JComponent c) {
        return getPreferredSize(c);
    }

    @Override
    protected void installDefaults(JLabel c) {

        c.setOpaque(false);
        c.setBorder(null);
    }

    @Override
    public void paint(Graphics g, JComponent c) {

        Graphics2D g2d=(Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.drawImage(icon.getImage(), 0, 0, size.width, size.height, c);
    }
=======
package rpg.gui.ui;

import javax.swing.*;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.*;

public class LabelUI extends BasicLabelUI {

    private Dimension size;
    ImageIcon icon;

    public LabelUI(Dimension size, ImageIcon icon) {

        this.size = size;
        this.icon = icon;
    }

    @Override
    protected void installDefaults(JLabel c) {

        c.setOpaque(false);
        c.setBorder(null);
    }
>>>>>>> origin/master
}