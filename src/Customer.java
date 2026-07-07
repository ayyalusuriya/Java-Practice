import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Customer {

    int customerId;
    String customerName;
    String city;
     int age;
     double balance;

     Customer(int customerId , String customerName , String city , int age , double balance){
         this.customerId = customerId;
         this.customerName = customerName;
         this.city = city;
         this.age = age;
         this.balance = balance;
     }

    public String toString(){
        return "Employee{ "+ "id= " + customerId + "' name" + customerName + ", city: " + city + ", age: " + age + ", balance; " + balance + "}";
    }



    public static void main(String[] args) {

        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer(101 , "Ayyalu" , "Chennai" , 21 , 120000));
        list.add(new Customer(90 , "Suriya" , "Thoothukudi" , 22 , 20000));
        list.add(new Customer(210 , "Devss" , "Coiambatore" , 19 , 45678));


        List<Customer> res = list.stream().sorted(
                                Comparator.comparing((Customer c) -> c.city)
                                        .thenComparing(c-> c.balance)
                                        .thenComparing(c->c.customerName)
                                        ).filter(c->c.balance > 50000).toList();


        res.forEach(System.out::println);

        System.out.println("_______________");


    }
}
