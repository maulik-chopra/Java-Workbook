public class reverse_number {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Maulik, 24csu302");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
        scanner.close();
    }
}