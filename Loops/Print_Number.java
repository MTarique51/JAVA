import java.util.Scanner;

public class Print_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int N = sc.nextInt();

        int count = 1;

        while (count<=N) {
            System.out.print(count+" ");
            count++;            
        }
    }
}

