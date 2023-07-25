package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");

            } else if (i % 3 == 0) {
                list.add("Fizz");

            } else {
                list.add(String.valueOf(i));

            }

        }
        return list;

    }

    public static void main(String[] args) {
        int n = 3;
        FizzBuzz obj = new FizzBuzz();
        System.out.print(obj.fizzBuzz(n));
    }

}
