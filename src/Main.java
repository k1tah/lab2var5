import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число x:");
        double x = input.nextDouble();
        System.out.println("Введите число n:");
        int n = input.nextInt();
        if (Math.abs(x) < 1) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.pow(x, 2 * i + 1) / (2 * i + 1);
            }
            System.out.println(sum * 2);
        } else {
            System.out.println("Число не соотв. диапазону");
        }
    }
}