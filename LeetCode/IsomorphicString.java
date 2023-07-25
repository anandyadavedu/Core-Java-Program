package LeetCode;
import java.util.*;

public class IsomorphicString {
    public static boolean isomorphic(String s,String t){
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) != map.get(s.charAt(i)))
                    return false;
            } else {
                if (map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;

        
    }
    public static void main(String[] args) {
        boolean res=isomorphic("foo", "adv");
        System.out.println(res);
    }
}
