public class Exceptiomss extends Exception{

    public Exceptiomss(String msg){
        super(msg);

    }
    public static void main(String[] args) {
        int age = 12;
            try {
                if(age < 18){
                    throw new Exceptiomss("Age is below 18....!!!");
                }
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }


    }
}
