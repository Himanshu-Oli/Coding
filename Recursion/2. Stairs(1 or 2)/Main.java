public class Main {
	public static int stairs(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return stairs(n-1) + stairs(n-2);
	}
	public static void main(String[] args) {
		int ans = stairs(4);
		System.out.println(ans);
	}
}
