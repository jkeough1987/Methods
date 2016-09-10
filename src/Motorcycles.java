/**
 * Created by joshuakeough on 8/30/16.
 */
public class Motorcycles {
    private String manufacturer;
    private int years;
    private int power;
    private String style;
    private boolean production;

    public Motorcycles(String manufacturer, int years, int power, String style, boolean production) {
        this.manufacturer = manufacturer;
        this.years = years;
        this.power = power;
        this.style = style;
        this.production = production;
    }

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
