import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter any number :");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            if(i == n/2) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println(",I am Out From the Loop");
    }
}
