package arr;

public class MaxOfOddIndxEle10 {

	public static void main(String[] args) {
		int ar[]= {90,987,34,-24,-196,-84,8945,1,7,230};
		int max=0;
		for (int i = 0; i < ar.length; i++) {
			if(i%2!=0 && ar[i]>max)
				max=ar[i];
		}
	}

}
