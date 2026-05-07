package Functions.Pratice;


public class Average {
    //Write the java method to compute average of three numbers.
    public static void Averages(int a,int b,int c){
        int average = (a+b+c)/3;
        System.out.println("Average of three numbers"+average);
    }
    public static void isEven(int n){
        if(n>0){
        if(n%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Check your method");
        }
    }else{
        System.out.println("Invalid number");
    }

    }
    //Palindrome number
    public static void Palindomes(int n){
        if(n>10){
            int lastdigit = n%10;
            int nums = lastdigit*10;
            n =n/10;
            if(n == nums){
                System.out.println("palindrome");
            }else{
                System.out.println("Not Palindrome");
            }
        }
    }
    public static void main(String[] args) {
        // Averages(2,4,6);
        // isEven(3);
        Palindomes(493);
    }
}
