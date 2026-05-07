package Functions;

public class SwapNumber {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b=temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static int multiple(int a , int b){
        return a*b;
    }
    public static int factorial(int n){
        int fact =1;
        for(int i=1; i<=n; i++){
            fact = fact *i;
        }
        return fact;
    }
    public static void main(String[] args) {

        int a =10;
        int b =29;
        swap(a,b);
        int mul = multiple(a, b);
        System.out.println(mul);
        int facts = factorial(4);
        System.out.println(facts);
       
    }
}
