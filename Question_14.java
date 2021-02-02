package Part_1.M;

public class Question_14 {

	public static void main(String[] args) {
		int n[]= {6, 5, 121, 11, 20};
		int res=isBalanced(n);
		System.out.print(res);

	}
	static 	int isBalanced(int[ ] a) {
		
		for(int i=0;i<a.length;i++) {
			
			if((i%2==0 && a[i]%2!=0)) {
				//System.out.print(i+" "+a[i]);
				return 0;	
			}
			if((i%2!=0 && a[i]%2==0)) {
				//System.out.print(i+" "+a[i]);
				return 0;	
			}
		}
		
		
		return 1;
	}
}
