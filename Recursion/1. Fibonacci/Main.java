public class Main {
	public static int fibo(int n) {
		//Base case
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		// Recursive call + Small Calculation
		return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
		int ans = fibo(4);
		System.out.println(ans);
	}
}
