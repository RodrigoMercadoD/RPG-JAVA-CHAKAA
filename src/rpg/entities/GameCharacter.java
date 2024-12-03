package rpg.entities;

import rpg.enums.Stats;
import rpg.exceptions.EnemyDeathException;

import java.io.Serializable;
import java.util.HashMap;
public abstract class GameCharacter implements Serializable {

    /** El nombre del personaje */
    protected String name;

    /** HashMap que contiene las estadísticas del personaje (HP, ataque, defensa, etc.) */
    protected HashMap<Stats, Integer> stats;

    /**
     * Constructor de la clase GameCharacter
     *
     * @param name El nombre del personaje
     */
    public GameCharacter(String name) {
        this.name = name;
        this.stats = new HashMap<>();// Inicializa las estadísticas del personaje
        initCharacter();
    }

    protected abstract void initCharacter();

    /**
     * Método para verificar si el personaje sigue vivo.
     * Un personaje está vivo si su HP es mayor a 0.
     *
     * @return true si el personaje tiene HP positivo, de lo contrario false.
     */
    public boolean isAlive() {
        return stats.get(Stats.HP) > 0;
    }

    /**
     * Método que representa un ataque del personaje a un enemigo.
     * El daño se calcula como la diferencia entre el ataque del atacante y la defensa del enemigo
     */
    public String attack(GameCharacter enemy) {

        String message = "";
        String enemyName = enemy.getName();
        int damage = this.stats.get(Stats.ATTACK) - enemy.getStats().get(Stats.DEFENSE);
        int newHP = enemy.getStats().get(Stats.HP);
        if (damage > 0) {

            try {
                newHP = reduceHP(enemy, damage);
                message += String.format("""
                        ¡%s ataca a %s por %d de daño!
                        %s tiene %d HP restantes.
                        """, this.name, enemyName, damage, enemyName, newHP);
            } catch (EnemyDeathException e) {
                enemy.getStats().put(Stats.HP, 0);
                message += String.format("""
                        %s attacks %s for %d damage!
                        %s has 0 HP left.
                        %s has died.
                        """, this.name, enemyName, damage, enemyName, enemyName);
            }
        } else {
            message += String.format("""
                    ¡%s ataca a %s pero no hace daño!
                    %s tiene %d HP restantes.
                    """, this.name, enemyName, enemyName, newHP);
        }
        return message;
    }

    /**
     * Función que reduce la vida del enemigo y actualiza sus características.
     *
     * @param enemy  el enemigo a atacar.
     * @param damage el daño a realizar.
     * @return la nueva vida del enemigo.
     */
    protected final int reduceHP(GameCharacter enemy, int damage) throws EnemyDeathException {

        int newHP = enemy.getStats().get(Stats.HP) - damage;
        enemy.getStats().put(Stats.HP, newHP);
        if (!enemy.isAlive())
            throw new EnemyDeathException();
        return newHP;
    }
    /**
     * Obtiene el nombre del personaje con un adjetivo extra
     */
    public final String getName() {
        return String.format("%s", name);
    }

    /**
     * Obtiene el mapa de estadísticas del personaje.
     */
    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}
