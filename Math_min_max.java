public class Mathdemo {

	public static void main(String[] args) {
		Mathdemo demo = new Mathdemo();
		demo.max(10,3);
		demo.min(20,10);

	}

	private void min(int i, int j) {
		System.out.println("Minimum value :");
		if (i < j) {
			System.out.println(i);
		}
		else {
			System.out.println(j);
		}
		
	}
		
	

	private void max(int i, int j) {
		System.out.println("Maximum value :");
		if (i > j) {
			System.out.println(i);
		}
		else {
			System.out.println(j);
		}
		
	}

}
