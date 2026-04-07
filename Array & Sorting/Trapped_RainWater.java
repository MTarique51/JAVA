public class Trapped_RainWater 
{

    public static int trappedRainwater(int height[])
    {

        int n = height.length;

        // Calculated Left MAx Boundary_ Array
        int leftmax[] = new int [n];
        leftmax[0] = height[0];
        for(int i = 1 ; i < n ;  i++)
        {
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }


        // Calculated Right MAx Boundary_ Array
        int rightmax[] = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2 ; i >= 0 ; i--)
        {
            rightmax[i] = Math.max(height[i] , rightmax[i + 1]);
        }

        int trappedWater = 0;
        // Loop
        for(int i=0 ; i<n ; i++)
        {
           // Water Level = min(leftmax Boundary ,  rightmax Boundary)
           int WaterLevel = Math.min(leftmax[i] , rightmax[i]);

           // Trapped Water  = WaterLevel - height[i]
           trappedWater += WaterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) 
    {
        int height[] = {4 , 2 , 0 , 6 , 3 , 2 , 5};
         System.out.println(trappedRainwater(height));
    }    
}
