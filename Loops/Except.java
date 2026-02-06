import java.util.Scanner;

public class Except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         do{
            System.out.print("Eneter any number :");
            int n = sc.nextInt();
            if(n%10 == 0) {
                break;
            }
            System.out.println(n);
         }while(true);
         System.out.println("This Number is Multiple of 10 ");
    }
    
}
