package vn.codegym;
import java.util.Scanner;

public class welcome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("Enter your name:");
        name = scan.nextLine();

        System.out.println("Hello: " + name);
    }

}
