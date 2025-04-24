public class Problem1 {
    public static class Calculator {
        double a, b;

        public Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double operate(String operation) {
            switch (operation.toLowerCase()) {
                case "add": return a + b;
                case "subtract": return a - b;
                case "multiply": return a * b;
                case "divide": return b != 0 ? a / b : Double.NaN;
                default: throw new IllegalArgumentException("Invalid operation");
            }
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(10.5, 2.5);
        System.out.println("Add: " + calc.operate("add"));
    }
}
