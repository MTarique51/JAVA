  
import java.util.*;
public class kadanes_Algorithm{


    public static void  maxSubArraySum(int numbers[])
    {
         int currSum = 0;
         int maxSum = Integer.MIN_VALUE;
         int prefix[] = new int[numbers.length];

         prefix[0] = numbers[0];

         // calculate Prefix Array
         for(int i = 1 ; i < prefix.length ; i++)        // if we start from 0 then (0-1) which is -1 case of out of Bond
         {
            prefix[i] = prefix[i-1] + numbers[i];
         }

        for(int i=0 ; i<numbers.length ; i++)
        {
            int start = i;

            for(int j=i ; j<numbers.length ; j++)
            {
                int end = j;

                currSum = start == 0? prefix[end] : prefix[end] - prefix[start -1];
                System.out.print(currSum + " ");
                if(maxSum < currSum)
                {
                    maxSum = currSum;
                }
            }
        }
        System.out.println();
        System.out.println("Maximum Sum  = " + maxSum);
    }

    public static void kadanes(int numbers[])
    {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0 ; i<numbers.length ; i++)
        {
            cs = cs + numbers[i];
            if(cs < 0)
            {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("Our max Sub Array Sum is : " + ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
          kadanes(numbers);
        
    } 
}
