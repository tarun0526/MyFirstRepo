package problemsInheritanceAbstract;

public class StudentB extends Marks {
	double sub1, sub2, sub3, sub4;
	
	public StudentB (int s1, int s2, int s3, int s4){
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
	}
	
	@Override
	double getpercentage() {
		double output = ((sub1 + sub2 + sub3 + sub4)/400)*100;
		return output;
	}

	public static void main(String[] args) {
		StudentB stu2 = new StudentB(79, 87, 90, 99);
		double result = stu2.getpercentage();
		System.out.println(result);

	}
}
