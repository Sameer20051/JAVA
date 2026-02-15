import java.util.Scanner;

public class marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks of maths");
        int maths = sc.nextInt();

        System.out.println("enter the marks of the english");
        int english = sc.nextInt();

        System.out.println("enter the marks of the hindi");
        int hindi = sc.nextInt();

        System.out.println("enter the marks of the gk");
        int gk = sc.nextInt();

        System.out.println("enter the marks of the science");
        int science = sc.nextInt();

        int marks = maths + english + hindi + gk + science;
        int percent = marks / 5;

        System.out.println("the percent of the student is " + percent + "%");

        sc.close();   
    }
}
