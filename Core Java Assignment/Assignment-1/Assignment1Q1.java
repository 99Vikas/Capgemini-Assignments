class ArmstrongOrNot {

	public boolean armstrongCheck(int num) {
		int sum = 0, rem = 0;
		int temp = num;
		while(temp != 0) {
			rem = temp % 10;
			sum = sum + ( rem * rem * rem);
			temp = temp / 10;
		}
		if(sum == num)
			return true;
		return false;
	}
}
public class Assignment1Q1 {

	public static void main(String[] args) {
		ArmstrongOrNot obj = new ArmstrongOrNot();
		System.out.println(obj.armstrongCheck(371));
	}

}