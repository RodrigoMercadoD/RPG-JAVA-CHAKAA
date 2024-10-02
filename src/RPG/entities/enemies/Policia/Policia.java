package rpg.entities.enemies.Policia;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;

/**
 * Clase base para el enemigo Policía
 */
public class Policia extends Enemy {

    /**
     * Constructor de la clase Policía.
     */
    public Policia() {
        super("Policía");
        this.stats.put(Stats.MAX_HP, 20); // Vida máxima del Policía
        this.stats.put(Stats.HP, 20); // Vida actual del Policía
        this.stats.put(Stats.ATTACK, 6); // Ataque del Policía
        this.stats.put(Stats.DEFENSE, 3); // Defensa del Policía
    }

    /**
     * Método que realiza el ataque 'Detención Rápida' del Policía.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void amonestacion(GameCharacter enemy) {
        int damage = 2;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage); // Aplica el daño al enemigo
        System.out.println(this.name + " amonesta a " + enemy.getName() + " causando " + damage + " de daño.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * Método que realiza el ataque 'Citación'.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void PorEsoJoven(GameCharacter enemy) {
        int damage = 4;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage); // Aplica el daño al enemigo
        System.out.println(this.name + " emite un por eso joven " + enemy.getName() + " causando " + damage + " de daño.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            amonestacion(enemy); // 50% de probabilidad de usar Detención Rápida
        } else {
            PorEsoJoven(enemy); // 50% de probabilidad de usar Citación
        }
    }
}
