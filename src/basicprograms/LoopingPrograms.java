package basicprograms;

public class LoopingPrograms {

	
	void upperStarPattern()
	{
		for (int i=3;i>=0;i--) {
			for (int j=i;j>=0;j--) {
			
				System.out.print("*");	
			}
			System.out.println();	

		}
	}
	void StarPatterns() {
		for (int i=0;i<=3;i++) {
			for (int j=0;j<=3;j++) {
			
				System.out.print("*");	
			}
			System.out.println("");	

		}
	}
	
	
	public static void main(String[] args) {
		
		LoopingPrograms obj = new LoopingPrograms();
		System.out.println("Upper Rectangle Star Patten");
		obj.upperStarPattern();
		System.out.println("Star Patten");
		obj.StarPatterns();
		/*
		 * for (int i=0;i<=3;i++) { for (int j=0;j<=3;j++) {
		 * 
		 * System.out.print(" * "); } System.out.println("");
		 * 
		 * }
		 */
		
	}
}
