
public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	
	public static int factorial(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		
		else {
			return n * factorial(n-1);
		}
	}
	
	//testinng factorial method
	public static void main(String[] args) {
		System.out.print(factorial(5));
	}
}
