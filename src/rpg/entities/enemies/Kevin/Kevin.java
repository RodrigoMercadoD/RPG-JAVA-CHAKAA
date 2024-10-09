package rpg.entities.enemies.Kevin;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.EnemyType;
import rpg.enums.Stats;

/**
 * Clase base para el enemigo Kevin. Representa al enemigo común llamado Kevin.
 */
public class Kevin extends Enemy {

    /**
     * Constructor de la clase Kevin.
     */
    public Kevin() {
        super("Kevin");
    }

    @Override
    public String getLoot(){
        return "Policia solto 5 umas";
    }
    @Override
    protected void initCharacter() {
        this.type = EnemyType.BASIC;
        this.stats.put(Stats.MAX_HP, 20);
        this.stats.put(Stats.HP, 20);
        this.stats.put(Stats.ATTACK, 4);
        this.stats.put(Stats.DEFENSE, 1);
    }
    /**
     * Método que realiza el ataque 'Lanzamiento de Piedra' de Kevin.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void lanzamientoDePiedra(GameCharacter enemy) {
        int damage = 2;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage); // Aplica el daño al enemigo
        System.out.println(this.name + " lanza una piedra a " + enemy.getName() + " causando " + damage + " de daño.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * Método que realiza el ataque 'Bola de Fuego'.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    protected void bolaDeBasura(GameCharacter enemy) {
        int damage = 4;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage); // Aplica el daño al enemigo
        System.out.println(this.name + " lanza una bola de basura a " + enemy.getName() + " causando " + damage + " de daño.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " de vida restante.");
    }

    /**
     * Método que define el ataque del enemigo Kevin. Alterna entre 'Lanzamiento de Piedra' y 'Bola de Fuego'.
     *
     * @param enemy El personaje enemigo que recibirá el ataque.
     */
    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            lanzamientoDePiedra(enemy); // 50% de probabilidad de usar Lanzamiento de Piedra
        } else {
            bolaDeBasura(enemy); // 50% de probabilidad de usar Bola de Fuego
        }
    }
}
