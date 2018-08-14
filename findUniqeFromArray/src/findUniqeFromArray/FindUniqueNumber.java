package findUniqeFromArray;

import java.util.Arrays;
import java.util.List;


/*
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains more than 3 numbers.

The tests contain some very huge arrays, so think about performance.
 */

/**
 * This function will return unique number form integer array
 * @author Mohammed
 *
 */
public class FindUniqueNumber {
	
	public static double findUnique(double arr[]){
		 
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < arr.length; j++)
				if (i != j && arr[i] == arr[j])
					break;

			if (j == arr.length)
				return arr[i];

		}
		return -1;
		
		
		/* int res = 0;
		 for(int i = 0; i<arrNum.length; i++){
			 res= res^arrNum[i];
			 
		 }
		 //System.out.println(res);
		 return res;*/
		
		 /*int result = 0;
		 for(int a : arrNum)
			 result ^=a;
		 return result;*/
		/*List list = Arrays.asList(arrNum);
		int result = 0;
		for(int i : arrNum){
			if(list.indexOf(i) == list.lastIndexOf(i)){
				result = i;
				break;
			}
		}
		return result;*/
			
		
	}

	public static void main(String[] args) {
		 
		//int myArray[] = {1,1,1,2,1,3,3,1};
		double myArray[] = {0, 0, 0.55, 0, 0};
		 System.out.println(findUnique(myArray));
	}

}
