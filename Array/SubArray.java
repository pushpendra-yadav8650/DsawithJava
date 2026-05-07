package Array;

public class SubArray {
    public static void subArrays(int number[]){
        int SA=0;
        for(int i=0; i<number.length; i++){
            int start =i; //Staring of sub array
            for(int j=i; j<number.length;j++){
                int end =j;
                int sum =0;
                for(int k=start; k<=end;k++){
                    sum = sum + number[k];
                    System.out.print(number[k]+" ");
                   
                    
                }
                SA++;
                System.out.println(" -> "+sum);
                System.out.println();
            }
            System.out.println();
        }
     System.out.println(SA);  
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        subArrays(number);
    }
}
