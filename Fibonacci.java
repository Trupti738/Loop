import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int n, a=0,b=0 , c=1;
        //check for fibonacci number

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value of n");
        n= scanner.nextInt();
        System.out.println("fibonacci series");
        for (int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            //put number to check its fibonacci number
            System.out.println(a +" ");
        }
    }
}
