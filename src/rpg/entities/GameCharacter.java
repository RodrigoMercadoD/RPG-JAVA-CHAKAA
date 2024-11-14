<<<<<<< HEAD
package rpg.entities;

import rpg.enums.Stats;
import java.util.HashMap;

public abstract class GameCharacter {

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
    public void attack(GameCharacter enemy) {

        String message = "Nuevo enemigo"; // Mensaje de resultado del ataque
        String enemyName = enemy.getName(); // Nombre del enemigo
        int damage = this.stats.get(Stats.ATTACK) - enemy.getStats().get(Stats.DEFENSE); // Cálculo del daño

        int newHP = enemy.getStats().get(Stats.HP); // HP actual del enemigo

        // Si el daño es mayor que 0, se aplica el daño
        if (damage > 0) {
            newHP = enemy.getStats().get(Stats.HP) - damage; // Calcula el nuevo HP del enemigo
            enemy.getStats().put(Stats.HP, newHP); // Actualiza el HP del enemigo

            // Genera el mensaje de ataque con daño
            message += String.format("""
                    %s attacks %s for %d damage!
                    %s has %d HP left.
                    """, this.name, enemyName, damage, enemyName, newHP);
        } else {
            // Si el daño es 0 o negativo, no se inflige daño
            message += String.format("""
                    %s attacks %s but does no damage!
                    %s has %d HP left.
                    """, this.name, enemyName, enemyName, newHP);
        }

        System.out.println(message); // Imprime el resultado del ataque
    }

    /**
     * Obtiene el nombre del personaje con un adjetivo extra
     */
    public String getName() {
        return String.format("%s el Intrepido", name);
    }

    /**
     * Obtiene el mapa de estadísticas del personaje.
     */
    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}
=======
package rpg.entities;

import rpg.enums.Stats;
import java.util.HashMap;

public abstract class GameCharacter {

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
    public void attack(GameCharacter enemy) {

        String message = "Nuevo enemigo"; // Mensaje de resultado del ataque
        String enemyName = enemy.getName(); // Nombre del enemigo
        int damage = this.stats.get(Stats.ATTACK) - enemy.getStats().get(Stats.DEFENSE); // Cálculo del daño

        int newHP = enemy.getStats().get(Stats.HP); // HP actual del enemigo

        // Si el daño es mayor que 0, se aplica el daño
        if (damage > 0) {
            newHP = enemy.getStats().get(Stats.HP) - damage; // Calcula el nuevo HP del enemigo
            enemy.getStats().put(Stats.HP, newHP); // Actualiza el HP del enemigo

            // Genera el mensaje de ataque con daño
            message += String.format("""
                    %s attacks %s for %d damage!
                    %s has %d HP left.
                    """, this.name, enemyName, damage, enemyName, newHP);
        } else {
            // Si el daño es 0 o negativo, no se inflige daño
            message += String.format("""
                    %s attacks %s but does no damage!
                    %s has %d HP left.
                    """, this.name, enemyName, enemyName, newHP);
        }

        System.out.println(message); // Imprime el resultado del ataque
    }

    /**
     * Obtiene el nombre del personaje con un adjetivo extra
     */
    public String getName() {
        return String.format("%s el Intrepido", name);
    }

    /**
     * Obtiene el mapa de estadísticas del personaje.
     */
    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}
>>>>>>> origin/master
