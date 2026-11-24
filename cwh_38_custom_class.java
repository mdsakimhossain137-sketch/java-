class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My salary is "+salary);
        System.out.println("and my name is "+name);
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is your custom class");
        //instnting a new employee
        Employee harry =new Employee();
        Employee john=new Employee();
        //setting attributes
        harry.id =12;
        harry.salary=23000;
        harry.name="Code with harry";
        john.id=17;
        john.salary=34000;
        john.name="john tripati";
        //

 //System.out.println(harry.id);
// System.out.println(harry.name);
harry.printdetails();
john.printdetails();
    }
}
