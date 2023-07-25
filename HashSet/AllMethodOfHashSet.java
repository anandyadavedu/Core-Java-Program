package HashSet;
import java.util.*;


public class AllMethodOfHashSet {
    

    public static void main(String[] args) {
       // Creation Of HashSet 

       HashSet<Integer> set =new HashSet<>();
       


        // Insertion in HashSet
        // Insertion in HashSet
        // Insertion in HashSet
        // Insertion in HashSet


        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);//[1,2,3]
        System.out.println();


        //Searching Element in HashSet
        //Searching Element in HashSet
        //Searching Element in HashSet

        if(set.contains(1)){// return true if condition satisfy
            System.out.println("key 1 is in the set");
        }else{
            System.out.println("1 does not exist in set");
        }
        System.out.println();


        // Delete Element in HashSet
        // Delete Element in HashSet
        // Delete Element in HashSet
        

        set.remove(1);
        System.out.println(set);

        set.remove(4);

        System.out.println();


        // Iterator in HashSet 
        // Iterator in HashSet 
        // Iterator in HashSet 

        Iterator it= set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        

    }
}
