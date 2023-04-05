import java.util.Scanner;

public class Range1to20 {
    public static void main(String[]args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = a; i < 20; i++)
            sum =sum +i;
        //put number to check its range
        System.out.println("The sum of x range is " + sum);



    }
}

