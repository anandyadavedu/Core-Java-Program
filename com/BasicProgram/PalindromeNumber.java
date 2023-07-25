package com.BasicProgram;
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter the Number :");
            int num=sc.nextInt();

            int temp=num;
            int rev=0,rem;

            while(num>0){
                rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            
            if(rev==temp){
                System.out.println("Enter Number are PALINDROME:");
            }
            else{
                System.out.println("Enter Number are NOT PALINDROME:");
            }
        }
    }
    
}
