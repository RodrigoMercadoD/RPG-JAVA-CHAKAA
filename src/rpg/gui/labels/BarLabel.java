package rpg.gui.labels;

import rpg.enums.BarType;
import rpg.gui.ui.BarLabelUI;

import javax.swing.*;

public class BarLabel extends JLabel {

    private int barValue;
    private int maxValue;
    private final BarType type;
    private ImageIcon icon; // Campo para el icono

    public BarLabel(int value, int maxValue, BarType type) {
        this(value, maxValue, type, null); // Llamar al nuevo constructor
    }

    public BarLabel(int value, int maxValue, BarType type, ImageIcon icon) {
        this.barValue = value;
        this.maxValue = maxValue;
        this.type = type;
        this.icon = icon; // Inicializar el icono
        initComponents();
    }

    public void initComponents() {
        setBarValue(barValue);
        setUI(new BarLabelUI(type));
        if (icon != null) {
            setIcon(icon); // Establecer el icono si no es nulo
        }
    }

    public void updateBar(int value, int maxValue) {

        setMaxValue(maxValue);
        setBarValue(value);
        setUI(new BarLabelUI(type));
        revalidate();
        repaint();
    }

    public void setBarValue(int value) {
        this.barValue = value;
        setText(String.format("%d / %d", value, maxValue));
    }

    public int getBarValue() {
        return barValue;
    }

    public void setMaxValue(int value) {
        this.maxValue = value;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public BarType getType() {
        return type;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
        super.setIcon(icon); // Llamar al método setIcon de JLabel
    }
}