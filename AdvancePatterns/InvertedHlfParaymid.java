package AdvancePatterns;

public class InvertedHlfParaymid {
    
    public static void InvHlfPayramid(int Total_rows){
        for(int i=1; i<=Total_rows;i++){
            for(int j=1; j<=Total_rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //2nd type of Pyramid with number 
    public static void InvHlfNumPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println( );
        }
    }
    public static void FloydsTriangle(int n){

        int count =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void Zero_to_One(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void ButterFly(int n){
        //1st half pattern 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half print the pattern 
        for(int i=n; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<= 2 *(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void SolidRhombus(int n){
        for(int i=1; i<=n; i++){
            //print the space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Print the start
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            //Print the next line 
            System.out.println();
        }
    }

    public static void DimondPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2 *(i-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd hald print the pattern
          for(int i=n; i>=0;i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2 *(i-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // InvHlfPayramid(4);
        // InvHlfNumPyramid(4);
        // FloydsTriangle(5);
        // Zero_to_One(4);
        // ButterFly(7);
        // SolidRhombus(5);
        DimondPattern(7);

    }
}
