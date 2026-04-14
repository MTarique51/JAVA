import java.util.Scanner;

public class Strings
{

    // By Creating a Function 
    public static void printLetters(String str)
    {
        for(int i=0 ; i<str.length() ; i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
    }


    public static void main(String args[]) 
   {

        // Tp Find the length
        String fullName = "Miss Afra Reyaz ";
        System.out.println("Length of the String : " + fullName.length());           

        // For Concatination
        String firstName = "Mohammad Tarique  ";
        String secondName = "S/O Manzoorul Hasan , Chhitanpura Maunath Bhanjan ";
        String FullName = firstName + secondName;
        System.out.println("After concatinate : " + FullName);
        System.out.println("Character at Position " + FullName.charAt(5));

        // For taking input to print
        char arr[] = {'a' , 'b' , 'c' , 'd'};
        String str1 = "abcd";
        String str2  = new String("xyz");

        Scanner sc  =  new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println("By Taking the input : " +name);

        printLetters("by Calling the Function : " + FullName);
    }
}
  