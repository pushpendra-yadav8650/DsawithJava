package AdvancePatterns;

public class HollowPattern {
    public static void Hollow_pattern(int total_rows, int total_cols){
        for(int i=1; i<=total_rows;i++){
            for(int j=1; j<=total_cols;j++){
                if(i==1 || i== total_rows || j==1 || j== total_cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_pattern(10,4);
    }
}
