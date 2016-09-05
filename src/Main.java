import java.security.acl.LastOwnerException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Cars cars = new Cars();
        cars.setDoors("2");
        System.out.println(cars.getDoors());

        Motorcycles motorcyces = new Motorcycles();
        motorcyces.setManufacturer("kawasaki");
        System.out.println(motorcyces.getManufacturer());

        Laptops laptops = new Laptops();
        laptops.setOperatingSystem("windows");
        System.out.println(laptops.getOperatingSystem());

        Food food = new Food();
        food.setCalories(110);
        System.out.println(food.getCalories());

        Jobs jobs = new Jobs();
        jobs.setSalary(90000);
        System.out.println(jobs.getSalary());


    }


}
