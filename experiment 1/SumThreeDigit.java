import java.util.Scanner;

public class SumThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Maulik, 24csu302");

        if (n >= 100 && n <= 999) {
            int a = n / 100;
            int b = (n / 10) % 10;
            int c = n % 10;
            int sum = a + b + c;
            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println("Not a 3-digit number");
        }
    }
}
