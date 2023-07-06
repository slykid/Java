public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JUnit!");

        Calculator calculator = new Calculator(new KrwCalculator());

        System.out.println(calculator.sum(10 , 10));

    }
}