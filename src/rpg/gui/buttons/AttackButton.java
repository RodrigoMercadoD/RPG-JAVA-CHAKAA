package rpg.gui.buttons;

import rpg.gui.buttons.events.AttackEvent;
import rpg.windows.MainWindow;

public class AttackButton extends UserButton {

    public AttackButton(MainWindow game) {

        super("Atacar");
        addActionListener(new AttackEvent(game));
    }
}
