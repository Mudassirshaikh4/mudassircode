package statementlogic;

public class palindrome {

	public static void main(String[] args) {
		int u = 535;
		// int d=u;
		int rev = 0;
		int temp = u;
		int rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (u == rev) {
			System.out.println(u + " is palindrome");
		} else {
			System.out.println(u + " is not palindrome");
		}
	}
}
