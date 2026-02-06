import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number :");
       int N = sc.nextInt();

       boolean isPrime = true;

       for(int i = 2; i<=(N-1); i++){
        if(N%i == 0){                  // n is multiple  of i(i not equal to 1 or N)
            isPrime = false;
        }
       }

       if(isPrime == true){
        System.out.println("This is prime No ");
       }
       else{
        System.out.println("This is not prime ");
       }
    }
}
