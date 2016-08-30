import java.util.Objects;

/**
 * Created by joshuakeough on 8/30/16.
 */
public class Cars {

    public String manufacturer;
    public int passengers;
    public String doors;
    public boolean isTowingCapable;
    public String model;

    public Cars() {

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
