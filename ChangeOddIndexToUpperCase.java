package week1.day2;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Input Declaration
			String test="changeme";
			
			//Convert String to upper case
			String string = test.toUpperCase();
			System.out.println(string);
			
			//Note: To print array-convert array to string and print
			//System.out.println(Arrays.toString(arr));
			
			//Convert odd index of Character to upper case
			char[] arr = test.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if (i%2!=0) {
					
					char upperCase = Character.toUpperCase(arr[i]);
					System.out.print(upperCase);
				}
				else {
					//char str=arr[i];
					System.out.print(arr[i]);
				}
				
			}
	}

}
