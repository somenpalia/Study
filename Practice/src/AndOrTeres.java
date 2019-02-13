public class AndOrTeres {
	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		int c = -30;
		
		System.out.println(a>b || b<c && c>b);
		
		System.out.println((a>b || b<c) && c>b);

		System.out.println(b<c && c>b || a>b);
	}
}
