class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}


class Motocycle extends Vehicle {
    void ride() {
        System.out.println("Motocycle is riding..");
    }
}


class hierarchical {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motocycle myMotocycle = new Motocycle();
        
        myCar.start();
        myCar.drive();
        myCar.stop();

        myMotocycle.start();
        myMotocycle.ride();
        myMotocycle.stop();
    }
}