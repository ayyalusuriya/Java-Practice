import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {

    int id;
    String name;
    String Dept;
    double salary;

    Employee(int id, String name , String Dept, double salary){

        this.id = id;
        this.salary = salary;
        this.Dept = Dept;
        this.name = name;

    }

    Employee(){

    }

    public String toString(){
        return "Employee{ "+ "id= " + id + "' name" + name + ", Dept: " + Dept + ", salary: " + salary + "}";
    }
    public static void main(String[] args) {


        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101,"Ayyalu", "IT" , 20000));
        emp.add( new Employee(201 , "Suriya" , "CSE" , 900000));
        emp.add (new Employee(233 , "DEVSS" , "IT" , 789090));

        List<Employee> sorted = emp.stream().sorted(
                Comparator.comparing((Employee e) -> e.Dept)
                        .thenComparing(e -> e.name)
                        .thenComparing(e -> e.salary)
        ).toList();

        sorted.forEach(System.out::println);
    }
}
