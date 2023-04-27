package skypro;
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("My bike", 2);
        Truck truck  = new Truck("My truck", 8);
        Car car = new Car("My car", 4);
        ServiceStation.check(car);
        ServiceStation.check(bicycle);
        ServiceStation.check(truck);
    }
}
