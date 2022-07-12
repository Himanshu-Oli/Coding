public class Main {
	public static int stairs(int n) {
		// Base case
		if (n == 1 || n == 2) {
			return n;
		}
		// Recursive call + Small calculation
		return stairs(n-1) + stairs(n-2);
	}
	public static void main(String[] args) {
		int ans = stairs(4);
		System.out.println(ans);
	}
}
