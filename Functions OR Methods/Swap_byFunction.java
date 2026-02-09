public class Swap_byFunction {
    
        public static void swap(int a , int b){
         int temp = a;
         a = b;
         b = temp;

         System.out.println("a :" +a);
         System.out.print("b :" +b);

        }
    
        public static void main(String[] args) {
            int a = 15;
            int b = 20;

         // Value After Swapping 
         
        System.out.println("Value After Swapping :");
        swap(a,b);
        }
}
