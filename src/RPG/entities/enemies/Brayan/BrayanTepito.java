package rpg.entities.enemies.Brayan;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;
import rpg.utils.Randomize;

public class BrayanTepito extends Enemy {

    public BrayanTepito() {
        super("Brayan Tepito");
        this.name = "Brayan de Tepito";
        this.stats.put(Stats.MAX_HP, 35);
        this.stats.put(Stats.HP, 35);
        this.stats.put(Stats.ATTACK, 6);
        this.stats.put(Stats.DEFENSE, 2);
    }

    @Override
    public void attack(GameCharacter enemy) {
        int attack = Randomize.getRandomInt(1, 3);
        switch (attack) {
            case 1:
                DesconectedePeda(enemy);
                break;
            case 2:
                GuardameelFilero(enemy);
                break;
            default:
                super.attack(enemy);
                break;
        }
    }

    protected void DesconectedePeda(GameCharacter enemy) {
        int damage = 2;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " throws a rock at " + enemy.getName() + " for "
                + damage + " damage!");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    protected void GuardameelFilero(GameCharacter enemy) {
        int damage = 3;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " bites " + enemy.getName() + " for " + damage + " damage!");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }
}
