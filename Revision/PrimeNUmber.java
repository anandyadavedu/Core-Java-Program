package Revision;

public class PrimeNUmber {
    //  int count=0;
    public static void prime(int n) {
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime Number");
        }
        
    }
    public static void main(String[] args) {
        prime(12);
    }
}
