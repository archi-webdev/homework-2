package game.hero;

public class Warrior extends Hero{
    private String names = "Warrior";


    public Warrior(String name) {
        super(name);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("Warrior нанес врагу 30 единиц урона");
    }

//
//    public void attackEnemy(Enemy enemy, int damage) {
//        System.out.println(names + ": " + getName() + " атакует врага!");
//        enemy.takeDamage(damage);
//    }

    public void attackEnemy(){
        System.out.println("Воин атакует врага");

    }



}
