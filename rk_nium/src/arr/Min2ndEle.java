package arr;

public class Min2ndEle {

	public static void main(String[] args) {
		int ar[]= {0,4,-938,433,-7,369,-324};
		int min=1; int min2=0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]<min)
				min=ar[i];
			if(ar[i]<min2&&ar[i]>min)
				min2=ar[i];
		}
		System.out.println("2nd min element is "+min2);
	}

}
