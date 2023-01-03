package STRING;

public class reverseCharacterFromWordsOfAsentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s=" khatm ta ta bye bye";       // mtahk at at eyb eyb
		String[] sp = s.split(" ");
		String ss="";

		for (int i = 0; i < sp.length; i++) {

			String word = sp[i];
			String rev="";
			for (int j = 0; j < word.length(); j++) {

				rev=word.charAt(j)+rev;
			}
			System.out.print(rev+" ");
		}

	}

}
