import java.util.ArrayList;
import java.util.List;

public class Product {
    int productId;
    String productName;
    double price;

    Product(int productId , String productName , int price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    Product(){

    }

    void display(ArrayList<Product>list){
        for(Product p: list){
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
      return "Demo{" +  "id: " + productId + ", name: " + productName +", Price: "+ price+ "}";
    }

    public static void main(String[] args) {

        Product p = new Product();

        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(12,"Ayyalu" , 120000));
        list.add(new Product(13 , "Suriya" , 2000));
        list.add(new Product(23 , "Devss" , 2100000));
        list.add(new Product(23 , "Devss" , 50000));


        List<Product> Sorted = list.stream().sorted((p1, p2)->{
                int result = p1.productName.compareTo(p2.productName);

        if(result == 0){
            return Double.compare(p1.price,p2.price);
        }
        return result;
        }).toList()   ;


    }
}
