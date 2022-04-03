package arr;

public class MaxElemnt {

	public static void main(String[] args) {
		int ar[]= {0,75,-329,786,34,234,2,6};
		int max=0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]>max)
				max=ar[i];
		}
		System.out.println("max element of arr "+max);
	}

}
