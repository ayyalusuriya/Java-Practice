import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo implements Comparable<Demo>{
    int id;
    String name;
    int age;
public Demo(int id , String name, int age){
    this.age = age;
    this.name = name;
    this.id = id;
}
Demo(){

}
    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

void display(ArrayList<Demo> list){
    for(Demo demo : list){
        System.out.println(demo);
    }

}

//@Override
//public int compareTo(Demo s){
//    return this.age - s.age;
//
//}

@Override
public int compareTo(Demo s){
    return s.name.compareTo(this.name);
}




    public static void main(String[] args) {

        ArrayList<Demo> list = new ArrayList<>();
        Demo d  =new Demo();

        list.add(new Demo(12,"Ayyalu" , 19));
        list.add(new Demo(13 , "Suriya" , 12));
        list.add(new Demo(23 , "Devss" , 21));
        list.add(new Demo(23 , "Devss" , 5));


        System.out.println(list);
        System.out.println("_________________");
        d.display(list);
        System.out.println("______________");
        Collections.sort(list);
        d.display(list);
    }
}
