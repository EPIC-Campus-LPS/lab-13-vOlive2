public class recursions {
	public static void main(String args[]) {
		System.out.println(gcd(5,10)); // 5
		System.out.println(gcd(35,7)); // 7
		System.out.println(gcd(1071,462)); // 21
		System.out.println(gcd(1386,3213)); // 63
		System.out.println();
		System.out.println(sumDigits(123)); // 6
		System.out.println(sumDigits(12345)); // 15
		System.out.println(sumDigits(954736163)); // 44
	}
	public static int gcd(int a, int b) {		
		if(a < b) {int c=a; a=b; b=c;}
		if(a%b == 0) {return b;}
		if(a == b) {return b;}
		return gcd(a, a%b);
	}
	public static int sumDigits(int a) {
		String c = (Integer.toString(a));
		if (c.length() <= 1) {return a;}
		int b = Integer.parseInt(c.substring(0, 1));
		a = Integer.parseInt(c.substring(1, c.length()));
		return b + sumDigits(a);
	}
	public static int binarySearch(int[] arr, int target) {	
		return b;
	}
	public static int binaryRep(int a) {	
		int b = a;
		return b;
	}
}
