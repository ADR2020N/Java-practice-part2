package Part_1.M;

public class Question_1 {

	public static void main(String[] args) {
	System.out.print(countOneTwo(13));
	}
	static int countOnes (int n)
	{
		int count=0;
		int r;
	    while(n>0) 
	    {
	    r=n%2; //either 1 or 0  
	    n=n/2;
	     if(r==1) {
	     count++;
	     }
	    }
	    
	     return count;
	}
	
	static int countOneTwo(int n) {
		int count=0;
		while(n>0) {
			count+=n%2; //count=count+n%2
			n/=2;   //n=n/2
		}
		return count;
	}

}
