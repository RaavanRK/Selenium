package arr;

public class SumOfEvenIndxEle {

	public static void main(String[] args) {
		int ar[]= {12,34,0,7,7654,32,-72,1,-324};
		int sum=0;
		
		for(int i=0; i<ar.length; i++)
		{
			if(i%2==0) sum=sum+ar[i];
		}
		System.out.println("sum of even indexed ele "+sum);
	}

}
