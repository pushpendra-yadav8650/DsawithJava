import java.util.*;
public class MultiDArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        mainList.add(list);

        ArrayList<Integer>List2 = new ArrayList<>();
        List2.add(2);
        List2.add(4);
        List2.add(6);
        List2.add(8);
        List2.add(10);
        mainList.add(List2);

        ArrayList<Integer> List3 = new ArrayList<>();
        List3.add(3);
        List3.add(6);
        List3.add(9);
        List3.add(12);
        List3.add(15);
       mainList.add(List3);

       for(int i=0; i<mainList.size(); i++){
        ArrayList<Integer> currList = mainList.get(i);
        for(int j=0; j<currList.size(); j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
       }
System.out.println(mainList);
    }   
}
