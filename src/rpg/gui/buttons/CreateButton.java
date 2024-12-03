package rpg.gui.buttons;

import rpg.gui.buttons.events.NewFileEvent;
import rpg.windows.NewFileWindow;

public class CreateButton extends UserButton {

    public CreateButton(int slot, NewFileWindow window) {

        super("¡A la aventura!");
        addActionListener(new NewFileEvent(slot, window));
    }
}
