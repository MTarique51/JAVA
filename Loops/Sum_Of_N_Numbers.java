import java.util.Scanner;

public class Sum_Of_N_Numbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number :");
       int num = sc.nextInt();
       
       int sum = 0;
       int count = 1;

       while (count <= num) {
        sum += count ;
        count++;        
       }
       System.out.println("Sum Of The Given Natural Number : " +sum);
    }
}
