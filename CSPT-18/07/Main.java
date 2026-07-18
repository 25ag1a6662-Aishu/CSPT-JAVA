// SUPER, BASE, PARENT
class ConP {
    public void myVehicle() {
        System.out.println("Honda CR-V");
    }
}

// SUB, DERIVED, CHILD
class ConC extends ConP {
    @Override
    public void myVehicle() {
        System.out.println("Toyota RAV4");
    }

    public void display() {
        this.myVehicle();      // Calls current class method
        super.myVehicle();     // Calls parent class method
    }
}

public class Main {
    public static void main(String[] args) {
        ConC obj = new ConC();
        obj.display();
    }
}