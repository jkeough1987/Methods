/**
 * Created by joshuakeough on 8/30/16.
 */
public class Jobs {
    private String paytype;
    private int salary;
    private int hours;
    private String field;
    private boolean isEntryLevel;


    public Jobs(String paytype, int salary, int hours, String field, boolean isEntryLevel) {
        this.paytype = paytype;
        this.salary = salary;
        this.hours = hours;
        this.field = field;
        this.isEntryLevel = isEntryLevel;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setSalary(int salary) {
        if(salary >= 100000) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setIsEntryLevel(boolean isEntryLevel) {
        this.isEntryLevel = isEntryLevel;
    }

    public boolean getIsEntryLevel() {
        return isEntryLevel;
    }
}
