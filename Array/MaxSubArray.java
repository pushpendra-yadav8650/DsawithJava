package Array;

public class MaxSubArray {
    public static void MaxSub(int number[]) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                int currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += number[k];
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum of sub array = " + maxsum);
    }

    public static void MaxSubArrayOptz(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        // calculate the prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum of sub array = "+ maxsum);
    }

    public static void kadans(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i=0; i<number.length; i++){
            cs = cs+number[i];
            if(cs <0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our max subarray sum "+ ms);
    }

    public static void main(String[] args) {

        int number[] = { -2,-3,4,-1,-2,1,5,-3 };
        MaxSub(number);
        MaxSubArrayOptz(number);
        kadans(number);
    }

}
