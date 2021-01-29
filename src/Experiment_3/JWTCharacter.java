package Experiment_3;

public class JWTCharacter {
    private String name;
    private String weapon;
    private int power;
    private int health;

    public JWTCharacter() {
    }

    public JWTCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public JWTCharacter(String name, String weapon, int power, int health) {
        this.name = name;
        this.weapon = weapon;
        this.power = power;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
