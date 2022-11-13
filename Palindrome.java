package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		
		String name = "madam";
		String temp = "";
		char[] cArray = name.toCharArray();
		int len = cArray.length;
		
		for(int i=len-1; i>=0; i--) {
			temp+=cArray[i];
		}
		if(name.contains(temp)) {
			System.out.println(name+" : is Palindrom");
		}
		else {
			System.out.println(name+" : is Not Palindrome");
		}
	}

}
