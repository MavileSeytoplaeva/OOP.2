package skypro;

public class Bicycle extends Vehicle implements ServiceStation, UpdateTyre{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void check() {
            System.out.println("Обслуживаем " + modelName);
            for (int i = 0; i < wheelsCount; i++) {
                updateTyre();
            }
        System.out.println("Все покрышки поменяли");
    }
}
