public class Car extends WheeledTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkEnginge() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        checkEnginge();
    }

}
