import java.util.HashMap;

public class Player {
    private String name;
    private HashMap<Stats, Integer> stats;

    public Player(String name) {
        this.name = name;
        this.stats = new HashMap<>();
    }

    // Método para agregar una estadística al jugador
    public void addStat(Stats stat, int value) {
        stats.put(stat, value);
    }
    public String getName() { //Metodo para nombrar
        return name;
    }
    public void attack(Enemy enemy) {
        // Logica de ataqie
    }
}
