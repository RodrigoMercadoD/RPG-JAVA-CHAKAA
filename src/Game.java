import rpg.entities.GameCharacter;
import rpg.entities.Player;
import rpg.entities.enemies.Enemy;
import rpg.entities.enemies.Brayan.BrayanTepito;
import rpg.entities.enemies.Iker.IkerTepito;
import rpg.entities.enemies.Kevin.KevinTepito;
import rpg.entities.enemies.Luiyi.LuiyiTepito;
import rpg.entities.enemies.Policia.PoliciaTepito;

import rpg.utils.Randomize;

import javax.xml.namespace.QName;

/**
 * La clase Game representa el flujo principal de un juego RPG.
 * En esta clase se define al jugador y al enemigo, y se maneja la pelea entre ellos.
 */
public class Game {

    // Jugador principal del juego
    private Player player;

    // Enemigo contra el cual el jugador lucha
    private Enemy enemy;

    /**
     * Método principal que inicia el juego.
     */
    public static void main(String[] args) {
        Game game = new Game(); // Crea una nueva instancia del juego
        game.startGame(); // Inicia el flujo del juego
    }

    /**
     * Constructor de la clase Game.
     * Inicializa al jugador y selecciona aleatoriamente un enemigo.
     */
    public Game() {
        this.player = new Player("Jugador"); // Crea un jugador llamado "Jugador"
        int enemyType = Randomize.getRandomInt(1, 3); // Genera un tipo de enemigo aleatorio

        // Selección del enemigo basado en un número aleatorio
        this.enemy = switch (enemyType) {
            case 1 -> new BrayanTepito();
            case 2 -> new IkerTepito();
            case 3 -> new KevinTepito("Kevin de Tepito");
            case 4 -> new LuiyiTepito("Luiyi de Tepito");
            case 5 -> new PoliciaTepito();
            default -> new Enemy("Enemigo");
        };
    }

    /**
     * Inicia el bucle del juego donde el jugador y el enemigo se atacan hasta que uno muera
     * El jugador siempre ataca primero y si el enemigo sobrevive, este ataca de vuelta
     */
    public void startGame() {
        // Bucle que se ejecuta mientras jugador y enemigo estén vivos
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy); // El jugador ataca al enemigo
            if (enemy.isAlive()) {
                enemy.attack(player); // Si el enemigo sigue vivo, ataca al jugador
            }
        }

        // Eleccion para determinar quien gana segun quien sigue vivo
        if (player.isAlive()) {
            System.out.println(player.getName() + " gana!"); // El jugador gana
        } else {
            System.out.println(enemy.getName() + " gana!"); // El enemigo gana
        }
    }
}
