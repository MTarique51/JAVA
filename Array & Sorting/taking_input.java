import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();


        marks[2] = 100;

        System.out.println("Number of Phy : " + marks[0]);
        System.out.println("Number of Che : " + marks[1]);
        System.out.println("Number of Math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage  = " + percentage + "%");

        System.out.println("Length of the Array  : " + marks.length);
    }
}
