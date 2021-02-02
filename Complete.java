package Part_1.M;

public class Complete {

	public static void main(String[] args) {
		int n[] = {8, 9, 9, 9, 4};
		int res = isComplete(n);
		System.out.print(res);

	}
     static int isComplete (int[ ] a) {
    	 int min=a[0];
    	 for(int i=0;i<a.length;i++) {
    		 if(a[i]%2==0) {
    			
    			  
    			 for(int j=0;j<a.length-1;j++) {
    				 if(a[i]<a[j+1]) {
    				
    					 min=a[i];
    					 
    				 }
    			 }
    		 
    		 
    		 
    	 }
    		 System.out.print(min);	
    
    		 
    	 
    	 
    	 
    
     }
    	 return 0;
}
}
