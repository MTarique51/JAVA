public class prime_OR_Not {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n == 2){
            return true;
        }

        for(int i =2; i<=n-1; i++){
            if(n%i == 0){
                 isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println("Prime : " +isPrime(2));
    }
}
