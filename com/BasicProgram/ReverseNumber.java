package com.BasicProgram;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (//taking input from user 
        Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the any number:");
            int num=sc.nextInt();

            int rev=0;
            
            while(num>0){
                int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }

            System.out.println("The reverse number is :"+rev);
        }
    }
    
}
