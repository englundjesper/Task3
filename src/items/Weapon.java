package items;

import items.WeaponOption;

public class Weapon implements Items {
    private int baseDamage;

    items.WeaponOption weaponOption;

    public Weapon(items.WeaponOption weaponOption) {
        this.weaponOption = weaponOption;
    }

    public void displayBaseStats() {
        switch (weaponOption) {
            case Range:
                baseDamage = 5;
                break;
            case Melee:
                baseDamage = 15;
                break;
            case Wand:
                baseDamage = 20;
                break;
        }
        System.out.println("The base damage of this weapon is " + baseDamage);
    }

    @Override
    public void generateLevel() {

    }

    @Override
    public void generateNames() {

    }

    @Override
    public void createItems() {

    /*    switch (Weapon) {
            case "Melee":

                break;
            case "Ranged":

                break;
        }
        System.out.println("");
    }


    @Override
    public void chooseArmor() {

    }
     */

    }

    @Override
    public void chooseArmor() {

    }

}