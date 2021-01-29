package Experiment_3;

public class BaJie extends JWTCharacter {
    public BaJie(String name, String weapon, int power, int health) {
        super(name, weapon, power, health);
    }

    public String toString() {
        return getName() + ":俺老猪的武器是" + getWeapon() + "," +
                "战斗力" + getPower() + "星," + "耐力" + getHealth() + "星";
    }
}
