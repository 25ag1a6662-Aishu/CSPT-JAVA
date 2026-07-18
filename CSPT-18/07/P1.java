// Methods
// 1. Access Specifier (public)
// 2. Return Type (void)
// 3. Method Name (show)
// 4. Parameter List ()

abstract class DemoAB {
    abstract public void show();

    public void display() {
        System.out.println("Display method");
    }
}

class AbsDemo extends DemoAB {

    @Override
    public void show() {
        System.out.println("I am SHOW FROM MEESHO");
    }

    public static void main(String[] args) {
        AbsDemo dab = new AbsDemo();

        dab.show();      // Calls the implemented abstract method
        dab.display();   // Calls the concrete method
    }
}