package rpg.entities.enemies.Brayan;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;

/**
 * Clase base para el enemigo Brayan. Representa al enemigo común llamado Brayan.
 */
public class Brayan extends Enemy {

    /**
     * Constructor de la clase Brayan.
     */
    public Brayan() {
        super("Brayan");
        this.stats.put(Stats.MAX_HP, 40); // Vida máxima de Brayan
        this.stats.put(Stats.HP, 40); // Vida actual de Brayan
        this.stats.put(Stats.ATTACK, 7); // Ataque de Brayan
        this.stats.put(Stats.DEFENSE, 3); // Defensa de Brayan
    }

    /**
     * Método que realiza el ataque 'Golpe Rápido' de Brayan.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void golpeRapido(GameCharacter enemy) {
        int damage = 3;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage); // Aplica el daño al enemigo
        System.out.println(this.name + " da un golpe rápido a " + enemy.getName() + " causando " + damage + " de daño.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * Método que realiza el ataque 'Patada Callejera'.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void patadaCallejera(GameCharacter enemy) {
        int damage = 4;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage); // Aplica el daño al enemigo
        System.out.println(this.name + " lanza una patada callejera a " + enemy.getName() + " causando " + damage + " de daño.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * Método que define el ataque del enemigo Brayan. Alterna entre 'Golpe Rápido' y 'Patada Callejera'.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            golpeRapido(enemy); // 50% de probabilidad de usar Golpe Rápido
        } else {
            patadaCallejera(enemy); // 50% de probabilidad de usar Patada Callejera
        }
    }
}
