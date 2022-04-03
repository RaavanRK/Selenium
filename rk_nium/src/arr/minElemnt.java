package arr;

public class minElemnt {

	public static void main(String[] args) {
		int ar[]= {1,45,64,878,-32,78,-587,0};
		int min=0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]<min)
				min=ar[i];
		}
		System.out.println("min element of arr "+min);
	}

}
