import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */
static String strVowels = "aeiou";

    // Counting Vowels in a given string
	public static int countVowels(String str) {
		int count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (strVowels.indexOf(str.charAt(j)) >= 0) {
				count++;
			}
		}
		return count;
	}

    
	public static String findSubstring(String s, int k) {
		String myString = new String();
		char[] givenString = s.toCharArray();
		int maxV = 0;
		int vowelsQuant = 0;
		String strGood = "";
		
		// No Vowels found
		if (countVowels(s) == 0)
			return "Not found!";

		for (int i = 0; i <= givenString.length - k; i++) {
			myString = s.substring(i, i + k);
			vowelsQuant = countVowels(myString);
			if (vowelsQuant > maxV) {
				maxV = vowelsQuant;
				strGood = myString;
			}
		}
		return strGood;
	}
   
}


class Solution {
    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);

        String s = scan.nextLine();

        int k = scan.nextInt();

        String result = Result.findSubstring(s, k);
        System.out.println(result);
        scan.close();
        
    }
}