package skypro;
public class Car extends Vehicle implements ServiceStation, UpdateTyre, CheckEngine{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void check() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
        System.out.println("Все покрышки поменяли");
        checkEngine();
    }
}
