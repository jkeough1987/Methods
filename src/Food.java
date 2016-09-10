/**
 * Created by joshuakeough on 8/30/16.
 */
public class Food {
    private String group;
    private int calories;
    private boolean isGlutenFree;


    public Food(String group, int calories, boolean isGlutenFree) {
        this.group = group;
        this.calories = calories;
        this.isGlutenFree = isGlutenFree;
    }

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
