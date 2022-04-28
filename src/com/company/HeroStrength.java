package com.company;

public class HeroStrength extends Hero {
    
    private String type;


    HeroStrength(String name) {
        super(name);
        this.type = "Strength";
    }

    
    
    @Override
    public void attack(Hero opponent) {
        double attack = this.weapon.attack;
        System.out.println(this.name + " attacking " + opponent.name);  
        opponent.defence(this, attack);

        setExp(50);
        levelUp();
    }

    public void setExp(double addExp) {
        this.exp += addExp;
    }

    public void levelUp() {
        if (this.exp >= 100) {
            this.level += 1;
            this.exp -= 100;
        }
    }
 
    @Override
    public void defence(Hero opponent, double damage) {

        System.out.println(this.name + " attacked " + opponent.name);
        System.out.println("-----------------------");
        
        
        if (this.armor.armor > 0) {
            if (this.armor.armor >= damage) {
                this.armor.armor -= (damage * 0.5);
                System.out.println(this.name + " gets damage " + damage);
                System.out.println("Remaining armor : " + this.armor.armor);
                System.out.println("Remaining blood : " + this.health);
                System.out.println("-----------------------");
            } else {
                this.armor.armor = 0;
                System.out.println(this.name + " gets damage " + damage);
                System.out.println("Remaining armor : " + this.armor.armor);
                System.out.println("Remaining blood : " + this.health);
                System.out.println("-----------------------");
            }
        } else {
            this.health -= (damage * 0.5);
            
            if (this.health >= 0) {
                System.out.println(this.name + " gets damage " + damage);
                System.out.println("Remaining armor : " + this.armor.armor);
                System.out.println("Remaining blood : " + this.health);
                System.out.println("-----------------------");
            } else {
                if (this.health <= 0) {
                    this.health = 0;
                    System.out.println(this.name + " is dead");
                }
            }
        }
        
    }
    
    public void display() {
        System.out.println("Hero\t: " + this.name);
        System.out.println("Health\t: " + this.health);
        System.out.println("Level\t: " + this.level);
        System.out.println("Type\t: " + this.type);
        this.weapon.display();
        this.armor.display();
        System.out.println();
    }
    
}

