public class Practice {

	public static void main(String[] args) {
		Practice lcm = new Practice();
		int g_no = 49;
		lcm.smallest_div(g_no); 
}
	void smallest_div(int no) {
		int div = 2;
		int small = -1;
		
		while (div <= no/2) {
			if (no % div == 0) {
				small = div;
				break;
			}
			div += 1;
		}
		System.out.println(small);
	}	
}
