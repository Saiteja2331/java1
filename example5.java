package day3;

public class example5 {

	public static void main(String[] args) {
		String data=" sai teja zoroa ";
		String words[]=data.split(" ");;
		int max =0;
		String maxStr ="";
		for (int i=0;i<words.length;i++) {
			if (words[i].contains(".")) {
				words[i]=words[i].substring(0,words[i].length()-1);
				System.out.println("words[i");
			}
			if(words[i].length()>max) {
				max=words[i].length();
				maxStr=words[i];
			}
			System.out.println("max chr--->"+max);
			System.out.println("max words---->"+maxStr);
		}
	}

}
