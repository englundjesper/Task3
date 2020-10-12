package se.experis.jenglu;

import heroes.HeroFigure;
import items.WeaponOption;
import items.Weapon;
import heroes.Hero;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the RPG game. Please pick a hero: "); //Main menu on how to choose a hero.
        System.out.println("Warrior");
        System.out.println("Ranger");
        System.out.println("Mage");
        String pickHero = s.nextLine();
        System.out.println("You picked " + pickHero);
        Hero hero;

        switch (pickHero) { //switch case where Warrior/Ranger/Mage is chosen. Also, level up and increase of XP is shown.
                case "Warrior":
                hero = new Hero(HeroFigure.Warrior);
                hero.pickHero();
                break;
            case "Ranger":
                hero = new Hero(HeroFigure.Ranger);
                hero.pickHero();
                break;
            case "Mage":
                hero = new Hero(HeroFigure.Mage);
                hero.pickHero();
            default:
                break;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Please choose a weapon:");
        System.out.println("1. Range");
        System.out.println("2. Melee");
        System.out.println("3. Wand");
        String pickWeapon = s.nextLine();
        Weapon weapon;

        //  chooseWeapon(hero, weaponOption);

        switch (pickWeapon) { //switch case where Range/Melee/Wand is chosen. Also, base damage for respective weapon is shown.
            case "Range":
                weapon = new Weapon (WeaponOption.Range);
                System.out.println("You chose Range!");
                weapon.displayBaseStats();
                break;
            case "Melee":
                weapon = new Weapon (WeaponOption.Melee);
                System.out.println("You chose Melee!");
                weapon.displayBaseStats();
                break;
            case "Wand":
                weapon = new Weapon (WeaponOption.Wand);
                System.out.println("You chose Wand!");
                weapon.displayBaseStats();
            default:
                break;
        }
    }
}
