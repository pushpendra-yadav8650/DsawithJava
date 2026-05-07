import java.util.*;
public class Calcularorbyswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char Operator = sc.next().charAt(0);
        switch(Operator){
            case '+':System.out.println("Sum of number is :"+ (a+b));
                break;
            case '-':System.out.println("Sub of number is :"+ (a-b));
                break;
            case '*':System.out.println("Multiple of number is :"+(a*b));
                break;
            default:System.out.println("Invalie Operator");
        }
    }
}
