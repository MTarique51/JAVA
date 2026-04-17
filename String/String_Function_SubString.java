import java.util.Scanner;

public class String_Function_SubString {

    public static String subString(String str, int si, int ei)
    {
        String substr = "";                // At starting it will be empty
        for(int i=si ; i<ei ; i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args)
    {
        // String str = "MohammadTarique";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any String : ");
        String str = sc.nextLine();
        
        System.out.println("By Created function SubString is : " +subString(str, 0, 3));    // this is By function 
        
        // No Need to build any function in java for subString (StringName.substring())
        System.out.println("By using of InBuilt Function SubString is : "+str.substring(0,5));  
    }        
}
