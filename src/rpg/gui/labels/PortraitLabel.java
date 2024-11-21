package rpg.gui.labels;

import rpg.gui.ui.LabelUI;
import rpg.utils.cache.ImageCache;

import javax.swing.*;
import java.awt.*;

public class PortraitLabel extends JLabel {

    protected ImageIcon icon;

    public PortraitLabel() {
        initComponents();
        setUI(new LabelUI(getPreferredSize(), icon));
    }

    public void initComponents() {
        ImageCache.addImage("portrait",
                "Portrait.png");
        icon = ImageCache.getImageIcon("portrait");
        setPreferredSize(
                new Dimension(130,130));
        setIcon(icon);
    }
}