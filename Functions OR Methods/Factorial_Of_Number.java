public class Factorial_Of_Number {

    public static int factorial(int n){
        int f = 1;

        for(int i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {

            System.out.print("Factorial of The Given Number : ");
            System.out.println(factorial(5));
    }
}
