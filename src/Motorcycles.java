/**
 * Created by joshuakeough on 8/30/16.
 */
public class Motorcycles {
    public String manufacturer;
    public int years;
    public int power;
    public String style;
    public boolean production;

    Motorcycles motorcycles = new Motorcycles();

    public void setManufacturer(String manufacturer) {
        if(manufacturer.equalsIgnoreCase("Kawasaki")) {
            this.manufacturer = manufacturer;
        }else {
            this.manufacturer = "NA";
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setProduction(boolean production) {
        this.production = production;
    }

    public boolean getProduction() {
        return production;
    }
}
