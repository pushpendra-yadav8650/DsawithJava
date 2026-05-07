import java.util.*;

public class Two2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        MainList.add(list);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(3); list2.add(5);
        MainList.add(list2);

        // How to print the ArrauList
        for(int i=0; i<MainList.size(); i++){
            ArrayList<Integer> currList = MainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(MainList);
    }
}
