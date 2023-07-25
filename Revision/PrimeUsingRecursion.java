package Revision;

public class PrimeUsingRecursion {
     static int count=0;
    public static boolean primerecursion(int n , int i){
        if(i>n/2){
            return false;
        }
        if(n%i==0 && i<=n/2){
            return true;
        } 
        primerecursion(n, i+1);
        return false;
    }
    public static void main(String[] args) {
       boolean result= primerecursion(13,2);
       if(result){
        System.out.println("Not Prime");
       }
       else{
        System.out.println("Prime");
       }
    }
}
