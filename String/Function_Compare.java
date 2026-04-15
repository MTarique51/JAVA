public class Function_Compare {
    public static void main(String[] args) 
    {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");            // this means New

        if(s1 == s2)
        {
            System.out.println("(s1 & s2) Strings are Equal");
        }
        else
        {
            System.out.println("(s1 & s2) Strings are not Equal");
        }


        if(s1 == s3)
        {
            System.out.println("(s1 & s3) Strings are Equal");
        }
        else
        {
            System.out.println("(s1 & s3) Strings are not Equal");
        }

        // To check any String's Equality only use (.equals) Function
        System.out.print("By Using the .equals function : ");
        if(s1.equals(s3))
        {
            System.out.println("(s1 & s3) Strings are Equal");
        }
        else
        {
            System.out.println("(s1 & s3) Strings are not Equal");
        }   
    }
}
