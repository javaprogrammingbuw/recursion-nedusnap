
public class Fibonacci {
	//todo: The Fibonacci sequence is a sequence where the current number is the sum of the previous numbers. You can read it up here:
	//https://en.wikipedia.org/wiki/Fibonacci_number
	//Write an iterative method fib which takes an integer as parameter. This integer corresponds to the position in the Fibonacci sequence.
	//fib should return the fibonacci number at this position. For example, fib(4) should return 3.
	//Now, write a second methond fibRek. fibRek does exactly the same like fib, but it works recursive.



public static int fib(int n) {
	if(n==0) {
		return 0;
	}
	else if (n==1) {
		return 1;
	}
	else {
		int n1 = 0;
		int n2 = 1;
		
		for(int i=1; i<n; i++) {
			int next;
			next = n1 + n2;
			n1 = n2;
			n2 = next;
		}
		return n2;
	}
}

//my fibRek method

	public static int fibRek(int n) {
		if(n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else {
			return fibRek(n-1) + fibRek(n-2);
		}
	}
	
	
/*
 * fib() and fibRek() method test	
 */
	
	public static void main(String[] args) {
		System.out.println(fib(8));
		System.out.println(fibRek(8));

	}
	}
