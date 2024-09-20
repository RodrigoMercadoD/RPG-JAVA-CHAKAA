import java.util.HashMap;

public class Player {
    private String name;
    private HashMap<Stats, Integer> stats;

    public Player(String name) { 
        this.name = name;
        this.stats = new HashMap<>();
        this.stats.put(Stats.MAX_HP, 100);
        this.stats.put(Stats.HP, 100);
        this.stats.put(Stats.MAX_MP, 50);
        this.stats.put(Stats.MP, 50);
        this.stats.put(Stats.ATTACK, 10);
        this.stats.put(Stats.DEFENSE, 5);
    }

    // Método para agregar una estadística al jugador
    public void addStat(Stats stat, int value) {
        stats.put(stat, value);
    }
    public boolean isAlive() {
        return this.stats.get(Stats.HP) > 0;
}
    }
    public void attack(Enemy enemy) {
        int damage = this.stats.get(Stats.ATTACK) - enemy.getStats().get(Stats.DEFENSE);
        if (damage > 0) {
            enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
            System.out.println(this.name + " attacks " + enemy.getName() + " for " + damage + " damage!");
        } else {
            System.out.println(this.name + " attacks " + enemy.getName() + " but does no damage!");
        }
}
}
        // Logica de ataque
    }
}
