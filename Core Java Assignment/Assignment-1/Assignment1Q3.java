class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	return (principalAmount * time * interestRate)/100 ;
    }
    
    
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double interest = principalAmount * (Math.pow((1 + interestRate/100), time)) - principalAmount;
        return interest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	SiCi obj = new SiCi();
    	System.out.println(obj.simpleInterest(100, 2, 5));
    	System.out.println(obj.compoundInterest(1000, 3, 10));
    }
}