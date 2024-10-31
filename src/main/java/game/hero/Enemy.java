package game.hero;

public abstract class Enemy implements Mortal {
    protected int health;

    protected int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }



    public void takeDamage(int damage) {
        if (damage < 0) {
            health-=damage;
        }
        if (health < 0) {
            health = 0;
        }
    }


    @Override
    public boolean isAlive() {
       return health > 0;

    }

    public abstract void attackEnemy();

}

