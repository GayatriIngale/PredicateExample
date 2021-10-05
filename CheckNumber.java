package PredicateInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample i/p and o/p");
		System.out.print("enter no:");
		Predicate<Integer> p = (x) -> x >= 0;
		System.out.println(p.test(sc.nextInt()));
	}
	
	

}
