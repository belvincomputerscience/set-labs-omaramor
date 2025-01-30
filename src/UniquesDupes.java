//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;

public class UniquesDupes {

// How i think it should work:
//	public static Set<String> getUniques(String input)
//	{
//		//Split the string at a space and store in String array
//		String[] list = input.split(" ");
//
//		//Create a TreeSet to store values
//		Set<String> uniques = new TreeSet<String>();
//
//		//loop through the list and count, inner loop checking for duplicates
//		for (String x : list) {
//			int count = 0;
//
//            for (String y : list) {
//                if (x.equals(y)) count++;
//            }
//
//			//if count doesn't increase, must be unique, add it
//			if (count == 1) uniques.add(x);
//		}
//
//		return uniques;
// }

	// How it works per instructions
	public static Set<String> getUniques(String input)
	{
		//Split the string at a space and store in String array
		String[] list = input.split(" ");

		//Create a TreeSet to store values
		Set<String> uniques = new TreeSet<String>();

		//loop through the list and count, inner loop checking for duplicates
        Collections.addAll(uniques, list);

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		String[] list = input.split(" ");
		Set<String> dupes = new TreeSet<String>();

		for (String x : list) {
			int count = 0;

			for (String y : list) {
				if (x.equals(y)) count++;
			}

			if (count > 1) dupes.add(x);
		}

		return dupes;
	}
}