import java.util.Scanner;

public class ArithmeticProgression {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите первое число:");
    int a = scanner.nextInt();

    System.out.println("Введите второе число:");
    int b = scanner.nextInt();

    System.out.println("Введите k:");
    int k = scanner.nextInt();

    System.out.println(a + (b - a) * (k - 1));

    scanner.close();
  }
}
