package game.hero;

public class Archer extends Hero{



    public Archer(String name) {
        super(name);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("Archer нанес врагу 50% урона и убил его в славном бою");
    }

    public void attackEnemy(){
        System.out.println("Арчер атакует врага");
    }
}
