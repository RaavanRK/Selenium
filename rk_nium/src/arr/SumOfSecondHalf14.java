package arr;

public class SumOfSecondHalf14 {

	public static void main(String[] args) {
		int ar[]= {90,987,34,-24,-196,-84,8945,1,7,230};
		int sum=0;
		for (int i = (ar.length/2); i < ar.length; i++) {
			sum=sum+ar[i];
		}
	}

}
