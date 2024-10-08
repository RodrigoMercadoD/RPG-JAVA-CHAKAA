package rpg.entities.enemies.Policia;


import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.EnemyType;
import rpg.enums.Stats;

public class PoliciaTepito extends Policia {

    public PoliciaTepito() {
        super();
        this.name = "Policia de Tepito";
        this.stats.put(Stats.MAX_HP, 10);
        this.stats.put(Stats.HP, 10);
        this.stats.put(Stats.ATTACK, 8);
        this.stats.put(Stats.DEFENSE, 10);
        this.type = EnemyType.ADVANCE;
    }

    @Override
    public String getLoot(){
        return "Policia solto 5 umas";
    }
    protected void xEsoJov(GameCharacter enemy) {

        System.out.println(this.name + " te para en la esquina " + enemy.getName() + " pero no traes nada y te deja.");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    protected void mordida(GameCharacter enemy) {

        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.8);
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " Te pide que le des pa la coca " + enemy.getName() + " no le das nada " + damage + " y te mete al bote!");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " HP restante");
    }

    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            xEsoJov(enemy);
        } else {
            mordida(enemy);
        }
    }
}