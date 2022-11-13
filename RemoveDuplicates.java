package week3.day1;

//import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = text.split(" ");
		
		for(int i=0; i<split.length; i++) {
			for(int j=i+1; j<split.length; j++) {
				if(split[i].equals(split[j])) {
					count=1;
					if(count>0) {
						split[j]="";
					}
				}
					
				}
			
		}
		for(int k=0; k<split.length; k++) {
			System.out.println(split[k]);
		}
	}

}

