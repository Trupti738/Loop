import java.util.Scanner;

public class NpositiveIntiger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");

        int n = input.nextInt();
        //n is positive number

        double sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += 1.0 / i;
            //check sum of series of numbers

        }

        System.out.println("The sum of the series is: " + sum);
    }
}
