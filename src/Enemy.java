import java.util.HashMap;

public class Enemy {
    private String name;
    private HashMap<Stats, Integer> stats;

    public Enemy(String name) {
        this.name = name;
        this.stats = new HashMap<>();
    }

    // Método para agregar una estadística al enemigo
    public void addStat(Stats stat, int value) {
        stats.put(stat, value);
    }
    public String getName() { //Metodo para nombrar
        return name;
        }
    public void attack(Player player) {
        // Logica de ataqie
    }

    // Otros métodos y lógica específica del enemigo
}
