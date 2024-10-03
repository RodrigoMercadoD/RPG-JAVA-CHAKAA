package rpg.entities.enemies.Kevin;
import rpg.entities.enemies.Enemy;
import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.entities.Player;
import rpg.enums.Stats;
import rpg.utils.Randomize;
public class KevinTepito extends Enemy {
    /**
     * Constructor de la clase Enemy.
     *
     * @param name
     */
    public KevinTepito(String name) {
        super(name);
        this.name = "Kevin de Tepito";
        this.stats.put(Stats.MAX_HP, 25);
        this.stats.put(Stats.HP, 25);
        this.stats.put(Stats.ATTACK, 8);
        this.stats.put(Stats.DEFENSE, 3);
    }
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

    protected void throwKnife(GameCharacter enemy) {
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


>>>>>>> origin/master
}
