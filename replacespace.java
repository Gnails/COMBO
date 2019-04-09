import java.util.Scanner;

public class replacespace {
	public static String replaceSpace(StringBuffer str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				count++;
		}
		int sl=str.length() - 1;
		   for(int i=0;i<=2*count-1;i++)
				str.append(" ");
		for (int i =sl ; i >= 0; i--) {
			if (str.charAt(i) != ' ' && count != 0) {
				str.setCharAt(i + 2 * count, str.charAt(i));
			}

			if (str.charAt(i) == ' ' && count != 0) {
				str.setCharAt(i + 2 * count, '0');
				str.setCharAt(i + 2 * count - 1, '2');
				str.setCharAt(i + 2 * count - 2, '%');
				count--;
				continue;
			}
			if (count == -1)
				break;

		}
		return str.toString();
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] st = sc.nextLine().split("\\s");
//		for (int i = 0; i < st.length; i++) {
//
//			System.out.print(st[i]);
//			if (i < st.length - 1)
//				System.out.print("%20");
//		}
		System.out.print(replaceSpace(new StringBuffer(" ")));

	}

}
