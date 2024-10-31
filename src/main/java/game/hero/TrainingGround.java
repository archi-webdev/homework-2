package game.hero;

import org.example.Main;

public class TrainingGround {
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
    }
}
