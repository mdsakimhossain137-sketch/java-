

public class cwh_variable_01 {
  /*  static int sum(int a,int b){
  
     int c;
     c=a+b;
     return c;
   }
    static int sum(int a,int b,int c){
        return a+b+c;
    }*/
   static int sum(int ...arr){
//int [] a;
int result=0;
for(int a: arr){
result +=a;
}
return result;
   }
    public static void main(String[] args) {
       System.out.println("welcome to varags");

System.out.println(sum(6, 9));
System.out.println(sum(56, 056, 034));
System.out.println(sum(12,34,56,23));
    }
}
