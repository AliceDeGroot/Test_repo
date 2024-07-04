import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Whats your name?");
        String antw1 = scanner.nextLine();
        System.out.println("Hello "+ antw1+"!" );
    }
}