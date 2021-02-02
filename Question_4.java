package Part_1.M;

public class Question_4 {

	public static void main(String[] args) {
		int n=8 ;
		int res=isNormal2(n);
		System.out.print(res);

	}
	static int isNormal(int n) {
		
		boolean isNotNormal=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				if(i%2==1) {
					isNotNormal=true;
				}
			}
		}
		if(isNotNormal) {
			return 0;
		}else {
			return 1;
		}
	}
	
	static int isNormal2(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				if(i%2==1) {
					return 0;
				}
			}
		}
		return 1;
	}

}
