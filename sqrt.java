package javapractise;

public class Mathdemo {

	public static void main(String[] args) {
		Mathdemo demo = new Mathdemo();
		int val = 9;
		demo.sqrt(val);

	}
	void sqrt(int no) {
		int div = 2;
		while (div <= no/2) {
			if(no/div == div) {
				System.out.println("Square root is " + div);
				break;
			}
			div += 1;
		}
		
	}

}
