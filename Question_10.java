package Part_1.M;

public class Question_10 {

	public static void main(String[] args) {
		int n=648644;
		int res=isEven(n);
		System.out.print(res);

	}
	static int isEven(int n) {
		while(n>0) {
			int rem=n%10;
			n=n/10;
			if(rem%2!=0) {
				return 0;
			}
			
		}
		
    	return 1;
	
	}
	

}
