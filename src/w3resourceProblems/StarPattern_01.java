package w3resourceProblems;

public class StarPattern_01 {
	void pattern1() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	void pattern2() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}

	}

	void pattern3() {
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print("1");
			}
			System.out.println("");
		}

	}

	void pattern4() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print(i + 1);
			}
			System.out.println("");
		}

	}

	void pattern5() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 6; j++) {

				if (i % 2 == 0)
					System.out.print("*");
				else
					System.out.print("#");

			}
			System.out.println("");
		}

	}

	void pattern6() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (j <= i) {
					System.out.print("*");

				} else {
					System.out.print("#");
				}

			}
			System.out.println("");
		}
	}
	void pattern6_1() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print("*");

				} else {
					System.out.print("#");
				}

			}
			System.out.println("");
		}
	}
	
	void pattern7() {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=8;j++) {
				
				if(j==1 || j==8) {
					System.out.print("*");
				}
				else {
					System.out.print("#");
				}
				
			}
			System.out.println("");
		}
	}
	
	void pattern8() {
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=7;j++) {
				
				if(j<=i) {
					System.out.print("*");
				}

			}
			System.out.println("");
		}
		
	}
void pattern9() {
	  int m=2;
	  for(int i=1;i<=6;i++) {
		  for(int j=1;j<=5;j++) {
			  
			  
			  System.out.print(m*j);
			  
		  }
		  System.out.println("");
		  m++;
	  }
}

void pattern10() {
	  int m=8;
	  for(int i=1;i<5;i++) {
		  for(int j=1;j<12;j++) {
			  if(j<=m) {
			  System.out.print("#");
			  
			  }
			  else {
				  int n=1;
				  for(; n<=i;) {
				  System.out.print("*");
				 
				  break;
				  }
			  }
			  
		  }
		  System.out.println("");
			 m--;
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
		  System.out.println("Pattern 5");
		  ab.pattern5();
		  System.out.println("Pattern 6");
		  ab.pattern6();
		  System.out.println("Pattern 6_1");
		  ab.pattern6_1();
		  System.out.println("Pattern 7");
		  ab.pattern7();		
		  System.out.println("Pattern 8");
		  ab.pattern8();
		  System.out.println("Pattern 9");
		  ab.pattern9();
		  System.out.println("Pattern 10");
		  ab.pattern10();
	 
		 
	}
}
