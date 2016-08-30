/**
 * Created by joshuakeough on 8/30/16.
 */
public class Laptops {
    public String brand;
    public double processor;
    public boolean isNewestModel;
    public String os;

    public Laptops() {

    }

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

    public void setOs(String os) {
        if(os.equals("ios")) {
            this.os = "Macbook";
        }else{
            this.os = "other";
        }
    }


    public String getOs() {
        return os;
    }
}
