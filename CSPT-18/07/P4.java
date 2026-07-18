class Vehicle {
    public void drive() {
        System.out.println("Repairing a car");
    }
}

class Car extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();

        Car c = new Car();
        c.drive();
    }
}
