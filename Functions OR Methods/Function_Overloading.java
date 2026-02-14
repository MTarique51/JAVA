public class Function_Overloading {
    
    public static int sum (int a, int b){
        return a +b;
    }

    public static int sum (int a, int b, int c){
        return a+ b +c;
    }

    public static void main(String[] args) {
        System.out.println("Sum :" +sum(5,3 ));
        System.out.println("Sum :" +sum(5,6,8 ));
    }

}
