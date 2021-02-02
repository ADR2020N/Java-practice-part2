package Part_1.M;

public class Question_11 {

	public static void main(String[] args) {
		int n[]= {0,2,4,4,8,6};
		int res=isMagicArray(n);
		System.out.print(res);

	}
	static int isMagicArray (int[ ] a) {
		int sum=0;
		boolean hasPrime=true;
		for(int i=0;i<a.length;i++) {
				
				if(isPrime(a[i])) {
					sum=sum+a[i];
					
					hasPrime=false;
				}
		}
		if(sum==a[0] ||(!hasPrime && a[0]==0)) {
			return 1;
		}else
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
