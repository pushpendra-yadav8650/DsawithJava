package Array;

public class PairsArray {
    public static void Pairs(int number[]){
        int TP =0;
        for(int i=0 ; i<number.length; i++){
            int curr = number[i];
            for(int j=i+1; j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
                TP++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of pairs = "+ TP);
    }
    public static void main(String[] args) {
        int number[] ={2,4,6,8,10};
        Pairs(number);

    }
}
