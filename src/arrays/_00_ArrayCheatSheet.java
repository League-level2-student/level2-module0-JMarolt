package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] list = {"hi", "hi", "hi", "hi", "hi"};
		//2. print the third element in the array
		//System.out.println(list[2]);
		//3. set the third element to a different value
		list[2] = "SUPLOLLKSFugLIGHSEug";
		//4. print the third element again
		//System.out.println(list[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < list.length; i++) {
			//System.out.println(list[i]);
		}
		
		//6. make an array of 50 integers
		int[] lists = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for(int k = 0; k < lists.length; k++) {
			lists[k] = rand.nextInt(100);
			//System.out.println(lists[k]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 100;
		for(int k = 0; k < lists.length; k++) {
			if(lists[k] < smallest) {
				smallest = lists[k];
			}
		}
		//9 print the entire array to see if step 8 was correct
		System.out.println(smallest);
		for(int k = 0; k < lists.length; k++) {
			System.out.println(lists[k]);
		}
		//10. print the largest number in the array.
		int largest = 0;
		for(int k = 0; k < lists.length; k++) {
			if(lists[k] > largest) {
				largest = lists[k];
				System.out.println(largest);
			}
		}
	}
}
