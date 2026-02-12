import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name pls: ");
        String name = sc.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking double input
        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");

        sc.close();
    }
}
