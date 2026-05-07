import java.util.*;
public class InputOutput {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();  // This is a integer number
            float price = sc.nextFloat(); // this is a float nmber 
            System.out.println(price);
            System.out.println(num);
        }

    }
}
