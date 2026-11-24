public class cwh_32_method_overloading {
    static void change (int a ){
      a=98;
    }
    static void foo(){
        
        System.out.println("Good Morning ");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + "bro");
        
    }
    static void foo(int a ,int b){
        System.out.println("Good morning bro" + a + b + "hello");
    }
    static void change2(int []arr){
         arr[0]=98;
    }
    static void telljokes(){
        System.out.println("I invented a new word\n"+"plagarism");
    }
    public static void main(String[] args) {
      //  int [ ] marks ={23,34,56,78,455};
      //  int x=45;
        //change(x);
        //System.out.println(x);

       // telljokes();
      // change2(marks);
       //System.out.println(marks[0]);
       //method overloading


      foo();
      foo(3000);
      foo(2500,  3400);
    }}
