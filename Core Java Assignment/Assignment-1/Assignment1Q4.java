import java.util.Scanner;
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
	String s="Passed , Promoted";
	String s1="Failed";
	String s2="Promoted";
	if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60)
		return s;
	else if(subject1Marks>60 && subject2Marks>60 ||  subject2Marks>60 && subject3Marks>60 || subject3Marks>60 && subject1Marks>60)
		return s2;
	else
		return s1;
	}
}
public class Assignment1Q4 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double num1=sc.nextDouble();
	double num2=sc.nextDouble();
	double num3=sc.nextDouble();
	ResultDeclaration obj=new ResultDeclaration();
	System.out.println(obj.declareResults(num1,num2,num3));
	}
}

