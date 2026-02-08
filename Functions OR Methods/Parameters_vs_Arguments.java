import java.util.Scanner;

public class Parameters_vs_Arguments {

    public static int calculateSum(int num1 , int num2) {  // called :- Parameters OR formal Parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of a nd b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);                    // called Arguments OR actual Parameters
        System.out.println("Sum is :" +sum);
    }
}
