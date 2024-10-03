public class Vehicle {
    private int id;
    private String brand;
    private Engine engine;
    private CarType type;

    public Vehicle(int id, String brand, Engine engine, CarType type) {
        this.id = id;
        this.brand = brand;
        this.engine = engine;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getType() {
        return type;

    }
}