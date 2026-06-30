import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {

    String name;
    int age;
    int id;

    Demo2(int id , String name , int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    Demo2(){

    }

    public String toString(){
        return "Demo{" +  "id: " +id + ", name: " + name +", age: "+ age + "}";
    }

    void display(ArrayList<Demo2> list){
        for (Demo2 d : list){
            System.out.println(d);
        }
    }


    public static void main(String[] args) {

        Demo2 d = new Demo2();

        ArrayList<Demo2> list = new ArrayList<>();
        list.add(new Demo2(12,"Ayyalu" , 19));
        list.add(new Demo2(13 , "Suriya" , 12));
        list.add(new Demo2(23 , "Devss" , 21));
        list.add(new Demo2(23 , "Devss" , 5));

        System.out.println(list);
        System.out.println("__________________");
        d.display(list);
        System.out.println("_________________");
        Collections.sort(list , (a,b) -> a.age - b.age);
        d.display(list);
        System.out.println("________________");
        Collections.sort(list, (a,b)-> a.name.compareTo(b.name));
        d.display(list);

    }
}
