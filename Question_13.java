package Part_1.M;

public class Question_13 {

	public static void main(String[] args) {
		int n=33;
		int res=isPrimeProduct(n);
		System.out.print(res);

	}
	static int isPrimeProduct(int n) {
		for(int i=2;i<n;i++) {
			if(isPrime(i))
				for(int j=2;j<n;j++) {
					if(isPrime(j)) 
						if(j*i==n) {
							return 1;
						}
				}
		}
		
		return 0;
	}
	static boolean isPrime(int number) {

        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

}
