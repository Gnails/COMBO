
public class quickpow {
    public double Power(double base, int exponent) {
    	int exp=Math.abs(exponent);
    	double tmp=base,cur=1;
    	while (exp!=0) {
    		if(	(exp>>=1)%2==1)
		      cur=tmp*base;
    		tmp*=base;			
		}
    	return cur;
        
  }

}
