package rpg.entities.enemies.Iker;

import rpg.entities.GameCharacter;
import rpg.entities.enemies.Enemy;
import rpg.enums.EnemyType;
import rpg.enums.Stats;
import rpg.exceptions.EnemyDeathException;
import rpg.utils.Randomize;
import rpg.utils.cache.ImageCache;

import javax.swing.*;

public class IkerTepito extends Enemy {

    public IkerTepito() {
        super("Iker de Tepito");
        ImageCache.addImage("IkerTepito", "IkerTepito.png");
    }
@Override
public String getLoot() {
    return "El Iker de Tepito solto:";
}

@Override
protected void initCharacter() {
    this.type = EnemyType.BASIC;
    this.stats.put(Stats.MAX_HP, 35);
    this.stats.put(Stats.HP, 35);
    this.stats.put(Stats.ATTACK, 6);
    this.stats.put(Stats.DEFENSE, 2);
    this.stats.put(Stats.EXPERIENCE, 20);
    this.stats.put(Stats.GOLD, 10);
}

@Override
public String attack(GameCharacter enemy) {
    String message;
    // Se elige un número aleatorio entre 1 y 100
    int random = Randomize.getRandomInt(1, 100);
    // 50% de probabilidad de atacar normalmente
    // 25% de probabilidad de morder
    // 25% de probabilidad de lanzar una roca
    int attack = (random <= 50) ? 3 : (random <= 75) ? 2 : 1;
    // Se elige el ataque a realizar
    switch (attack) {
        case 1:
            try {
                message = Michelada(enemy);
            } catch (EnemyDeathException e) {
                enemy.getStats().put(Stats.HP, 0);
                message = """
                            El Brayan novato lanza una roca y te hace 2 de daño.
                            ¡Has muerto!
                            """;
            }
            break;
        case 2:
            try {
                message = Cawamaso(enemy);
            } catch (EnemyDeathException e) {
                enemy.getStats().put(Stats.HP, 0);
                message = """
                            El Brayan novato muerde salvajemente y te hace 3 de daño.
                            ¡Has muerto!
                            """;
            }
            break;
        default:
            message = ((GameCharacter) this).attack(enemy);
            break;
    }
    return message;
}

protected String Michelada(GameCharacter enemy) throws EnemyDeathException {
    int damage = 2;
    int newHP = reduceHP(enemy, damage);
    String enemyName = enemy.getName();
    String message = String.format("""
                ¡%s le agarra un micheladazo %s por %d de daño!
                %s tiene %d HP restantes.
                """, this.name, enemyName, damage, enemyName, newHP);
    return message;
}


protected String Cawamaso(GameCharacter enemy) throws EnemyDeathException {
    int damage = 3;
    int newHP = reduceHP(enemy, damage);
    String enemyName = enemy.getName();
    String message = String.format("""
                ¡%s le da un cawamaso a %s por %d de daño!
                %s tiene %d HP restantes.
                """, this.name, enemyName, damage, enemyName, newHP);
    return message;
}

@Override
public ImageIcon getSprite() {

    return ImageCache.getImageIcon("Brayan");
}
}