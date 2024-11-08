package rpg.gui.buttons;

import rpg.gui.ui.UserHoverUI;

public abstract class UserButton extends BaseButton {

    public UserButton(String text) {
        super(text);
        // Aquí no es necesario sobrescribir initIcons() si no existe en BaseButton
        setIcon(null);  // O cualquier personalización de iconos si es necesario
        setRolloverIcon(null); // Lo mismo con el rollover icono
    }


    protected void initIcons() {
        // No se inicializan iconos en esta clase
    }
}

