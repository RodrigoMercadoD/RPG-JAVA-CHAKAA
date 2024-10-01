package rpg.entities.enemies.Luiyi;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;

public class LuiyiTepito extends Enemy {

    public LuiyiTepito() {
        super();
        this.name = "Luiyi de Tepito";
        this.stats.put(Stats.MAX_HP, 60);
        this.stats.put(Stats.HP, 60);
        this.stats.put(Stats.ATTACK, 9);
        this.stats.put(Stats.DEFENSE, 8);
    }

    protected void acidRain(GameCharacter enemy) {

        System.out.println(this.name + " splashes " + enemy.getName() + " and does nothing.");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    protected void sharpSpikes(GameCharacter enemy) {

        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.8);
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " throws slime at " + enemy.getName() + " for " + damage + " damage!");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            acidRain(enemy);
        } else {
            sharpSpikes(enemy);
        }
    }
}
