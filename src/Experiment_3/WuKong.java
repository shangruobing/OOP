package Experiment_3;

public class WuKong extends JWTCharacter {
    public String toString() {
        return getName() + ":俺老孙的武器是" + getWeapon() + "," +
                "战斗力" + getPower() + "星," + "耐力" + getHealth() + "星";
    }
}
