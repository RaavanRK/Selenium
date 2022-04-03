package arr;

public class MinOfSecondHalf16 {

	public static void main(String[] args) {
		int ar[]= {90,987,34,-24,-196,-84,8945,1,7,230};
		int min=0;
		for (int i = (ar.length/2) ; i < ar.length; i++) {
			if(ar[i]<min) min=ar[i];
			}
	}

}
