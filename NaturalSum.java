import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args)

    {
        int i, n, sum=0;
        {
            //create an object of scanner class
            Scanner in = new Scanner(System.in);
            System.out.print("Input number: ");
            n = in.nextInt();
        }
        System.out.println("The first natural numbers are : "+n);

        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        //checking sum of natural number
        System.out.println("The Sum of Natural Number  "+n+ " =  " +sum);

    }
}

