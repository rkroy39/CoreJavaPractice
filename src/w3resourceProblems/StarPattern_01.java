package w3resourceProblems;

public class StarPattern_01 {
	void pattern1() {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
			
	}
	
	
	void pattern2() {
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
			
	}
	
	
	void pattern3() {
		for(int i=0;i<=7;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print("1");
			}
			System.out.println("");
		}
			
	}
	
	void pattern4() {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print(i+1);
			}
			System.out.println("");
		}
			
	}
	public static void main(String[] args) {
	
		StarPattern_01 ab=new StarPattern_01();
		System.out.println("Pattern 1");
		ab.pattern1();
		System.out.println("Pattern 2");
		ab.pattern2();
		System.out.println("Pattern 3");
		ab.pattern3();
		System.out.println("Pattern 4");
		ab.pattern4();

}
}
