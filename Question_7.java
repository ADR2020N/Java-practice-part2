package Part_1.M;

public class Question_7 {

	public static void main(String[] args) {
		int n[]= {16,2,6,7,9};
		int res=isDigitSumArray(n);
		System.out.print(res);
	}
	static int isDigitSum(int n, int m) {
		int sum=0;
		if(n<0 || m<0) {
			return -1;
		}
		while(n>0) {
			int rem=n%10;
			sum=sum+rem; //sum+=rem
			n=n/10;//n/=10;
			
			}
		//System.out.println(sum);
		if(sum<m) {
			return 1;
		}else {
			return 0;
		}

	}
	
	static int countDigits(int n) {
		int count =0;
		  while(n>0) {
			int r=n%10;
			count++;
			n/=10;
		  }
		return count;
	}
	
	static int isDigitSumArray(int []a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			for(int p=i+1;p<a.length;p++) {
				sum=sum+a[p];
			}       
		
			
		}	
		
		return 1;
		}

	}

