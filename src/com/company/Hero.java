package com.company;

public abstract class Hero {
    
    public String name;
    public double health;
    public double exp;
    public int level;

    Weapon weapon;
    Armor armor;

    Hero(String name) {
        this.name = name;
        this.health = 100;
        this.exp = 0;
        this.level = 1;
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    public abstract void display();

    public abstract void attack(Hero opponent);

    public abstract void defence(Hero opponent, double damage);
}

class Weapon {
    String name;
    double attack;

    Weapon(String name, double attack) {
        this.name = name;
        this.attack = attack;
    }

    public void display() {
        System.out.println("Weapon\t: " + this.name);
        System.out.println("Attack\t: " + this.attack);
    }
}

class Armor {
    String name;
    double armor;

    Armor(String name, double armor) {
        this.name = name;
        this.armor = armor;
    }

    public void display() {
        System.out.println("Armor\t: " + this.name);
        System.out.println("Defence\t: " + this.armor);
    }


}