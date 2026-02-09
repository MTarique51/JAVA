public class Product {

    public static int Multiply(int a , int b){
             int product = a * b;
             return product ;
        }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
       int prod = Multiply(a,b);
       System.out.println("a * b = " + prod);
    }
}
