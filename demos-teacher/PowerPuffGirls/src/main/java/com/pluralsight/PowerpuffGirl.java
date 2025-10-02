package com.pluralsight;

public class PowerpuffGirl {
    // instance variables (typically hidden)
    private String name;
    private int health;
    private String outfitColor;
    private int attackDamage;
    private int power;

    //Consutructor (parameters with a _name)
    public PowerpuffGirl(String _name, String _outfitcolor) {
        this.name = _name;
        this.outfitColor = _outfitcolor;
        this.power = 100; // default values
        this.health = 100; // default values
        this.attackDamage = 100; // default values
    }

    public String getName() {
        return this.name;
    }


    public int gethealth(int i) {
        return this.health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int _newHealth) {
        if (_newHealth > 0 && _newHealth < 100) {
            this.health = _newHealth;
        }
        System.out.println("Come on, this is not possible. try again");
    }

    public void Heal(int _howMuchHealth) {
        System.out.println("Drinking potion");
        //We cant be above 100

        int newHealth = this.health + _howMuchHealth;
        if (newHealth >= 100) {
            this.setHealth(100);
            System.out.println("Fully recovered");
        }


    }

}