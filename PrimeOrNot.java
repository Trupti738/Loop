import java.util.Scanner;



public class PrimeOrNot {
    public static void main(String args[]){
        int a;
        boolean Prime =true;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        number = scanner.nextInt();

        for(int i=2;i<=number/2;i++){
            a=number%i;
            if(a==0){
                Prime=false;

            }
        //put number to check prime or not
        }
        if(Prime) System.out.println(number+" is a prime number");
        else
            System.out.println(number + " is not a Prime Number");





    }



}



