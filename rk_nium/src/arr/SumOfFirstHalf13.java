package arr;

public class SumOfFirstHalf13 {

	public static void main(String[] args) {
		int ar[]= {90,987,34,-24,-196,-84,8945,1,7,230};
		int sum=0;
		for (int i = 0; i <= (ar.length)/2; i++) {
			sum=sum+ar[i];
		}
		System.out.println("sum of first half ele "+sum);
	}

}
