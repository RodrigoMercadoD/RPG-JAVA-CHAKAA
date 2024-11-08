package rpg.entities.enemies.Luiyi;
import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.EnemyType;
import rpg.enums.Stats;
import rpg.utils.Randomize;

public class LuiyiTepito extends Enemy {
    /**
     * Constructor de la clase Enemy.
     *
     * @param name
     */
    public LuiyiTepito(String name) {
        super("Luiyi de tepito");
    }
    @Override
    public String getLoot(){
        return "Luiyi solto 20 pejecoins";
    }
    @Override
    protected void initCharacter() {
        this.type = EnemyType.BASIC;
        this.stats.put(Stats.MAX_HP, 24);
        this.stats.put(Stats.HP, 22);
        this.stats.put(Stats.ATTACK, 3);
        this.stats.put(Stats.DEFENSE, 2);
    }

    protected void Perreke(GameCharacter enemy) {

        System.out.println(this.name + " Baja hasta el suelo " + enemy.getName() + " y quedas con el ojo cuadrado.");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    protected void Nachos(GameCharacter enemy) {

        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.8);
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        System.out.println(this.name + " pide unos nachos con queso caliente " + enemy.getName() + " te quema " + damage + " y tienes chile en el ojo!");
        System.out.println(enemy.getName() + " has " + enemy.getStats().get(Stats.HP) + " HP left.");
    }

    @Override
    public void attack(GameCharacter enemy) {
        if (Math.random() < 0.5) {
            Perreke(enemy);
        } else {
            Nachos(enemy);
        }
    }
}
