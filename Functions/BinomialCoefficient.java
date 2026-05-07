package Functions;

public class BinomialCoefficient {
    public static int fatcorial(int n){
        int fact =1;
        for(int i=1; i<=n; i++){
            fact *=i;
        }
        return fact;
    }
    public static int binCofficent(int n, int r){
        int n_fact = fatcorial(n);
        int r_fact = fatcorial(r);
        int nmr = fatcorial(n-r);

        int BinCof = n_fact/(r_fact *nmr);

        return BinCof;

    }
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static int sum(int a,int b, int c){
    //     return a+b+c;
    // }
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static boolean prime(int n){
        boolean isprime = true;
        if(n==2){
            return true;
        }
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static boolean isPrime(int n){
        if(n==2) return true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //Check the prime number in range
    public static void primeRange(int n){
        for(int i=2; i<=n-1;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        // System.out.println(binCofficent(5, 4));
        // System.out.println(sum(2, 4));
        // System.out.println(sum(2.6f, 4.4f));
        System.out.println(prime(3));
        System.out.println(isPrime(53));
        primeRange(10);
    }
}
