import java.util.ArrayList;

public class ArrayListBasic{
    public static void main(String[] args) {
        ArrayList<Integer>list  = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(5);

        // System.out.println(list);
        // //Get operation
        // int element  = list.get(2);
        // System.out.println(element);

        //Delete element
        // list.remove(2);
        // System.out.println(list);

        // list.set(2,10);
        // System.out.println(list);
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    //     System.out.println(list.size());

    //     //print the ArrayList
    //     for(int i=0; i<list.size(); i++){
    //         System.out.print(list.get(i)+"  ");
    //     }

    //How to print the reverse element 
    // for(int i=list.size()-1; i>=0; i--){
    //     System.out.print(list.get(i)+" ");
    // }
        //How to find max vlaue
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max,list.get(i));
        }
        System.out.println("Max element of = "+ max);
    }
}