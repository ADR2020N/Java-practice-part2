package Part_1.M;

public class Question_8 {

	public static void main(String[] args) {
		int n[]= {78,316,74,18,15};
		int res=isFineArray(n);
		System.out.print(res);

	}
	static int isFineArray(int []a) {
		boolean hasTwin;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {   
				hasTwin=false;
				for( int j=0;j<a.length;j++) {
					
					if(isPrime(a[j])){
						 if(a[i]+2==a[j] || a[i]-2==a[j]) {
							 hasTwin=true; 
						 }
					}
				}
				if(!hasTwin)
					return 0;
				
			}
			
		}
		return 1;
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
