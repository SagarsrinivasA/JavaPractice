package gfgjava8tutorial;

public class AnnonymousClass {

	public static void main(String[] args) {

		// implementing operate method by using annonymous class

		SamInterface sam = new SamInterface() {

			@Override
			public int operate(int x, int y) {
				return x + y;
			}
		};

		int result = sam.operate(6, 7);
		System.out.println(result);
		
		// implementing operate method by using lambda expression
		
		SamInterface sam2 = (x, y) -> x * y;
		System.out.println(sam2.operate(8, 9));
	}

}
