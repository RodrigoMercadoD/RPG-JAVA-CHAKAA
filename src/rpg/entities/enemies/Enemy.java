package rpg.entities.enemies;

import rpg.entities.GameCharacter;
import rpg.entities.Player;
import rpg.enums.EnemyType;
import rpg.enums.Stats;

import java.util.HashMap;
import java.util.Random;

/**
 * La clase Enemy representa a un enemigo en el juego.
 */
public abstract class Enemy extends GameCharacter {

    protected EnemyType type;
    protected Random random; // Número aleatorio usado para variar el daño de ataque

    /**
     * Constructor de la clase Enemy.
     */
    public Enemy(String name) {
        super (name); // Nombre del enemigo
        this.name = name; // Asigna el nombre del enemigo
    }

    public abstract String getLoot();

    public String getName() {
        return name; // Devuelve el nombre del enemigo
    }

    /**
     * Realiza un ataque al jugador, calculando un daño aleatorio adicional entre 1 y 5.
     * El daño total es la suma del ataque del enemigo y un valor aleatorio, menos la defensa del jugador.
     * Si el daño es positivo, se resta a los puntos de vida del jugador, de lo contrario, no se hace daño.
     */
    public void attack(GameCharacter player) {

        int damage = (this.stats.get(Stats.ATTACK) ) - player.getStats().get(Stats.DEFENSE);

        // Si el daño es mayor que 0, se aplica al HP del jugador
        if (damage > 0) {
            // Resta el daño calculado a los puntos de vida HP del jugador
            player.getStats().put(Stats.HP, player.getStats().get(Stats.HP) - damage);
            // Imprime un mensaje indicando el ataque exitoso y el daño realizado
            System.out.println(this.name + " TE ATACA, " + player.getName() + ", Y RECIBES " + damage + " DE DAÑO");
        } else {
            // Si el daño es menor o igual a 0, no se hace daño y se imprime un mensaje
            System.out.println(this.name + " TE ATACA, " + player.getName() + " PERO NO HACE DAÑO");
        }
    }

    public boolean isAlive() {
        return this.stats.get(Stats.HP) > 0; // Devuelve si el HP del enemigo es mayor a 0
    }

    /**
     * Devuelve las estadísticas del enemigo.
     * Las estadísticas se almacenan en un mapa
     */
    public HashMap<Stats, Integer> getStats() {
        return stats; // Devuelve el mapa que contiene las estadísticas del enemigo
    }
    public EnemyType getType() {
        return type;
    }
}

