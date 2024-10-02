package rpg.entities.enemies.Iker;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;

/**
 * Clase base para el enemigo Iker. Representa al enemigo común llamado Iker.
 */
public class Iker extends Enemy {

    /**
     * Constructor de la clase Iker.
     */
    public Iker() {
        super("Iker");
        this.stats.put(Stats.MAX_HP, 40); // Vida máxima de Iker
        this.stats.put(Stats.HP, 40); // Vida actual de Iker
        this.stats.put(Stats.ATTACK, 8); // Ataque de Iker
        this.stats.put(Stats.DEFENSE, 5); // Defensa de Iker
    }

    /**
     * Método que realiza el ataque 'Lanzamiento de Botella' de Iker.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void lanzamientoDeBotella(GameCharacter enemy) {
        System.out.println(this.name + " lanza una botella a " + enemy.getName() + " pero falla.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * Método que realiza el ataque 'Cabezazo'.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void cabezazo(GameCharacter enemy) {
        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.9); // Daño basado en el 90% del ataque
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage); // Aplica el daño al enemigo
        System.out.println(this.name + " le da un cabezazo a " + enemy.getName() + " causando " + damage + " de daño.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * Método que define el ataque del enemigo Iker. Alterna entre 'Lanzamiento de Botella' y 'Cabezazo'.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            lanzamientoDeBotella(enemy); // 50% de probabilidad de usar Lanzamiento de Botella
        } else {
            cabezazo(enemy); // 50% de probabilidad de usar Cabezazo
        }
    }
}
