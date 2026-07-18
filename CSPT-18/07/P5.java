class Arithmetic {
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Calculator extends Arithmetic {
    @Override
    public int calculate(int a, int b) {
        return super.calculate(a, b);
    }
}

public class P5 {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        int result = c.calculate(20, 30);

        System.out.println("Addition = " + result);
    }
}