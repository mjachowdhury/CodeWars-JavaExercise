package integerToBinary;

/*
 * Write a function that takes an (unsigned) integer as input, and returns the number of bits that are equal to one in the binary representation of that number.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */
public class BitCounting {

	/**
	 * This function will return bits 
	 * @param n
	 * @return
	 */
	/*public static int countBits(int n){
		int result = 0;
		
		while(n > 0){
			result += n & 1;
			n >>= 1;
		}
		return result;
	}
	*/
	
	/**
	 * This function will return integer value its bits
	 * @param n
	 * @return
	 */
	public static int countBits(int n){
		 //return Integer.bitCount(n);
		int result = Integer.bitCount(n);
		return result;
	}
	
	
	//main function
	public static void main(String[] args) {
	 
		int n = 125;
		System.out.println(countBits(n));
	}

}
