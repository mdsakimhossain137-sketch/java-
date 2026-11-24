import java.util.Scanner;

public class Tasks_01 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter quantity");
        int n =sc.nextInt();
        System.out.println("Enter number:");
        int num=sc.nextInt();

        int max = num;
        int min =num;
        int sum=num;
        for(int i=2;i<=n;i++){
            num = sc.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            sum=sum+num;
        }
       double average=(double)sum/n;
       System.out.println(max);
       System.out.println(min);
       System.out.println(average);
       sc.close();

    }
}
