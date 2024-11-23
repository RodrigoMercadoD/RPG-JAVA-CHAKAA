package rpg.gui.buttons;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttackButton extends UserButton{

        public AttackButton() {
            super("Atacar");
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("HOLA ATACAR");
                }
            });
        }
    }

