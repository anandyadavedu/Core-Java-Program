package BasicProgram;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //Taking input from user
            System.out.println("Enter the any Number:");
            int num=sc.nextInt();
            int c=0,sum=0;
            int temp=num;
            int temp1=num;
            //loop for digit counting
            while(temp1>0){
                c++;
                temp1=temp1/10;
            }
            //second loop
            
            while(temp>0){ 
                int rem=temp%10;
                sum=(int)(sum+(Math.pow(rem,c)));
                temp=temp/10;
            }
                //checking condition
            if(num==sum){

                System.out.println("Enter Number is ARMSTRONG NUMBER:");

            }
            else{
                System.out.println("Enter number is NOT ARMSTRONG NUMBER:");
            }
        }
    }
    
}
