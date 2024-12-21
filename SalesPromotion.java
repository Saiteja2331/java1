package day3;

public class SalesPromotion {

	public static void main(String[] args) {
		int []heights= {23,45,68,65,79};
		int max=heights[0];
		int count =1;
		int dollar =17;
		for(int i=1;i<heights.length;i++) {
			if(heights[i]>max) {
				max=heights[i];
				count++;
			}
			
		}
		System.out.println("max no--->"+count*dollar);

	}

}
