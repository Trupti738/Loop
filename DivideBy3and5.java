import java.util.Scanner;

public class DivideBy3and5 {
    public static void main(String[] args)
    {
        //create an object of scanner class
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print(" number: ");
        n=input.nextInt();
        //enter number to check divide by 3

        System.out.println("Divided by : 3");
        for (int i = 1; i <= n; i++) {
            if(i%3==0) System.out.print(i+", ");
        }
        //enter number to check divide by 5
        System.out.println("\nDivided by : 5");
        for (int i = 1; i <= n; i++) {
            if(i%5==0) System.out.print(i+"," );
        }}}
















