//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("mathsetdata.dat");
		Scanner s = new Scanner(f);

		while (s.hasNextLine()) {
			Set<Integer> set1 = stringArrayToIntegerSet(s.nextLine().split(" "));
			Set<Integer> set2 = stringArrayToIntegerSet(s.nextLine().split(" "));

			MathSet myMathSet = new MathSet(set1, set2);

			System.out.println(myMathSet);

			/*
			union - [1, 2, 3, 4, 5, 6, 7, 8]
			intersection - [4, 5]
			difference A-B - [1, 2, 3]
			difference B-A - [6, 7, 8]
			symmetric difference [1, 2, 3, 6, 7, 8]
			 */

			System.out.println("union - " + myMathSet.union());
			System.out.println("intersection - " + myMathSet.intersection());
			System.out.println("difference A-B - " + myMathSet.differenceAMinusB());
			System.out.println("difference B-A - " + myMathSet.differenceBMinusA());
			System.out.println("symmetric difference - " + myMathSet.symmetricDifference() + "\n\n");
		}
	}

	public static Set<Integer> stringArrayToIntegerSet(String[] strs) {
		Set<Integer> mySet = new TreeSet<>();

		for (int i = 0; i < strs.length; i++) {
			mySet.add(Integer.parseInt(strs[i]));
		}

		return mySet;
	}
}
