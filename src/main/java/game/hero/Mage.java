package game.hero;

public class Mage extends Hero{


    public Mage(String name) {
        super(name);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("Mage нанес врагу 20 единиц урона урона");
    }

    public void attackEnemy(){
        System.out.println("Mage атакует врага");
    }
}
