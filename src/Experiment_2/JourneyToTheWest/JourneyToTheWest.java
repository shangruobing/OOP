package Experiment_2.JourneyToTheWest;

public class JourneyToTheWest {
    private String roleName;
    private String weapon;
    private int power;
    private int endurance;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public String printRole() {
        return getRoleName() + ":" + getRoleName() + "的武器是" + getWeapon() + "," +
                "战斗力" + getPower() + "星," + "耐力" + getEndurance() + "星";
    }
}
