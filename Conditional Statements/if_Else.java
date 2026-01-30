public class if_Else {
    public static void main(String[] args) {
        int age = 16;

        if(age>18) {
            System.err.println("Adult ");
        }

         if( (age>13) && (age<18) ) {
            System.err.println("Teenager ");
        } else {
            System.err.println("Not Adult ");
        }
    }
}