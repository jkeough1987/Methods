import sun.tools.tree.CatchStatement;

import java.util.Objects;

/**
 * Created by joshuakeough on 8/30/16.
 */
public class Cars {

    private String manufacturer;
    private int passengers;
    private String doors;
    private boolean isTowingCapable;
    private String model;

    public Cars(String manufacturer, int passengers, String doors, boolean isTowingCapable, String model) {
        this.manufacturer = manufacturer;
        this.passengers = passengers;
        this.doors = doors;
        this.isTowingCapable = isTowingCapable;
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setDoors(String doors) {
        if(doors.equals("4")) {
            this.doors = "4 door sedan!";
        } else {
            this.doors = "2 door coupe";
        }
    }

    public String getDoors() {
        return doors;
    }

    public void setIsTowingCapable(boolean isTowingCapable) {

        this.isTowingCapable = isTowingCapable;
    }

    public boolean getIsTowingCapable() {
        return isTowingCapable;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}
