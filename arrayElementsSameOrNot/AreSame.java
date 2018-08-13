

package arrayElementsSameOrNot;
import java.util.Arrays;

 

/*
 * Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have 
 * the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, 
 * regardless of the order.
 * 
 * Examples
Valid arrays
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

a = [121, 144, 19, 161, 19, 144, 19, 11] 
b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
Invalid arrays
If we change the first number to something else, comp may not return true anymore:

a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 132 is not the square of any number of a.

a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 36100 is not the square of any number of a.

Remarks
a or b might be [] (all languages except R, Shell). a or b might be nil or null or None (except in Haskell, Elixir, C++, Rust, R, Shell).

If a or b are nil (or null or None), the problem doesn't make sense so return false.

If a or b are empty the result is evident by itself.
 
 */
public class AreSame {

	public static boolean comp(int a[], int[] b) {
		
		// This below function is working as well 
		
		//condition checking both arrays
/*		 
		if (a == null || b == null || a.length != b.length)
			return false;
		
		boolean result = true;//initializing 

		for (int target : b) { // b array each elements will find out
			double temp = Math.pow(target, 0.5); // the exact number of its square and will store its result to temp vriable 
			boolean tempResult = false;
			for (int source : a) { // here with loop will go through array a 
				if (temp == source) { // will check temp result with source which is array a if its found 
					tempResult = true;//then result will be true and will break
					break;
				}
			}
			if (!tempResult) { //if not found within array a then 
				result = false; // result will be false
				break;
			}
		}
		return result;
		
*/		
		
		//This below function will pass all the test 
		
		//here simply checking array whether its null and both array same or not
		return a != null && b != null && a.length == b.length &&
				//stream -- will returns a sequential IntStream with the specified array as its source.
				//map -- will returns a stream consisting of the results of applying the given function to the elements of this stream. 
				
				//equals() method -- Returns true if the two specified arrays of ints are equal to one another. 
				//Two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs 
				//of elements in the two arrays are equal. In other words, two arrays are equal if they contain the same elements 
				//in the same order. Also, two array references are considered equal if both are null.
				
				// sorted() method -- Returns a stream consisting of the elements of this stream in sorted order. 
				//toArray() method --Returns an array containing the elements of this stream. 
				Arrays.equals(
						Arrays.stream(a).map(i -> i * i).sorted().toArray(),
						Arrays.stream(b).sorted().toArray()
				);
	}

	public static void main(String[] args) {
		int arrayOne[] = { 121, 144, 19, 161, 19, 144, 19, 11 };
		//Arrays.sort(arrayOne);
		int arrayTwo[] = { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
		//Arrays.sort(arrayTwo);

		System.out.println(comp(arrayOne, arrayTwo));
	}
}



//Another way to do 

/*public class AreSame {
	  
	  public static boolean comp(int[] a, int[] b) {
	    if (a == null || b == null || a.length != b.length) return false;
	    
	    final int l = a.length;
	    if (a.length == 0) return true;
	    
	    for (int i = 0; i < l; i++) a[i] = a[i] * a[i];
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    if (Arrays.equals(a, b)) return true;
	    return false;
	  }
	  
	  
	  
	  public static void main(String[] args) {
			int arrayOne[] = { 121, 144, 19, 161, 19, 144, 19, 11 };
			//Arrays.sort(arrayOne);
			int arrayTwo[] = { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
			//Arrays.sort(arrayTwo);

			System.out.println(comp(arrayOne, arrayTwo));
		}
	}*/