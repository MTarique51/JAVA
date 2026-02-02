import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.print("Enter any Number :");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        if(Number%2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}
