package rpg.gui.labels;

import rpg.gui.labels.events.ShowStatusEvent;
import rpg.gui.ui.GameLabelUI;
import rpg.gui.ui.LabelUI;
import rpg.utils.cache.ImageCache;
import rpg.windows.MainWindow;

import javax.swing.*;
import java.awt.*;

public class PortraitLabel extends JLabel {

    protected ImageIcon icon;

    public PortraitLabel(MainWindow mainWindow) {
        initComponents();
        setUI(new GameLabelUI(getPreferredSize(), icon));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        addMouseListener(new ShowStatusEvent(mainWindow));
    }

    public void initComponents() {
        ImageCache.addImage("portrait",
                "Portrait.png");
        icon = ImageCache.getImageIcon("portrait");
        setPreferredSize(
                new Dimension(210,210));
        setIcon(icon);
    }
}