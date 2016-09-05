/**
 * Created by joshuakeough on 8/30/16.
 */
public class Laptops {
    public String brand;
    public double processor;
    public boolean isNewestModel;
    public String operatingSystem;

    Laptops laptops = new Laptops();

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setProcessor(double processor) {
        this.processor = processor;
    }

    public double getProcessor() {
        return processor;
    }

    public void setNewestModel(boolean isNewestModel) {
        this.isNewestModel = isNewestModel;
    }

    public boolean getisNewestModel() {
        return isNewestModel;
    }

    public void setOperatingSystem(String os) {
        if(os.equals("ios")) {
            this.operatingSystem = "Macbook";
        }else{
            this.operatingSystem = "other";
        }
    }


    public String getOperatingSystem() {
        return operatingSystem;
    }
}
