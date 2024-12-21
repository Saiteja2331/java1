package day3;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data");
		String data= sc.nextLine();
		data=data.toUpperCase();
		int count[]= {
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
		};
		char ch=' ';
		String re=" "; 
		int index;
		for(int i=0;i<data.length();i++) {
			
				index=(int)(ch -65);
				count[index]++;{
					re=re+ch;
				}
				
		}
		for(int i=0;i<26;i++) {
			if(count[i]>0);
			System.out.println("result---->"+re);
		}
		
	}

}
