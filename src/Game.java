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
 public void startGame() {
        while (player1.isAlive() && enemy1.isAlive()) {
            player1.attack(enemy1);
            if (enemy1.isAlive()) {
                enemy1.attack(player1);       
            }
            if (player1.isAlive())&& enemy1.isDead()) {
            System.out.println("Derrotaste al malvado!");
        } else {
            System.out.println("Fallaste, te han chakaleado.");
        }
