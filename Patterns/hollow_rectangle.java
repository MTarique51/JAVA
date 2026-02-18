public class hollow_rectangle {
    public static void Hollow_Rect(int totRows , int totCols) {

        for(int i=1; i<=totRows; i++){            // Outer Loop
            for(int j=1; j<=totCols; j++){        // INNER LOOP

                if (i==1 || i==totRows || j==1 || j==totCols) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();          // For Next Line After every row compelition
        }
    }
    public static void main(String[] args) {
        Hollow_Rect(10,10 );
    }
}
