import java.util.Scanner;

public class Task_02 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter radious:");

        int radius = sc.nextInt();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area is " + area);
        System.out.println("Circumference is " + circumference);
       sc.close();
     
    }
}
