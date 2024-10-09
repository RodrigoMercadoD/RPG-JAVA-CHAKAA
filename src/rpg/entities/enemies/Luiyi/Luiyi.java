package rpg.entities.enemies.Luiyi;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.EnemyType;
import rpg.enums.Stats;

/**
 * Clase base para el enemigo Luiyi. Representa al enemigo común llamado Luiyi.
 */
public class Luiyi extends Enemy {

    /**
     * Constructor de la clase Luiyi.
     */
    public Luiyi() {
        super("Luiyi");
    }

    @Override
    public String getLoot(){
        return "Luiyi solto 3 Clauidiolares";
    }
    @Override
    protected void initCharacter() {
        this.type = EnemyType.BASIC;
        this.stats.put(Stats.MAX_HP, 25);
        this.stats.put(Stats.HP, 22);
        this.stats.put(Stats.ATTACK, 5);
        this.stats.put(Stats.DEFENSE, 3);
    }
    /**
     * Método que realiza el ataque 'Golpe Callejero' de Luiyi.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void golpeCallejero(GameCharacter enemy) {
        int damage = this.stats.get(Stats.ATTACK); // Cálculo del daño basado en el ataque de Luiyi
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage); // Aplica el daño al enemigo
        System.out.println(this.name + " realiza un golpe callejero a " + enemy.getName() + " y causa " + damage + " de daño.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * Método que realiza el ataque 'Empujón'.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void empujon(GameCharacter enemy) {
        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.75); // Daño reducido para el empujón
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage); // Aplica el daño al enemigo
        System.out.println(this.name + " empuja a " + enemy.getName() + " causando " + damage + " de daño.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * Método que define el ataque del enemigo Luiyi. Alterna entre 'Golpe Callejero' y 'Empujón'.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            golpeCallejero(enemy); // 50% de probabilidad de usar Golpe Callejero
        } else {
            empujon(enemy); // 50% de probabilidad de usar Empujón
        }
    }
}
