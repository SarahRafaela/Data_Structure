package vogalEConsoante;

public class vogalConsoante {

	static void vogalOrConsoante(String s) {
		String[] consonant = { "b", "c", "d", "f", "g", "h", "j ", "k ", "l", "m", "n", "p", "q", "r", "s", "t", "v",
				"w", "x", "y", "z" };
		String[] vowel = { "a", "e", "i", "o", "u" };
		if ((s == null) || (s.length() <= 1)) {
			
		    System.out.println(s); 
		} else {
			System.out.print(s.charAt(s.length() - 1));
			vogalOrConsoante(s.substring(0, s.length() - 1));
		}
	}

	public static void main(String[] args) {
		String s = "Sarah";

		vogalConsoante obj = new vogalConsoante();
		obj.vogalOrConsoante(s);
	}
}
