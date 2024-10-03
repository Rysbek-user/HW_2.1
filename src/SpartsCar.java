public final class SpartsCar extends Car {
    private boolean isTurboEnabled;

    public SpartsCar(int id, String brand, Engine engine, CarType type, double speed, boolean isTurboEnabled) {
        super(id, brand, engine, type, speed);
        this.isTurboEnabled = isTurboEnabled;
    }

    public boolean isTurboEnabled() {
        return isTurboEnabled;
    }

    @Override
    public void accelerate() {
        System.out.println("Спортивный автомобиль быстро набирает скорость! ");
    }
}
