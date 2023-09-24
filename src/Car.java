public class Car extends WheeledTransport {
    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkEnginge() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check(Car car, Bicycle bicycle, Truck truck) {
        super.check();
    }

    public void check() {
    }
}
