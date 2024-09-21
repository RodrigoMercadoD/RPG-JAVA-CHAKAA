import javax.swing.JOptionPane;

/**
 * La clase Game representa la partida de juego..
 */
public class Game {
    private Player player; // Jugador que controla el usuario
    private Enemy enemy;   // Enemigo contra el cual combate el jugador

    /**
     * Constructor de la clase Game comienza el juego pidiendo el nombre del jugador a través de una ventana emergente.
     * Si el usuario no ingresa un nombre, se le asigna "Player"
     */
    public Game() {
        // Solicita el nombre del jugador
        String playerName = JOptionPane.showInputDialog("'¿Cuál es tu nombre?'");

        // Crea un nuevo jugador con el nombre proporcionado o un nombre por defectoe en caso no le sea otorgado uno
        this.player = new Player(playerName != null && !playerName.isEmpty() ? playerName : "Player");

        // Crea un enemigo llamado El Brayan
        this.enemy = new Enemy("El Brayan");
    }

    /**
     * Inicia la partida entre el jugador y el enemigo.
     * Los turnos se alternan entre el jugador y el enemigo, atacándose entre sí.
     * El juego termina cuando uno de los dos muere.
     */
    public void startGame() {
        // El juego continuaa mientras los dos sigan vivos
        while (player.isAlive() && enemy.isAlive()) {
            // El jugador ataca primero al enemigo
            player.attack(enemy);

            // Si el enemigo sigue vivo, contraataca
            if (enemy.isAlive()) {
                enemy.attack(player);
            }

            // Imprime los puntos de vida actuales del jugador y el enemigo
            System.out.println("Tu HP es de " + player.getStats().get(Stats.HP));
            System.out.println("HP del Brayan es de " + enemy.getStats().get(Stats.HP));
            System.out.println(); // Agrega una línea en blanco para mayor legibilidad y no se amontone todo
        }
        // Mensaje final según quién haya ganado
        if (player.isAlive()) {
            System.out.println("Derrotaste al malvado!"+ "\nFelicidades");
        } else {
            System.out.println("Fallaste, te han chakaleado.");}}

    /**
     * Método principal que ejecuta el juego.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crea una nueva instancia del juego e inicia
        Game game = new Game();
        game.startGame();
    }
}
