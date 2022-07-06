package Day3;

public class Q2 {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long pow = n;
        if(n==0)
            return 1.0;

        if(n==1)
            return x;

        if(pow<0)
            pow = -1*pow;

        while(pow>0){
            if(pow%2==1){
                ans = ans*x;
                pow--;
            }else{
                x=x*x;
                pow/=2;
            }
        }
        if(n<0)
            ans = (double)(1.0)/(double)(ans);
        return ans;
    }
}
