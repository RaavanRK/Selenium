package arr;

public class Max2ndEle {

	public static void main(String[] args) {
		int ar[]= {0,-2,878,-932,323,864,5,-9};
		int max=1;
		int max2=0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]>max) max=ar[i];
			
			if(ar[i]>max2 && ar[i]<max) max2=ar[i];
		}
		System.out.println("2nd max ele "+max2);
	}

}
