package heroes;

import java.util.Scanner;

public class Hero implements heroes.Heroes {
    private int health;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int level;
    private int xpLevel;

    heroes.HeroFigure heroFigure;
    Scanner s = new Scanner(System.in);

    public Hero(heroes.HeroFigure heroFigure) {
        this.heroFigure = heroFigure;
    }

    @Override //method on how to choose a hero. Also, their stats are displayed
    public void pickHero() {
        switch (heroFigure) {
            case Warrior:
                health = 150;
                strength = 10;
                dexterity = 3;
                intelligence = 1;
                level = 1;
                xpLevel = 100;
                break;
            case Ranger:
                health = 120;
                strength = 5;
                dexterity = 10;
                intelligence = 2;
                level = 1;
                xpLevel = 100;
                break;
            case Mage:
                health = 100;
                strength = 2;
                dexterity = 3;
                intelligence = 10;
                level = 1;
                xpLevel = 100;
                break;
        }
        System.out.println("Attributes: ");
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Level: " + level);
        System.out.println("XP level: " + xpLevel);
    }

    @Override //method on how to level up for a specific hero
    public void levelUp() {
        switch (heroFigure) {
            case Warrior:
                health += 30;
                strength += 5;
                dexterity += 2;
                intelligence += 1;
                level++;
                increaseXP();
                break;
            case Ranger:
                health += 20;
                strength += 2;
                dexterity += 5;
                intelligence += 1;
                level++;
                increaseXP();
                break;
            case Mage:
                health += 15;
                strength += 1;
                dexterity += 2;
                intelligence += 5;
                level++;
                increaseXP();
                break;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println(heroFigure + " has leveled up and now has these attributes:");
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Level: " + level);
        System.out.println("XP to increase a level: " + xpLevel);
    }

    @Override //method on how to gain XP for a specific level (increasing by 10%)
    public void increaseXP() {
        if (xpLevel >= 100 && level > 1) ;
        {
            xpLevel += xpLevel * .1;
        }
    }

    @Override
    public void equipItem() {

    }

    @Override
    public void attack() {

    }
}