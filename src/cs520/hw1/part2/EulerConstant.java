package cs520.hw1.part2;

public class EulerConstant {
	
	public static void main(String[] arg) {
		
		System.out.println("Computing with n = 2");
		double result1 = compute(2);
		System.out.printf("e = %.9f\n", result1);
		System.out.println();
		
		System.out.println("Computing with n = 5");
		double result2 = compute(5);
		System.out.printf("e = %.9f\n", result2);
		System.out.println();
		
		System.out.println("Computing with n = 12");
		double result3 = compute(12);
		System.out.printf("e = %.9f\n", result3);
		System.out.println();
		
		System.out.printf("Difference between result2 and result1 = %.9f\n", (result2 -result1));
		System.out.printf("Difference between result3 and result2 = %.9f\n", (result3 -result2));

	}
	//static method compute
	public static double compute(int n) {
		double e = 1.0;
		int tem = 1;
		for(int i=1; i <=n; i++) {
			tem = tem*i; // 1*1=1; 1*2=2; 2*3=6 (1!=1; 2!=2*1=2; 3!=3*2*1=6)
			e = e + (double)1/tem; //convert the integer to the double
			
			System.out.printf("%s%s%s%-40s%s%.9f\n","Factorial of ", i," is ", tem, "e = ", e);

		}
		return e;
	
}
	
}