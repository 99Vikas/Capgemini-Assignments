class ArmstrongOrNot {

	public void armstrongCheck(int num,int num1) {
		for(int i=num;i<=num1;i++)
		{
			int sum = 0, rem = 0;
			int temp1 = i;
			while(temp1 != 0) 
			{
				rem = temp1 % 10;
				sum = sum + ( rem * rem * rem);
				temp1 = temp1 / 10;
			}
			if(sum == i)
				System.out.println(i);
		}
	}
}
public class Assignment1Q2 {

	public static void main(String[] args) {
		ArmstrongOrNot obj = new ArmstrongOrNot();
		obj.armstrongCheck(100,999);
	}

}