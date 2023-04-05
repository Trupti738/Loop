import java.util.Scanner;

public class Multiplication {


        public static void main(String[] args)
        {
            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter number:");
            int n=scanner.nextInt();
            for(int i=1; i <= 12; i++)
            //enter number to find out timetable of that number
            {
                System.out.println(n+" * "+i+" = " +n*i);
            }
        }
    }

