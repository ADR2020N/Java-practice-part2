package Part_1.M;

public class BalancedArray {

	public static void main(String[] args) {
		int n[] = {-5, 2, -2};
		int res = isBalanced(n);
		System.out.print(res);
	}
	static int isBalanced (int [ ] a) {
		 boolean isBal=false;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				if(a[i]*-1==a[j]) {
					isBal=true;
				}
			}
			if(!isBal)
				return 0;
		}
		return 1;
	}

}
