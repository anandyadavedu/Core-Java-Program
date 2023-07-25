package LeetCode;

public class PowerOfNumber {
    public static double pow(double x,int n){
        // double res=1;
        if(x<-10000 || x>10000){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n<0){
            n=-n;
            x=1/x;
        }
        if(n/2==0){
           
            return x* pow(x*x,n/2);
        }
        else{
            
            return x*pow(x, n-1);
        }

    }


    public static double myPow(double x,int n){
        double res=1;
        if(n<0){
            n=-n;
            x=1/x;

        }
        while(n!=0){
            if((n & 1)!=0){
                res*=x;
            }
            x*=x;
            n=n/2;
        }
        return res;
    }
   
    public static void main(String[] args) {
        System.out.println(pow(2.0000, -1 ));
        System.out.println(myPow(2.0000, 10));
    }
}
