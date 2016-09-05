/**
 * Created by joshuakeough on 8/30/16.
 */
public class Food {
    public String group;
    public int calories;
    public boolean isGlutenFree;


    Food food = new Food();

    public void setGroup(String group) {
        if(group.contains("fruit")) {
            group = "Fruit rocks!";
        }else{
            this.group = group + " is almost as good as fruit";
        }

    }

    public String getGroup() {
        return group;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    public boolean getIsGlutenFree() {
        return isGlutenFree;
    }
}
