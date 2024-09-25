package rpg.entities.enemies.slimes;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;

public class IkerTepito extends Enemy {

    public IkerTepito() {
        super();
        this.name = "Iker de Tepito";
        this.stats.put(Stats.MAX_HP, 30);
        this.stats.put(Stats.HP, 30);
        this.stats.put(Stats.ATTACK, 10);
        this.stats.put(Stats.DEFENSE, 4);
    }

    protected void splash(GameCharacter enemy) {

        System.out.println(this.name + " splashes " + enemy.getName() + " and does nothing.");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    protected void trhowSlime(GameCharacter enemy) {

        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.8);
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " throws slime at " + enemy.getName() + " for " + damage + " damage!");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            splash(enemy);
        } else {
            trhowSlime(enemy);
        }
    }
}