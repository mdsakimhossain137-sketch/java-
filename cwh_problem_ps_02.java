public class cwh_problem_ps_02 {
    static int sumrect(int n){
        if (n==1) {
            return 1;
        }
        return n + sumrect(n-1);
    }
    public static void main(String[] args) {
        int c= sumrect(4);
        System.out.println(c);
    }
    //static void pattern1(int n){
        /*for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
       System.out.print("*");
            }
       System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(10);
    }*/
}
