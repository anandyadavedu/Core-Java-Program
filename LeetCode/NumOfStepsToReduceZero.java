package LeetCode;

public class NumOfStepsToReduceZero {
    int count = 0;

    public int numberOfSteps(int num) {

        if (num == 0) {
            return 0;
        }

        if (num % 2 == 0) {
            count++;
            num = num / 2;

        } else {
            count++;
            num = num - 1;
        }

        numberOfSteps(num);

        return count;

    }

    public static void main(String args[]) {
        int number = 14;
        NumOfStepsToReduceZero obj = new NumOfStepsToReduceZero();
        System.out.println(obj.numberOfSteps(number));
    }
}
