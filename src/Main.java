import java.security.acl.LastOwnerException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Cars cars = new Cars("chevy", 4, "4", true, "corvette");
        cars.setDoors("2");
        System.out.println(cars.getDoors());

        Motorcycles motorcyces = new Motorcycles("kawasaki", 2016,78,"ninja 650r", true);
        motorcyces.setManufacturer("kawasaki");
        System.out.println(motorcyces.getManufacturer());

        Laptops laptops = new Laptops("mac", 2.8, true, "macbook");
        laptops.setOperatingSystem("windows");
        System.out.println(laptops.getOperatingSystem());

        Food food = new Food("fruit", 200, true);
        food.setCalories(110);
        System.out.println(food.getCalories());

        Jobs jobs = new Jobs("salary", 100000, 40, "IT", true);
        jobs.setSalary(90000);
        System.out.println(jobs.getSalary());


    }


}
