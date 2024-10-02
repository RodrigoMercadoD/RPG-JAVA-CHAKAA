package rpg.entities.enemies.Policia;


import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;

public class PoliciaTepito extends Enemy {

    public PoliciaTepito() {
<<<<<<< HEAD
        super("Policia de Tepito");
=======
        super();
>>>>>>> origin/master
        this.name = "Policia de Tepito";
        this.stats.put(Stats.MAX_HP, 10);
        this.stats.put(Stats.HP, 10);
        this.stats.put(Stats.ATTACK, 5);
        this.stats.put(Stats.DEFENSE, 2);ñññ
    }

    protected void XesoJov(GameCharacter enemy) {

        System.out.println(this.name + " te para en la esquina " + enemy.getName() + " pero no traes nada y te deja.");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    protected void Mordida(GameCharacter enemy) {

        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.8);
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " Te pide que le des pa la coca " + enemy.getName() + " no le das nada " + damage + " y te mete al bote!");
<<<<<<< HEAD
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " HP restante");
=======
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
>>>>>>> origin/master
    }

    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            XesoJov(enemy);
        } else {
            Mordida(enemy);
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
