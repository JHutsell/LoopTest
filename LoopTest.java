
public class LoopTest {

	public static void main(String[] args) {
		
		
	}
	public int[] doubleArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			return nums * 2;	
		}
	}
	public String[] punctuateSentences(String[] sentences) {
		String period = ".";
		for (int i = 0; i < sentences.length; i++) {
			sentences = sentences[i] + period;
			return sentences; 
		}
	}
	public int sumArray(int[] nums) {
		int sum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			return sum;		
		}
	}
	public String joinChars(char[] letters) {
		String word = "";
		for ( int i = 0; i < letters.length; i++) {
			word = word + letters[i];
		return word;
		}
	}
	public boolean isAllEven(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i]; 
			
			if (x % 2 == 0) { 
				return true;
		}
	}
				return false;
	}	
}