import java.util.Scanner;
public class ArithmaticOperators_Binary  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Number :");
        int A = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int B = sc.nextInt(); 
        
        System.out.println("Addition :" + (A+B));
        System.out.println("Difference :" + (A-B));
        System.out.println("Product :" + (A*B));
        System.out.println("Quotient :" + (A/B));
        System.out.println("Modulo(Remainder) :" + (A%B));
    }
}