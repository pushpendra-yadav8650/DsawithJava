import java.util.*;
public class CalculateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the seconde number");
        int b = sc.nextInt();
        int sum = a+b;
        int mul = a*b;
        int div = a/b;
        int sub = a-b;
        System.out.println("sum of two number is  ="+sum);
        System.out.println("sum of two number is  ="+sub);
        System.out.println("sum of two number is  ="+mul);
        System.out.println("sum of two number is  ="+div);
     

    }
}
