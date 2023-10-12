package javapractise;

public class Practice {

	public static void main(String[] args) {
		int no = 100;
		int div = 2;
		while (div <= no/2) {
			if (no % div == 0) {
				System.out.println(div);
			}
			div += 1;
		}

	}

}
