import java.util.Scanner;

public class Syntax_with_Parameters {
    
    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a");
        int a = sc.nextInt();
        System.out.print("Enter a");
        int b = sc.nextInt();
        int sum = (a+b);
        System.out.println("Sum is :" +sum);
    }
    
    public static void main(String[] args) {
        calculateSum();
    }
}
