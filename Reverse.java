import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num=0;
        int reversenumber =0;

        System.out.println ("Input your number: ");
    Scanner scanner = new Scanner(System.in);

    num = scanner.nextInt();
        for ( ;num != 0; )
    {   reversenumber = reversenumber * 10;
        reversenumber = reversenumber + num%10;
        num = num/10;

        //put number to check reverse number
    }  System.out.println("Reverse of given number is: "+reversenumber);
}}
