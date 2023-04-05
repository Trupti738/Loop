import java.util.Scanner;

public class Astring {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String hello = scanner.nextLine();
        int charCount = hello.length() - hello.replaceAll("a", "").length();
        //put any word which contain a to check how many times a is available
        System.out.println(charCount);
    }
}


