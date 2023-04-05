import java.util.Scanner;
public class Month {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter month number : ");
        int monthnumber;
        monthnumber= scanner.nextInt();
        switch (monthnumber) {
            //put number to check month
            case 1:
                System.out.println("Month : 1 January");
                break;
            case 2:
                System.out.println("Month :2 February");
                break;
            case 3:
                System.out.println("Month :3 March");
                break;
            case 4:
                System.out.println("Month :4 April");
                break;
            case 5:
                System.out.println("Month :5 May");
                break;
            case 6:
                System.out.println("Month : 6 June");
                break;
            case 7:
                System.out.println("Month :7 July");
                break;
            case 8:
                System.out.println("Month : 8 August");
                break;
            case 9:
                System.out.println("Month: 9 September");
                break;
            case 10:
                System.out.println("Month: 10 October");
                break;
            case 11:
                System.out.println(" Month : 11 November");
                break;
            case 12:
                System.out.println("Month : 12 December");
                break;
                //more than 12 number become default month
            default:
                System.out.println("default month.");
                break;
        }
    }
}




