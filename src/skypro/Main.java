package skypro;
public class Main {
    public static void main(String[] args) {
//      Первый способ
        Bicycle bicycle = new Bicycle("My bike", 2);
        Truck truck  = new Truck("My truck", 8);
        Car car = new Car("My car", 4);
        bicycle.check();
        car.check();
        truck.check();
//      Второй способ
        ServiceStation[] vehicles = {
                new Bicycle("My bike", 2),
                new Truck("My truck", 8),
                new Car("My car", 4)
        };
        for (ServiceStation vehicle : vehicles) {
            vehicle.check();
        }
    }
}
