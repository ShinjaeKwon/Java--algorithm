import java.util.Scanner;

public class Main1316 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N = sc.nextInt();
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			if (check() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			if (prev != now) {
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				} else {
					return false;
				}
			} else {
				continue;
			}
		}
		return true;
	}

}
