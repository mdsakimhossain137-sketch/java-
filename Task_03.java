import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("First is greater");
        }
        else if (b > a) {
            System.out.println("Second is greater");
        }
        else {
            System.out.println("The numbers are equal");
        }

        sc.close();
    }
}
    
