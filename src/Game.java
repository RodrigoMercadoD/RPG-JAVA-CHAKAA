public class Game {
    public static void game(String[] args) {
        Player player1 = new Player("Jugador/a");
        player1.addStat(Stats.HP, 100);
        player1.addStat(Stats.ATTACK, 20);

        Enemy enemy1 = new Enemy("El Bryan");
        enemy1.addStat(Stats.HP, 200);
        enemy1.addStat(Stats.DEFENSE, 15);
    }
}
