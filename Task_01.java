import java.util.Scanner;

public class Task_01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num1 =sc.nextInt();
    int num2 =sc.nextInt();
int sum =num1 + num2;
int product = num1*num2;
int Difference = num1-num2;
System.out.println("The sum of the number is "+sum);
System.out.println("The product of the number is "+product);
System.out.println("The  difference of the number is "+Difference);
sc.close();
}
    
}
