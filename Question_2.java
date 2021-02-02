package Part_1.M;

public class Question_2 {

	public static void main(String[] args) {
	 int a[]= {4,8,6,4,16,4,4};
	 int result=isDaphneCountTimesNumber4Appear(a);
	 System.out.print(result);
		
	}
	
	static int isDaphne (int [ ] a) {
		boolean isEven=false,isOdd=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				isEven=true;
		
			}else {
		     	isOdd=true;
		     	
			}
			
		}
		
		if((isEven) && (isOdd)) {
			return 0;
			}else {
			return 1;
			}
	}
	static int isDaphneCountTimesNumberAppear (int [ ] a) {
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==4) {
			count++;
			sum+=a[i];
			}
		}
		 System.out.println(sum);
		if(sum%3==0) {
			return 1;
		}else
		return 0;
	}

	static int isDaphneCountTimesNumber4Appear (int [ ] a) {
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==4) {
			 count++;
			}
		}
		if(count >4) {
			return 1;
		}else
			return 0;
		
	}


}
