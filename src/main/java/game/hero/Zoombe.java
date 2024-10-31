package game.hero;

public class Zoombe extends Enemy{
    protected int damage;
    protected int health;

    public int getDamage() {
        return damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void attackEnemy() {
        System.out.println("испугался и убежал с поля боя");
    }

    public Zoombe(int health, int damage) {
        super(health, damage);

    }

}
