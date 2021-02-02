package Part_1.M;

public class Question_16_a {

	public static void main(String[] args) {
		int a1[]= {0,2,1,2};
		int a2[]= {1,4,2,0,1,1,2,2,2,1,2};
		int res=equivalentArrays(a1, a2);
		System.out.print(res);
		
	}
	public static int equivalentArrays(int [] a1,int [] a2) {
	   boolean isEq;
		for(int i=0;i<a1.length;i++) {
			isEq=false;
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j])
				{
					isEq=true;
				}	
			}
			if(!isEq) {
				return 0;
			}
		}
		return 1;
	}

}
