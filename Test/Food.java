package Test;

public class Food {
    private String foodType;
    private String foodNmae;
    private double calorie;
    private double prive;

    public Food() {
    }

    public Food(String foodType, String foodNmae, double calorie, double prive) {
        this.foodType = foodType;
        this.foodNmae = foodNmae;
        this.calorie = calorie;
        this.prive = prive;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodNmae() {
        return foodNmae;
    }

    public void setFoodNmae(String foodNmae) {
        this.foodNmae = foodNmae;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getPrive() {
        return prive;
    }

    public void setPrive(double prive) {
        this.prive = prive;
    }

    public String showInfo() {
        if (calorie > 200) {
            return "高热量";
        }
        return "Food{" +
                "foodType='" + foodType + '\'' +
                ", foodNmae='" + foodNmae + '\'' +
                ", Calorie='" + calorie + '\'' +
                ", prive=" + prive +
                '}';
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.setFoodNmae("披萨");
        food.setFoodType("快餐");
        food.setCalorie(400);
        System.out.println(food.showInfo());
    }
}
