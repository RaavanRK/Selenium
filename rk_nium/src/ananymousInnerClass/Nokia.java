package ananymousInnerClass;

public class Nokia {

	public static void main(String[] args) {
		Smartphone s= new Smartphone() {
			
			@Override
			public void getSmartphone() {
				System.out.println("Maine kuchh nahi kiyaa ....");
			}
		};
		s.getSmartphone();
		
	}

}
