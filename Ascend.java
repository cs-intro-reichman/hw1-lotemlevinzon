// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)((Math.random() * lim) + 1);
		int b = (int)((Math.random() * lim) + 1);
		int c = (int)((Math.random() * lim) + 1);
		int minNum = Math.min(Math.min(a,b), c);
		int maxNum = Math.max(Math.max(a,b), c);
		int midNum = a + b + c - minNum - maxNum;
		System.out.println(minNum + " " + midNum + " " + maxNum);
	}
}
