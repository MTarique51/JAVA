 import java.util.*;
 public class Except_Continue {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       do{
       System.out.print("Enter Number :");
       int num = sc.nextInt();
       if(num%10==0){
        System.out.println("Detect Multiple Of 10 ");
        continue;
       }
       System.out.println(num);
       }while(true);
    }
}
