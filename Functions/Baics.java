package Functions;
import java.util.*;
public class Baics {
    public static void Helloprint(){
        System.err.println("Hello world");
        System.err.println("Hello world");
        System.err.println("Hello world");
    }
    public static int Calculator(int num1, int  num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int sum = Calculator(a, b);
        System.out.println("Sum of teo number:"+sum);
        // Helloprint();//this is a function call
    }
}
