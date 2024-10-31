package game.hero;

public class Vampire extends Enemy{
    protected int damage;
    protected int health;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getHealth() {
        return health;
    }


    public Vampire(int health, int damage) {
        super(health, damage);

    }




    @Override
    public void attackEnemy() {
        System.out.println("от увиденного вампир стал смертен и был убит воином");


    }
}
