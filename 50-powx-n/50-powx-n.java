// using logaritmic function 

class Solution {
    public double myPow(double x, long n) {
        if( n==0){
            return 1;
        }
        if(n < 0) {
        n = n * (-1);
        x=1/x;
        
        
        }
        
        double xn2=myPow(x,n/2);
        double xn=xn2*xn2;
        if(n%2==1) {
            xn=xn*x;
        }
        return xn;
        
    }
}