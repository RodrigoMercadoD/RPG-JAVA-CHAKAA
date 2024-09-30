package rpg.entities;

import rpg.entities.enemies.Enemy;
import rpg.entities.enemies.Brayan.BrayanTepito;
import rpg.entities.enemies.Iker.IkerTepito;
import rpg.entities.enemies.Luiyi.LuiyiTepito;
import rpg.entities.enemies.Policia.PoliciaTepito;

import rpg.utils.Randomize;

public class Game {

    private Player player;
    private Enemy enemy;

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }

    public Game() {
        this.player = new Player("Player");
        int enemyType = Randomize.getRandomInt(1, 3);
        this.enemy = switch (enemyType) {
            case 1 -> new BrayanTepito();
            case 2 -> new IkerTepito();
            default -> new Enemy();
        };
    }

    public void startGame() {
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }

        if (player.isAlive()) {
            System.out.println(player.getName() + " wins!");
        } else {
            System.out.println(enemy.getName() + " wins!");
        }
    }
}