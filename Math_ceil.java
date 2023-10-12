public class Mathdemo {

	public static void main(String[] args) {
		Mathdemo demo = new Mathdemo();
		demo.ceil(64.1);

	}
	
	
	private void ceil(double val) {
		int val2 = (int)val;
		
		if (val2 == val) {
			System.out.println(val2);
		}
		else {
			System.out.println(val2+1);
		}
	}


}
