package Loops;

public class ReversDigit {
    public static void main(String[] args) {
        int n=132482;
        int rev =0;
        while(n>0){
            int Lastdigit = n%10;
            rev = (rev *10)+Lastdigit;
            n = n/10;
        }
        System.out.print(rev);
    }
}
