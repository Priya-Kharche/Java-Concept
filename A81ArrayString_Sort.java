//A81 - WAP on Array Function using Arrays.toString and Arrays.sort concept.
package ab52;

import java.util.Arrays;

public class A81ArrayString_Sort {

	public static void main(String[] args) 
	{
		 // create an integer array
        int[] n = {1, 2, 3, 4,};

        // print the array using Arrays.toString()
        System.out.println(Arrays.toString(n));

        // Integer Array
        int[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
     
        //Char Array
        char[] c = {'c', 'a', 'd', 'b'};
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
	}
}

