import java.util.Scanner;

public class Calculator_Switch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value Of a :");
        float a = sc.nextInt();

        System.out.print("Enter Operator :");
        char operator = sc.next().charAt(0);

        System.out.print("Enter Value Of b :");
        float b = sc.nextInt();

        switch (operator) {

            case '+': System.out.println("Calculated Result = " + (a+b));
                break;
            case '-': System.out.println("Calculated Result = " + (a-b));
                break;
            case '*': System.out.println("Calculated Result = " + (a*b));
                break;
            case '/': System.out.println("Calculated Result = " + (a/b));
                break; 
            case '%': System.out.println("Calculated Result = " + (a%b));
                break;               
        
            default: System.out.println("Invailid Case");
                break;
        }
        
    }
}
