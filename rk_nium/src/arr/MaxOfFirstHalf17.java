package arr;

public class MaxOfFirstHalf17 {

	public static void main(String[] args) {
		int ar[]= {90,987,34,-24,-196,-84,8945,1,7,230};
		int max=0;
		for (int i = 0; i <= (ar.length)/2; i++) {
			if(ar[i]>max) max=ar[i];
			}
	}

}
