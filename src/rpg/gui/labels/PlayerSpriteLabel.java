package rpg.gui.labels;

import rpg.utils.cache.ImageCache;

import java.awt.*;

public class PlayerSpriteLabel extends PortraitLabel {

    public PlayerSpriteLabel() {

        super(null);
    }

    @Override
    public void initComponents() {
        ImageCache.addImage("playerSprite", "Player.png");
        icon = ImageCache.getImageIcon("playerSprite");
        setPreferredSize(new Dimension(icon.getIconWidth()*3,
                icon.getIconHeight()*3));
        setIcon(icon);
    }
}