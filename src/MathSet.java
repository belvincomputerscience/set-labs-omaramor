//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet(Set<Integer> one, Set<Integer> two)
	{
		this.one = one;
		this.two = two;
	}

	// UNION – all the items in both Sets  -  1 2 3 4 5 6 7 8
	public Set<Integer> union()
	{
		Set<Integer> newSet = new TreeSet<>(); // create a new set

        newSet.addAll(one); // add everything from set one
        newSet.addAll(two); // add everything from set two

		return newSet;
	}

	// INTERSECTION – the items that occur in both Sets  -  4 5
	public Set<Integer> intersection()
	{
		Set<Integer> newSet = new TreeSet<>(); // create a new set

		for (Integer x : one) {
			if (two.contains(x)) newSet.add(x);
		}

		return newSet;
	}

	// DIFFERENCE A-B – the items that occur in A, but not in B -  1 2 3
	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> newSet = new TreeSet<>(); // create a new set

		for (Integer x : one) {
			if (!two.contains(x)){
				newSet.add(x);
			}
		}

		return newSet;
	}

	// DIFFERENCE B-A – the items that occur in B, but not in A  -  6 7 8
	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> newSet = new TreeSet<>(); // create a new set

		for (Integer x : two) {
			if (!one.contains(x)) newSet.add(x);
		}

		return newSet;
	}

	// SYMMETRIC DIFFERENCE – the items that occur in either Set, but not in both  -  1 2 3 6 7 8
	public Set<Integer> symmetricDifference()
	{
		Set<Integer> newSet = new TreeSet<>(); // create a new set

		for (Integer x : one) {
			if (!two.contains(x)) newSet.add(x);
		}

		for (Integer x : two) {
			if (!one.contains(x)) newSet.add(x);
		}

		return newSet;
	}
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}