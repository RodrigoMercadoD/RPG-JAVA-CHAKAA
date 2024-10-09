package rpg.entities;

import java.util.HashMap;
import java.util.Random;
import rpg.enums.Stats;
import rpg.entities.enemies.Enemy;
/**
 * Iniciamos una clase Player con un nombre, estadisticas y un numero aleatorio para su ataque varie
 */
public class Player extends GameCharacter {

    private Random random;

    public Player(String name) {

        super("Jugador");
        this.random = new Random();
        this.name = name;
    }

    @Override
    protected void initCharacter() {

        this.stats.put(Stats.MAX_HP, 100);
        this.stats.put(Stats.HP, 100);
        this.stats.put(Stats.ATTACK, 10);
        this.stats.put(Stats.DEFENSE, 5);
    }
    /**
     * Realiza un ataque al enemigo, calculando un daño aleatorio adicional entre 1 y 5, el daño total es la suma del ataque del jugador y un valor aleatorio, menos la defensa del enemigo.
     * Si el daño es positivo, se resta a los puntos de vida del enemigo, de lo contrario, no se hace daño.
     *
     * @param enemy El enemigo al que se ataca.
     */
    public void attack(Enemy enemy) {
        int randomDamage = random.nextInt(5) + 1; // Número aleatorio entre 1 y 5 para variar el dano
        int damage = (this.stats.get(Stats.ATTACK) + randomDamage) - enemy.getStats().get(Stats.DEFENSE);  // Calcula el daño final: ataque del jugador + daño aleatorio - defensa del enemigo
        if (damage > 0) {  // Si el daño es mayor que 0, se aplica al HP del enemigo
            // Resta el daño calculado a los puntos de vida (HP) del enemigo
            enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
            // Imprime un mensaje indicando el ataque exitoso y el daño realizado
            System.out.println(this.name + " ATACA A " + enemy.getName() + " CON " + damage + " DE DAÑO");
        } else {
            // Si el daño es menor o igual a 0, no se hace daño y se imprime un mensaje
            System.out.println(this.name + " ATACA A " + enemy.getName() + " PERO NO HACE DAÑO");
        }
    }


    public String getName() {
        return name; //devolvemos el nombre del jugador
    }

    public boolean isAlive() { //comprobamos con una funcion si el jugador sigue vivo para determinar en la clase game si la partida continua
        return this.stats.get(Stats.HP) > 0;
    }

    public HashMap<Stats, Integer> getStats() {
        return stats; //devuelve el mapa que va almacenando las estadisticas del jugador
    }
}
