import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println("Welcome to the Cacluator");
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Please enter a command:");
      String func = scanner.next();
      if (func.equals("add")) {
        int result = calc.add(scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
      } else if (func.equals("subtract")) {
        int result = calc.subtract(scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
      } else if (func.equals("multiply")) {
        int result = calc.multiply(scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
      } else if (func.equals("divide")) {
        int result = calc.divide(scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
      } else if (func.equals("fibonacci")) {
        int result = calc.fibonacciNumberFinder(scanner.nextInt());
        System.out.println(result);
      } else if (func.equals("binary")) {
        String result = calc.intToBinaryNumber(scanner.nextInt());
        System.out.println(result);
      } else {
        System.out.println("Error: Input \'" + func + "\' is not recognized");
      }
    }
  }
}
