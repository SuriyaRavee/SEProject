package StringPrograms;

public class ReplaceVowels {

	public static void main(String[] args) {
		String str ="Suriya";
		str= str.toLowerCase();
		
		System.out.println("The given string is "+str);
		
		String newstr = str.replaceAll("a", "1").replaceAll("e", "2").replaceAll("i", "3");
		System.out.println(newstr);
		
		String value = "100";
		int value1 = Integer.parseInt(value);
		System.out.println(value1);
	}
	}

