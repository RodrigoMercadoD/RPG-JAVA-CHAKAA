package rpg.entities.enemies;

import rpg.entities.GameCharacter;
import rpg.entities.Player;
import rpg.enums.Stats;

import java.util.HashMap;
import java.util.Random;

/**
 * La clase Enemy representa a un enemigo en el juego.
 */
public class Enemy {
    public String name; // Nombre del enemigo
    public HashMap<Stats, Integer> stats; // Mapa que contiene las estadísticas del enemigo (HP, ataque, defensa)
    public Random random; // Número aleatorio usado para variar el daño de ataque

    /**
     * Constructor de la clase Enemy.
     */
    public Enemy(String name) {
        this.name = name; // Asigna el nombre del enemigo
        this.stats = new HashMap<>(); // incluye estadisticas por defecto del mapa
        this.stats.put(Stats.MAX_HP, 100); // Vida máxima
        this.stats.put(Stats.HP, 100); // Vida
        this.stats.put(Stats.ATTACK, 10); // Ataque
        this.stats.put(Stats.DEFENSE, 5); // Defensa
        this.random = new Random(); // declaracion para usar el numero random del ataque
    }

    public String getName() {
        return name; // Devuelve el nombre del enemigo
    }

    /**
     * Realiza un ataque al jugador, calculando un daño aleatorio adicional entre 1 y 5.
     * El daño total es la suma del ataque del enemigo y un valor aleatorio, menos la defensa del jugador.
     * Si el daño es positivo, se resta a los puntos de vida del jugador, de lo contrario, no se hace daño.
     */
    public void attack(Player player) {
        // Genera un número aleatorio entre 1 y 5 para varear el daño
        int randomDamage = random.nextInt(5) + 1; // Número aleatorio entre 1 y 5
        // Calcula el daño final ataque del enemigo + daño aleatorio - defensa del jugador
        int damage = (this.stats.get(Stats.ATTACK) + randomDamage) - player.getStats().get(Stats.DEFENSE);

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

    public void attack(GameCharacter target) {
        // lógica de ataque que funciona tanto para Player como para Enemy
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
}


