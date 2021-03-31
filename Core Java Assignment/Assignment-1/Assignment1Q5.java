import java.util.*;
class TaxAmount{
    public double calculateTaxAmount(int ctc){
	double x=0.0;
    	if(ctc>=0 && ctc<=180000)
    		x=0.0;
    	if(ctc>=181001 && ctc<=300000)
    		 x=0.1*ctc;
    	if(ctc>=300001 && ctc<=500000)
    		x=0.2*ctc;
    	if(ctc>=500001 && ctc<=1000000)
		x=0.3*ctc;
	return x;
   	}
}
public class Assignment1Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ctc1=sc.nextInt();
		TaxAmount obj = new TaxAmount();
		System.out.println(obj.calculateTaxAmount(ctc1));
	}
}
