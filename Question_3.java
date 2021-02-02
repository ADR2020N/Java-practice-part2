package Part_1.M;

public class Question_3 {

	public static void main(String[] args) {
	 int a[]= {8,7, 6,8, 2};
	 int result=checkDupliocate(a);
	 System.out.print(result);
		
	}
	
	static int checkDupliocate(int [] a) {
		boolean isOdd=false,hasDuplicate=false;
		for(int i=0;i<a.length;i++) {
			 if(a[i]%2!=0) {
				 isOdd=true;
			 }
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j]) {
					 hasDuplicate=true;
					 break;
				 }
			 }
			 if(isOdd && hasDuplicate) {    //check duplicate
					return 1;
			 }
		} 
		
		
		return 0;
		
	}
}
