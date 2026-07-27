import java.util.Scanner;
class Employee{
    int ID;
    double Salary;
    String Name;

    void details(int id,String name,double salary){
        ID=id;
        Name=name;
        Salary=salary;
    }

    void display(){
        System.out.println("ID:"+ID);
        System.out.println("Name:"+Name);
        System.out.println("Salary:"+Salary);
    }
}
public class OOPS{
    public static void main(String args[]){
        
        Employee e1=new Employee();
        System.out.println("Enter Employee-1 details");
        Scanner s=new Scanner(System.in);
        System.out.print("ID:");
        int i=s.nextInt();
        System.out.print("Name:");
        String n=s.next();
        System.out.print("Salary:");
        double d=s.nextDouble();

        e1.details(i,n,d);
        


        Employee e2=new Employee();
        System.out.println("Enter Employee-2 details");
        System.out.println("ID ,Name , Salary:");
        e2.details(s.nextInt(),s.next(),s.nextDouble());
        
        Employee e3=new Employee();
        System.out.println("Enter Employee 3 Details:");
        System.out.println("ID, Name, Salary:");
        e3.details(s.nextInt(),s.next() ,s.nextDouble());
        System.out.println();
        e1.display();
        e2.display();
        e3.display();

    }
}