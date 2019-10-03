package anonymousclass;

public class main {

	public static void main(String[] args) {
		ano a= new ano() {//called annonynous inner class.

			@Override
			public void show() {//implements the interface
				System.out.println("hello");
				
			}
};

a.show();
	}
	}