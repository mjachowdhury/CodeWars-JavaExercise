package buildingBlock;

/**
 * Your task is to construct a building which will be a pile of n cubes. The
 * cube at the bottom will have a volume of n^3, the cube above will have volume
 * of (n-1)^3 and so on until the top which will have a volume of 1^3.
 * 
 * You are given the total volume m of the building. Being given m can you find
 * the number n of cubes you will have to build?
 * 
 * The parameter of the function findNb (find_nb, find-nb, findNb) will be an
 * integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... +
 * 1^3 = m if such a n exists or -1 if there is no such n.
 * 
 * @author Mohammed
 *
 */

// No : 1 is working 

/*public class FindingBlock {

	public static long findNb(long m) {
		long n = 0;
		long sum = 0;
		while (true) {
			n += 1;
			// first calculate the volume of the current cube
			sum += (long) Math.pow(n, 3);
			if (sum >= m) {
				break;
			}
		}
		 // if m is zero then we've found our n, so return n
		if (sum == m) {
			return n;
		// if we've gone below zero there is no such n!	
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {

		System.out.println(findNb(1071225));
		System.out.println(findNb(91716553919377L));

	}

}
*/

//No : 2 --this is working 
public class FindingBlock {
	  
	  public static long findNb(long m) {
	    long mm = 0, n = 0;
	    while (mm < m) mm += ++n * n * n;
	    return mm == m ? n : -1;
	  }  
	  
	  public static void main(String[] args) {

			System.out.println(findNb(1071225));
			System.out.println(findNb(91716553919377L));

		}
	}
	
	
// NO : 3 not great 	
	/*public static long findNb(long m) {
		long sum = 0;
		long i;
		 // first calculate the volume of the current cube
		for (i = 0; sum < m; i++) {
			sum = (long) (Math.pow(i * (i + 1), 2) / 4);
		}
		 // if m is zero then we've found our n, so return n
		if (sum == m)
			return i - 1;
		// if we've gone below zero there is no such n!
		else
			return (-1);

	}

	public static void main(String[] args) {

		System.out.println(findNb(1071225));
		System.out.println(findNb(91716553919377L));

	}
*/

