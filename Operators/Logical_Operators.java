public class Logical_Operators {
    public static void main(String[] args) {

            // LOGICAL AND (&&) //
        System.err.println("LOGICAL AND &&  :");

        System.err.println( (3>2) && (3>1) );
        System.err.println( (3>2) && (3<1) );
        System.err.println( (3<2) && (3>1) );
        System.err.println( (3<2) && (3<1) );

            // LOGICAL OR (||)
        System.err.println("LOGICAL OR ||  :");

        System.err.println( (3>2) || (3>1) );
        System.err.println( (3>2) || (3<1) );
        System.err.println( (3<2) || (3>1) );
        System.err.println( (3<2) || (3<1) );    

           // LOGICAL NOT (!)
        System.err.println("LOGICAL NOT !  :");

        System.err.println(!(3>1) );
        System.err.println(!(3<1) );
        System.err.println(!(3>1) );
        System.err.println(!(3<1) );
    }
}
