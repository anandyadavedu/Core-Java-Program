package LeetCode;

public class AverageSalary {
    public static double average(int[] salary) {
        // int lower = 0;
        double result = 0;

        for (int i = 0; i < salary.length; i++) {
            int temp;
            for (int j = i + 1; j < salary.length; j++) {
                if (salary[i] > salary[j]) {
                    temp = salary[i];
                    salary[i] = salary[j];
                    salary[j] = temp;

                }
            }
        }

        for (int i = 1; i < salary.length - 1; i++) {
            // System.out.println(salary[i]);
            result = result + salary[i];
        }

        return result / (salary.length - 2);

    }

    public static void main(String[] args) {
        int salary[] = { 4000, 3000, 2000, 1000 };

        double averagevalue = average(salary);
        System.out.println(averagevalue);
    }
}
