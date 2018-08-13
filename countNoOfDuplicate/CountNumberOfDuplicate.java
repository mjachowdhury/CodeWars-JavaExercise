package countNoOfDuplicate;

 
/*
 * Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (bandB)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */

public class CountNumberOfDuplicate {

	public static int duplicateCount(String str) {

		// this function will return whether is there any duplicate or not
		// function have to be boolen
		// return str.length() != str.chars().distinct().count();

		
		//------------------------------------
		
		
		// this function will show how many duplicate
		int result = str.length();
		int count[] = new int[256];

		//with for loop counting how many string there
		for (int i = 0; i < str.length(); i++) {

			count[str.charAt(i)]++; //storing str char to count array
		}
		// System.out.println("The ascii values are:"+ Arrays.toString(count));

		// Now display what character is repeated how many times

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0)
				System.out.println("Number of " + (char) i + ": " + count[i]);
		}

		return result;
		
		
		
		
		//this function will return unique char
		
		/*String lowerCase = str.toLowerCase();
	    char characters[] = lowerCase.toCharArray();
	    int countOfUniqueChars = str.length();
	    for (int i = 0; i < characters.length; i++) {
	        if (i != lowerCase.indexOf(characters[i])) {
	            countOfUniqueChars--;
	        }
	    }
	    return countOfUniqueChars;*/
		
	}

	public static void main(String[] args) {

		String myString = "aaccd***/123";
		 
		System.out.println(duplicateCount(myString));
	}

}
