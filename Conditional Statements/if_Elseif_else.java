import java.util.Scanner;

public class if_Elseif_else {
    public static void main(String[] args) {
        System.out.print("Enter Age :");
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();

        if(Age>18) {
            System.out.println("Adult");
        }
        else if(Age>=13 && Age<=18) {
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
