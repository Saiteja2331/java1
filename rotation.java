package day3;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		
				
						int[]  num = {10,20,30,40,50};
						
						System.out.println("Before rotation");
						for(int i=0;i<num.length;i++) {
							System.out.print(num[i]+" ");
						}
						System.out.println();
						System.out.println("how many times want to rotate");
						Scanner sc = new Scanner(System.in);
						int no = sc.nextInt();
						while(no !=0) {
							int first = num[0];
							for(int i=0;i<num.length-1;i++) {
								num[i]= num[i+1];// 4--3
							}
							num[num.length-1]= first;
							no--;
						}
						System.out.println("after 1 rotation");
						for(int i=0;i<num.length;i++) {
							System.out.print(num[i]+" ");
						}
				}

		
	}


