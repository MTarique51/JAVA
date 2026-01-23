public class ArithmaticOperator {
        public static void main(String[] args) {
            int A = 10;
            int B = 5;
            System.out.println("Add = " + (A+B));   // Binary ArithmaticOperator//

            // Unary (Arithmatic Operator)//
            int C = 100;                            
            int D = ++C;
            System.out.println(C);                  // pre Increment // 
            System.out.println(D);

            int E = 100;
            int F = E++;
            System.out.println(E);                   // Post Incement //
            System.out.println(F);
        }
    
}