package rpg.entities.enemies.Iker;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.EnemyType;
import rpg.enums.Stats;

public class IkerTepito extends Enemy {

    public IkerTepito() {
        super("Iker de Tepito");
    }
    @Override
    public String getLoot(){
        return "solto piedrazos";
    }
    @Override
    protected void initCharacter() {
        this.type = EnemyType.BASIC;
        this.stats.put(Stats.MAX_HP, 15);
        this.stats.put(Stats.HP, 16);
        this.stats.put(Stats.ATTACK, 8);
        this.stats.put(Stats.DEFENSE, 5);
    }
    protected void Michelada(GameCharacter enemy) {

        System.out.println(this.name + " Avienta su miche " + enemy.getName() + " pero no le atina.");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " HP restante");
    }

    protected void Cawamaso(GameCharacter enemy) {

        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.8);
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " Avienta su botella de cawama " + enemy.getName() + " recibe " + damage + " de daño");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " HP restante");
    }

    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            Michelada(enemy);
        } else {
            Cawamaso(enemy);
        }
    }
}
