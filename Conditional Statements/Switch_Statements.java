import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {

        // int number = 2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int number = sc.nextInt();

        switch(number) {
            case 1 : System.out.println("Mango");
                    break;
            case 2 :System.out.println("Orange");
                    break;
            case 3 :System.out.println("Banana");
                    break;
            default : System.out.println("We Wake Up");
        }
    }
}
