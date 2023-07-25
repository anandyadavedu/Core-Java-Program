package HashMap;
import java.util.*;

public class AllMethodOfHashMap {
     

    public static void main(String[] args) {
        // Creation of hashmap 

        HashMap<String,Integer> map=new HashMap<>();
         

        // Insertion of element in hashmap
        // use put() method for insertion 


        System.out.println("Insertion element in hashmap");
        map.put("India", 130);
        map.put("China", 125);
        map.put("USA", 50);
        map.put("Pak", 20);
       
        System.out.println(map); // print all with key value pair

        map.put("Pak", 15); // update the value of Pak here only
        System.out.println(map);
        System.out.println();

        // Searching Operation in hashmap
        // Searching Operation in hashmap
        // Searching Operation in hashmap

        // For Searching  element use two method 
        // containsKey() search key element 
        // and get() method return the corresponding value 

        System.out.println("Searching of Element ");

        if(map.containsKey("China")){
            System.out.println("Key is Present in Map ");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));
        System.out.println();


        // Iterration in Hashmap are many ways 
        // main effective ways are---

        // first way
        System.out.println("Iteration in HashMap");

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println();

        // Second ways

        Set<String> keys= map.keySet();

        for(String key:keys){
            System.out.println(key+" "+ map.get(key));
        }

    }
}
