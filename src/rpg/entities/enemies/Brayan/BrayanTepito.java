package rpg.entities.enemies.Brayan;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.EnemyType;
import rpg.enums.Stats;
import rpg.utils.Randomize;

public class BrayanTepito extends Enemy {

    public BrayanTepito() {
        super("Brayan Tepito");
    }
    @Override
    public String getLoot(){
        return "Vendio tachas y perico";
    }
    @Override
    protected void initCharacter() { 
        this.type = EnemyType.BASIC;
        this.stats.put(Stats.MAX_HP, 16);
        this.stats.put(Stats.HP, 18);
        this.stats.put(Stats.ATTACK, 1);
        this.stats.put(Stats.DEFENSE, 3);
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
        System.out.println(this.name + " Se desconecta contra ti " + enemy.getName() + " con "
                + damage + " de daño!");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " HP restante");
    }

    protected void GuardameelFilero(GameCharacter enemy) {
        int damage = 3;
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " Te arroja el filero " + enemy.getName() + " y hace " + damage + " de daño!");
        System.out.println(enemy.getName() + " tiene " + enemy.getStats().get(Stats.HP) + " HP restante");
    }
}
