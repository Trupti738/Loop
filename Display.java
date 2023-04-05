import java.util.Scanner;

public class Display {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = scanner.nextInt();
            int i,sum=0;


            for(i=0;i<=n;i++)
            //n=natural number
            {
                sum = sum + i;
            }
            //checking for sum of natural number

            System.out.println("Sum of first "+n+" natural number = "+sum);
        }
    }



