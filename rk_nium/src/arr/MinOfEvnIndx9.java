package arr;

public class MinOfEvnIndx9 {

	public static void main(String[] args) {
		int ar[]= {90,987,34,-24,-196,-84,8945,1,7,230};
		int min=0;
		for (int i = 0; i < ar.length; i++) {
			if(i%2==0 && ar[i]<min) min=ar[i];
		}
		System.out.println("min of even indexed ele "+min);
	}

}
