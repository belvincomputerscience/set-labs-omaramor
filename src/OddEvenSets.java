//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;

import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds = new TreeSet<>();;
	private Set<Integer> evens = new TreeSet<>();;

	public OddEvenSets(ArrayList<Integer> nums) {
		for (int x : nums) { // look at every number in the nums array
			if (x % 2 == 0) { // if the remainder is zero, the number is even
				evens.add(x); // add to evens set
			} else { // ...otherwise odd
				odds.add(x); // add to odds set
			}
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
} //We then take this array and split it into two groups (Odd and Even)
// then output it in a certain format the lab wanted down on the bottom (next photo)