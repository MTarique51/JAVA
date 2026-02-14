 public class F_Over_UsingDataType {
    
    public static int sum (int a, int b){
        return a +b;
    }

    public static float sum (float a, float b){
        return a+ b;
    }

    public static void main(String[] args) {
        System.out.println("Sum :" +sum(5,3 ));
        System.out.println("Sum :" +sum(3.2f ,4.8f));
    }

}
