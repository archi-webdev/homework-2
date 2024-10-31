package game.hero;

public class BattleGround {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("Warrior");
        warrior.attackEnemy();
        warrior.takeDamage(18);


        Mage mage = new Mage("Mage");
        mage.attackEnemy();
        mage.takeDamage(25);


        Archer archer = new Archer("Archer");
        archer.attackEnemy();
        archer.takeDamage(36);

        Zoombe zomb = new Zoombe(100,50);
        zomb.attackEnemy();

        Vampire vampire = new Vampire(100,50);
        vampire.attackEnemy();
    }
}
