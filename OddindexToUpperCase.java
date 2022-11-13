package week3.day1;

public class OddindexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] charArray = test.toCharArray();
		int len = charArray.length;
		
		for(int i=0; i<len; i+=2) {
			charArray[i] = Character.toUpperCase(charArray[i]);
			
		}
		System.out.print(charArray);

	}

}
