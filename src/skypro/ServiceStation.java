package skypro;

public class ServiceStation {
    public static void check(Bicycle bicycle){
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
        System.out.println("Все покрышки поменяли");
    }

    public static void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        System.out.println("Все покрышки поменяли");
        car.checkEngine();
    }

    public static void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        System.out.println("Все покрышки поменяли");
        truck.checkEngine();
        truck.checkTrailer();
    }
}
