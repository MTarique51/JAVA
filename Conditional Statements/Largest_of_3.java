import java.util.Scanner;

public class Largest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A :");
        int A = sc.nextInt();
        System.out.print("Enter B :");
        int B = sc.nextInt();
        System.out.print("Enter C :");
        int C = sc.nextInt();

        if(A>B && A>C) {
            System.out.println("Greater Number :" +A);
        }
        else if (B>C) {
             System.out.println("Greater Number :" +B);
        }
        else {
             System.out.println("Greater Number :" +C);
        }
    }
}
