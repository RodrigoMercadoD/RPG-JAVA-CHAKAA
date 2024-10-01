package rpg.entities.enemies.Kevin;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;
import rpg.utils.Randomize;

public class KevinTepito extends Enemy {
   public BrayanTepito() {
        super("kevinTepito");
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
                throwKnife(enemy);
                break;
            case 2:
                fireBalls(enemy);
                break;
            default:
                great.attack(enemy);
                break;
        }
    }
  
  
}
