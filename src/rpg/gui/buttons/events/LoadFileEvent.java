package rpg.gui.buttons.events;

import rpg.entities.Player;
import rpg.windows.MainWindow;
import rpg.windows.StartWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadFileEvent implements ActionListener {

    private int slot;
    private StartWindow startWindow;

    public LoadFileEvent(int slot, StartWindow startWindow) {
        this.slot = slot;
        this.startWindow = startWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Player player = Player.load(slot);
        startWindow.dispose();
        new MainWindow(player, slot);
    }
}