package Practices;

public class FebRec {
    // static int c;
    public static void febbo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        febbo(b,c,n-1);
        
    }
    public static void main(String[] args) {
        febbo(-1,1,8);
        
    }
}
