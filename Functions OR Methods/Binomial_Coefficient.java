 public class Binomial_Coefficient {

    public static int factorial(int n){
        int f = 1;

        for(int i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static int binoCoeff(int n , int r) {
        int facto_n = factorial(n);
        int facto_r = factorial(r);
        int facto_nMr = factorial(n - r);

        int binoCoeff = (facto_n) - (facto_r * facto_nMr);
        return binoCoeff;
    }
    public static void main(String[] args) {
         System.out.println("Binomial Coefficient Of the Given Number  : ");
         System.out.println(binoCoeff(5,2));
    }   
}

