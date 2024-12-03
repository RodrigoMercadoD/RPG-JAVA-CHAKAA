package rpg.gui.buttons;

import rpg.entities.Player;
import rpg.windows.MainWindow;

public class SaveButton extends UserButton {

    public SaveButton(MainWindow window, Player player, int slot) {
        super("Guardar");
        addActionListener(e -> {
            player.save(slot);
            window.appendText("""
                    Partida guardada correctamente.
                    """);
        });
    }
}
