package Functions;

public class BinaryConversion {

public static void BinToNum(int binNum){
    int MyNum = binNum;
    int pow =0;
    int decNum =0;
    while(binNum >0){
        int lastdigit = binNum%10;
        decNum = decNum + (int)(lastdigit * Math.pow(2, pow));
        pow++;
        binNum  = binNum/10;
       
    }
    System.out.println("Decimal of "+ MyNum +" ="+decNum);
}
public static void NumToBin(int n){
    int myNum = n;
    int pow =0;
    int binNum =0;
    while(n >0){
        int rem = n%2;
        binNum = binNum + (int)(rem * Math.pow(10,pow));
        pow++;
        n  = n/2;


    }
    System.out.println("Binary from of "+ myNum+"="+binNum);
}
    public static void main(String[] args) {
        // BinToNum(10010001);
        NumToBin(2);
    }
}
