package checkXorO;

import java.util.Arrays;

/*
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
 */
public class XO {

	public static boolean getXO(String str) {
		boolean result = false;
		
		
		String o = str.toLowerCase();
		String x = str.toLowerCase();
		
		if( o == x)
			result = true;
		else if( o != x)
			result = false;
		else
			result = true;
	return result;
		 
		 }

		 /*boolean result = false;
		 
		 int strResult = str.length();
		 String strR = str.toLowerCase();
		 for(int i = 0 ; i<strR.length(); i++){
			 if(strR == "x" && strR == "0"){
				 result = true;
			 }
			 if(strR == "x" && strR == "0"){
				 result = true;
			 }
		 }
		 
		 return result;
		 */
	
	
	public static void main(String args[]){
		String myStr = "axocdab";
		System.out.println(getXO(myStr));
	}
}