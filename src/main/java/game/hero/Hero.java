package game.hero;

public abstract class Hero {
    private String name = "Artur";
    protected int damage;
    protected int health;

    public Hero(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public  void takeDamage(int damage){};

    public void attackEnemy(Enemy enemy, int damage) {


    }

}
