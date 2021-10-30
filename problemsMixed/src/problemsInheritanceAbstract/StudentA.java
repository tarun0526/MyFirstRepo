package problemsInheritanceAbstract;

public class StudentA extends Marks {
	double sub1, sub2, sub3;
	
	public StudentA(int s1, int s2, int s3){
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}
	
	@Override
	double getpercentage() {
		double output = (((sub1 + sub2 + sub3)/300)*100);
		return output;
	}
	public static void main(String[] args) {
		StudentA stu1 = new StudentA(96, 86, 97);
		double result = stu1.getpercentage();
		System.out.println(result);

	}

}
