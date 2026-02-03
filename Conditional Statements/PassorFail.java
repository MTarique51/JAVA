import java.util.*;
public class PassorFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks :");
        int marks = sc.nextInt();

        // if(marks>=33) {
        //     System.out.println("PASS");
        // }
        // else {
        //     System.out.println("FAIL");

        String Record = marks>=33 ? "PASS" : "FAIL";
        System.out.println("Student is :" +Record);

        }
}

