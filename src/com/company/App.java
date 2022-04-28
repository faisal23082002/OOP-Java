package com.company;

public class App {
    public static void main(String[] args) throws Exception {
        
        HeroAgility hero1 = new HeroAgility("Axe");
        Weapon pedang1 = new Weapon("Pedang", 10);
        Armor bajuBesi1 = new Armor("baju besi", 20);

        HeroIntel hero2 = new HeroIntel("Mario");
        Weapon ketapel = new Weapon("Ketapel", 1);
        Armor kaos = new Armor("kaos", 2);

        HeroStrength hero3 = new HeroStrength("Sniper");
        Weapon pedang2 = new Weapon("pedang", 15);
        Armor bajuBesi2 = new Armor("Baju besi", 20);

        hero1.equipWeapon(pedang1);
        hero1.equipArmor(bajuBesi1);
        hero1.display();
        
        hero2.equipWeapon(ketapel);
        hero2.equipArmor(kaos);
        hero2.display();
        
        hero3.equipWeapon(pedang2);
        hero3.equipArmor(bajuBesi2);
        hero3.display();

        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        hero1.attack(hero3);
        
        hero3.display();
        hero1.display();
        

    }
}
