public class Car extends Vehicle {
    private double speed;

    public Car(int id, String brand, Engine engine, CarType type, double speed) {
        super(id, brand, engine, type);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }


    public void accelerate() {
        System.out.println("Автмобиль разгоняется без каких-либо параметров");
    }

    public void accelerate(int amount) {
        System.out.println("Автомобиль ускоряется на:" + amount + " km/h");
    }

    public final void accelerate(String mode) {
        System.out.println("Автомобиль набирает скорость:" + mode + " режим");
    }
}

