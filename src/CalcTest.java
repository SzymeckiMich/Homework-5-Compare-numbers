import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Podaj pierwszą wartość");
        double first = scan.nextDouble();
        System.out.println("Podaj drugą wartość");
        double second = scan.nextDouble();
        System.out.println(calculator.compare(first, second));


    }
}
