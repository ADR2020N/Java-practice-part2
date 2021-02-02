package Part_1.M;

public class Question_9 {

	public static void main(String[] args) {
		int n[]= {-2, 5,-6,2,-5,-6,5};
		int res=isBalanced(n);
		System.out.print(res);

	}
     static int isBalanced (int [ ] a) {
    	  boolean hasNeg;
    	 for(int i=0;i<a.length;i++) {
    		 hasNeg=false;
    		for(int j=0;j<a.length;j++) {
    			
    			if(a[i]==a[j]*-1) {
    				hasNeg=true;
    			}
    		}
    		if(!hasNeg)
    		 return 0;
    	 }
    	 
    	 
    	 return 1;
     }
}
