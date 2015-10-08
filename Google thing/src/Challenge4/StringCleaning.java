package Challenge4;

public class StringCleaning {
	String chunk, word;
	public StringCleaning(String chunck, String word){
		this.chunk = chunck;
		this.word = word;
	}
	public String clean(){
		String reverseChunk = new StringBuilder(chunk).reverse().toString();
		String reverseWord = new StringBuilder(word).reverse().toString();
		StringBuilder sb = new StringBuilder();
		boolean b = true;
		while(b){
			String[] newString = reverseChunk.split(reverseWord);
			for(String s:newString){
				sb.append(s);
			}
			if(reverseChunk.compareTo(sb.toString()) == 0){
				b = false;
			}
			reverseChunk = sb.toString();
			sb.delete(0, sb.length());
		}
		reverseChunk = new StringBuilder(reverseChunk).reverse().toString();
		return reverseChunk;
	}
	public static void main(String args[]){
		StringCleaning sc = new StringCleaning("abcabcabc","ab");
		System.out.println(sc.clean());
	}

}
	