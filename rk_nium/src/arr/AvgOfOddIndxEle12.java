package arr;

public class AvgOfOddIndxEle12 {

	public static void main(String[] args) {
		int ar[]= {90,987,34,-24,-196,-84,8945,1,7,230};
		float avg=0;
		float sum=0;
		float nos=0;
		for (int i = 0; i < ar.length; i++) {
			if(i%2!=0) {
				sum=sum+ar[i];
				nos++;
			}
		}
		avg=sum/nos;
		System.out.println("avg of odd indexed ele "+avg);
	}

}
