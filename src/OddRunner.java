//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner { /* This code is reading line by line1, then integer by integer2,adds into a new fresh
array , until there isnt any more3. We then take this array and split it into two groups (Odd and Even)
*/
	public static void main( String args[] ) throws IOException {
		File f = new File("oddevent.dat"); // create file
		Scanner s = new Scanner(f); // create scanner with file

		// for each line inside the file, create a scanner for the line
		while (s.hasNextLine()) {
			String line = s.nextLine(); //.nextLine() is a Scanner class method
			Scanner n = new Scanner(line);

			// for each integer in the line, add it to an ArrayList called nums
			ArrayList<Integer> nums = new ArrayList<>();
			while (n.hasNextInt()) nums.add(n.nextInt());
			n.close();

			// create our OddEvenSets object with the nums
			OddEvenSets x = new OddEvenSets(nums);

			// print out the data inside the OddEvenSets object
			System.out.println(x);
		}

		s.close();
	}
}