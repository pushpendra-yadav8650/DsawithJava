package Array;

public class LinearSearch {

    public static int LinerSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(key ==  number[i]){
                return i;
            }
        }
        return -1;
    }
    //Linear Search apply for Strings 
    public static int LinearSearchin(String fruits[] , String keys){
        for(int i=0; i<fruits.length; i++){
            if(fruits[i].equals(keys)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int number[] ={2,4,6,8,10,12,14,16};
        String fruits[] ={"apple","Banana","Grapesh","Papaya"};
        String  keys = "Banana";
        
        // int key =10;
        // int index = LinerSearch(number , key);
        // if(index == -1){
        //     System.out.println("Not found");
        // }else{
        //     System.out.println("index is "+ index);
        // }

        int indexs = LinearSearchin(fruits, keys);
        if(indexs == -1){
                System.out.println("Not Found ");
        }else{
            System.out.println("index of Fruits = "+ indexs);
        }
    }
}
