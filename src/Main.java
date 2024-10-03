public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V8 Turbo");
        Car carA = new Car(1, "Toyota", engine, CarType.SEDAN, 180.0);
        SpartsCar carB = new SpartsCar(2, "Ferrari", engine, CarType.COUPE, 320.0, true);
        SpartsCar carC = new SpartsCar(3, "Lamborghini", engine, CarType.COUPE, 350.0, false);

        printCarDetails(carA);
        printCarDetails(carB);
        printCarDetails(carC);

        carA.accelerate();
        carA.accelerate(50);
        carA.accelerate("Eco");

        carB.accelerate();
        carB.accelerate(100);
        carB.accelerate("Sport");

        carC.accelerate();
        carC.accelerate(150);
        carC.accelerate("Race");
    }
    public static void printCarDetails(Vehicle car) {
        System.out.println("ID: " + car.getId());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Engine Model: " + car.getEngine().getModel());
        System.out.println("Car Type: " + car.getType());
        if (car instanceof Car) {
            System.out.println("Speed: " + ((Car) car).getSpeed());
        }
        if (car instanceof SpartsCar) {
            System.out.println("Is Turbo Enabled: " + ((SpartsCar) car).isTurboEnabled());
        }
        System.out.println();




    }

}