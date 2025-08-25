import cars.Car;

public class TestCar
{
    public static void main(String[] args)
    {
        Car t1 = new Car(); // Corrected type
        t1.setName("sumo");
        t1.setCompanyName("Tata");
        t1.setModel(2015);
        t1.setPrice(180000);
        t1.setSpeed(100);
        System.out.println("car Company name:"+t1.getCompanyName());
        System.out.println("car name:"+t1.getName());
        System.out.println("car model:"+t1.getModel());
        System.out.println("car price:"+t1.getPrice());
        System.out.println("car speed:"+t1.getSpeed()+"KM/hr.");
    }
}