package StringPrograms;

public class ReplaceMoreSpaceToSingleSpace {

	public static void main(String[] args) {
		String input = "Heloo   Worl  Welcome";
		System.out.println(input);
		input = input.replaceAll("( )+", " ");
		System.out.println(input);

	}

}
