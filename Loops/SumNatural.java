package Loops;
import java.util.*;
public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum =0;
        int i=0;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
