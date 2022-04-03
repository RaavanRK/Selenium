package arr;

public class SumOfOddIndxEle8 {

	public static void main(String[] args) {
		int []ar= {7,32,3246,9,-435,-987,342,0,1};
		int sum=0;
		for(int i=0; i<ar.length; i++)
		{
			if(i%2!=0) sum=sum+ar[i];
		}
		System.out.println("sum of even indexed ele "+sum);
	}

}
