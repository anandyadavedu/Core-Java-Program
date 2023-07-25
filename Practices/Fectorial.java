package Practices;

public class Fectorial {
    static int fact=1;;
    public static int fact(int n){
        if(n==1){
            return fact;
        }
        fact=fact*n;
        fact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int result=fact(5);
        System.out.print(result);
    }
}
