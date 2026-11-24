import java.util.Scanner;

/**
 * Task_09
 */
public class Task_09 {
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter hours:");

        int hours = sc.nextInt();

        int salary;

        if (hours < 0 || hours > 168) {
            System.out.println("Invalid hours");
        }
        else if (hours <= 40) {
            salary = hours * 200;

            System.out.println(salary);
        }
        else {
            salary = 8000 + (hours - 40) * 300;

            System.out.println(salary);
        }

        sc.close();
} 
}
