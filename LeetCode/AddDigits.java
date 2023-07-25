package LeetCode;

public class AddDigits {
     public static int adddigit(int n){
        int count=0,rem=0,sum=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum=sum+rem;
            count++;
        }
        while(sum>=10){
           n=sum;
           sum=0;
           rem=n%10;
           sum=sum+rem;
           n=n/10;
        }
       return (count);
    }

    public static void main(String[] args) {
        System.out.println(adddigit(38));
    }
}
