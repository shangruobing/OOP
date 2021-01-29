package Experiment_3;

public class BullDemon extends JWTCharacter{
    public String toString() {
        return getName() + ":老牛的武器是" + getWeapon() + "," +
                "战斗力" + getPower() + "星," + "耐力" + getHealth() + "星";
    }
}
