package arr;

public class AvgOfArr {

	public static void main(String[] args) {
		int ar[]= {23,52,2546,1,-7};
		float avg=0;
		float nos=ar.length;
		float sum=0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]!=0) sum=sum+ar[i];
		}
		avg=sum/nos;
		System.out.println("avg of arr "+avg);
	}

}
