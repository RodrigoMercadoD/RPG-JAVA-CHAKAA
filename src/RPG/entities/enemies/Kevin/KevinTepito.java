package rpg.entities.enemies.Kevin;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;
import rpg.utils.Randomize;

public class KevinTepito extends Enemy {
   public BrayanTepito() {
        super("kevinTepito");
        this.name = "Kevin de Tepito";
        this.stats.put(Stats.MAX_HP, 25);
        this.stats.put(Stats.HP, 25);
        this.stats.put(Stats.ATTACK, 8);
        this.stats.put(Stats.DEFENSE, 3);
    }

    @Override
    public void attack(GameCharacter enemy) {
        int attack = Randomize.getRandomInt(1, 3);
        switch (attack) {
            case 1:
                throwKnife(enemy);
                break;
            case 2:
                fireBalls(enemy);
                break;
            default:
                super.attack(enemy);
                break;
        }
    }
    protected void throwKnifire(GameCharacter enemy) {
        int damage = 2;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " throws a rock at " + enemy.getName() + " for "
                + damage + " damage!");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    protected void fireBalls(GameCharacter enemy) {
        int damage = 3;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " bites " + enemy.getName() + " for " + damage + " damage!");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }
  
  
}
