public class Largest_String {
    public static void main(String[] args) {
        String fruits[] = {"Apple" , "Mango" , "Orange" , "Banana"};
        for(int i=1 ; i<fruits.length ; i++)
        {
            String largest = fruits[0];
            if(largest.compareTo(fruits[i]) < 0)
            {
                largest= fruits[i];
            }
            System.out.println(largest);
        }
    }
}
