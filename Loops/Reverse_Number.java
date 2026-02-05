import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int n = sc.nextInt();

        while(n>0){
            int lastDigit = n%10;                       // (for Last digit)
            System.out.print(lastDigit);
            n = n/10;                                   // (Every time removing Last digit)
        }
    }  
}

