import java.util.Scanner;

public class Factorial {
    public static void main(String []args)
    {
        //Take number from user

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
        //put number to check its factorial number
        System.out.println("Factorial of the number :"  +factorial);




    }}
