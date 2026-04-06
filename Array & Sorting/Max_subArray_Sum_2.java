  
import java.util.*;
public class  Max_subArray_Sum_2 {

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
    public static void main(String[] args) {
        int numbers[] = {1 , -2 , 6 , -1 , 3};
         maxSubArraySum(numbers);
        
    } 
}
