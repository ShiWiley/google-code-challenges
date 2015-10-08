package Challenge1;
public class RustyCalc {
	String inputString = "";
	String outputString = "";
	
	public RustyCalc(String inputString){
		this.inputString = inputString;
	}
	public String splitMult(){
		String output = "";
		String numAdd = "";
		String numMul = "";

		for(int i=0; i<inputString.length(); i++){
			if(inputString.charAt(i) == '*'){
				numMul+="*";
			}
			else if(inputString.charAt(i) == '+'){
				output += numMul;
				numMul = "";
				numAdd+="+";
			}
			else{
				output += inputString.substring(i, i+1);
			}
		}
		output += numMul;
		output += numAdd;
		return output;
	}
	public static void main(String args[]){
		RustyCalc rc = new RustyCalc("2*4*3+9*3+5");
		System.out.println(rc.splitMult());
		
		
	}
}
