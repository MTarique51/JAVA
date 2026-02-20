public class inverted_and_half_rotated_pyramid 
{

    public static void inverted_and_half_rotated_Pyramid(int n)
    {
        //outer
        for(int i=1; i<=n; i++)
        {
            //spaces
            for(int j=1; j<= n-i; j++)
            {
                System.out.print(" ");
            }
            //star//
            for(int j=1; j<=i; j++)
            {
            System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) 
    {
        inverted_and_half_rotated_Pyramid(5);
    }
}
