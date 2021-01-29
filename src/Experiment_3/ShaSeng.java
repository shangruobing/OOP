package Experiment_3;

public class ShaSeng extends JWTCharacter {
    public ShaSeng(String name, String weapon, int power, int health) {
        super(name, weapon, power, health);
    }

    public String toString() {
        return getName() + ":沙和尚的武器是" + getWeapon() + "," +
                "战斗力" + getPower() + "星," + "耐力" + getHealth() + "星";
    }
}
