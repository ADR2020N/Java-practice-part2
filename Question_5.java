package Part_1.M;

public class Question_5 {
	public static void main(String[] args) {
	int n[]= {3,2,1,4,5};
	int res=isAllPossibilities(n);
	System.out.print(res);

	}
	static int isAllPossibilities(int[ ] a) {
		boolean isAllPossibities;
		for(int i=0;i<a.length;i++) {
			isAllPossibities=false;
			for(int j=0;j<a.length;j++) {
				
				if(a[i]==j) {
					isAllPossibities=true;  
				}
			}
			
			if(!isAllPossibities) {
				return 0;
				}
			}
		
		return 1;
	}
	
}
