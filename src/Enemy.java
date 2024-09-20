import java.util.HashMap;

public class Enemy { 
    private String name;
    private HashMap<Stats, Integer> stats;

    public Enemy(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        this.stats.put(Stats.max_HP, 100);
        this.stats.put(Stats.HP, 100);
        this.stats.put(Stats.max_HP, 50);
        this.stats.put(Stats.MP, 50);
        this.stats.put(Stats.ATTACK, 10);
        this.stats.put(Stats.DEFENSE, 5);
        
    }

    // Método para agregar una estadística al enemigo
    public void addStat(Stats stat, int value) {
        stats.put(stat, value);
    }
    public String getName() { //Metodo para nombrar
        return name;
        }
    public void attack(Player player) {
        int damage = this.stats.get(Stats.ATTACK) - player.getStats().get(Stats.Defense);
        if(damage>0){
            player.getStats().put(States.HP, player.getStats().get(Stats.HP) - damage);
            System.out.print1n(this.name + "attacks" +player.getName() + "for" + damage + "damage!");
        }else{
            System.out.print1n(this.name + "attacks" +player.getName() + "but does no damage!");
        }
    }
    public boolean isAlive(){
        return this.stats.get(Stats.HP)>0;
    }
}
