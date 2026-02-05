import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers :");
        int n = sc.nextInt();

        int count = 1;
        do{
            System.out.println("Hello World");
            count++;
        }
        while(count <= n);
    }
}
