package StringPrograms;

public class MostRepeatingCharacter {

	public static void main(String[] args) {
		String str = "Raaveee";
		int i;
		for(i=0; i<str.length(); i++) {
		char ch[]= str.toCharArray();
		
		int count=1; 
		int max=0;
		char maxchar = 0;
		
		for( i=0; i<str.length(); i++) {
			if(ch[i]==ch[i-1]) {
				count++;
			}
			else {
				if(count>max) {
					 max=count;
			            maxchar=ch[i-1];
				}
				count=1;
			}
		}
		if(count>max) {
			 max=count;
	            maxchar=ch[ch.length+1];
		}
		System.out.println(max+" "+maxchar);
		
	}

	}
}
