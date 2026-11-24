import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter seconds");

        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;

        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;

        int seconds = remainingSeconds % 60;

        System.out.println("Hours: " + hours
                + " Minutes: " + minutes
                + " Seconds: " + seconds);

        sc.close();
    }
}
