import java.util.Scanner;

public class InputAnyNumber {
    public static void main(String[] args){

     // create an object of scanner class
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
       int a=scanner.nextInt();
       System.out.println("enter second  number");
      int b=scanner.nextInt();
      // check range of numbers

       for (a=a; a<=b; a++){
            System.out.println(a);
        }

    }

}
