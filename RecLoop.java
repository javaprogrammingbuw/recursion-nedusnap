import java.util.Scanner;

public class RecLoop{

	//todo: Look at the given code and try to understand the methods.
	//The first method euklidRek uses recursion to compute the euclidean algorithm.
	//You can look up the algorithm here: https://en.wikipedia.org/wiki/Euclidean_algorithm
	//Add another method euclidIterative that computes the euclidean algorithm iterative.
	//The second method powIterative computes the the base to the power of n in a iterative way.
	//Add another method powRek which does exactly the same, but by using recursion.

	 public static int euclidRec(int a, int b) {
		if (a == b) {
			return a;
		} else if (b > a) {
			int temp = a;
			a = b;
			b = temp;
			return euclidRec(a, b);
		} else {
			return euclidRec(a - b, b);
		}
	}
	 
	 //my EuclidIterative method

	 public static int euclidIterative(int a, int b) {
		 
		 if(a==0) {
			 return b;
		 }
		 
		 while (b!=0) {
			 if (a>b) {
				 a = a-b;
			 }
			 else {
				 b = b-a;
			 }
		 }
		 return a;
		 }
		 
	 
	 
    public static double powIterative(final double base, final int n) {
		if (n < 0) {
			System.out.println("(Our version of) power is undefined for negative numbers.");
			return -1;
		} else {
			double result = 1; 

			for (int i = n; i > 0; --i) {
				result = result * base;
			}
			return result;
		}
	}
    
    //Testing the EuclidIterative method
    
	public static void main(String[] args) {
		System.out.println(euclidIterative(462, 1071));
		System.out.println(euclidRec(462, 1071));
	}
}