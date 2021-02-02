package Part_1.M;

public class Evens {

	public static void main(String[] args) {
		int n = 8224;
		int res = isEvens(n);
		System.out.print(res);
	}

	static int isEvens(int n) {
		boolean isEven = false;
		while (n > 0) {
			int rem = n % 10;
			
			if (rem % 2 == 0) {
				isEven = true;
			}else {
				isEven = false;
			}
			n /= 10;
			
			if (!isEven)
				return 0;
		}
		
		return 1;
	}
}
