public class Test {
	static String a[] = { "aa", "bb", "cc", "dd", "ee" };

	public static void main(String args[]) {
		for (int i = 0; i < a.length; i++) {
			a[i].equals("cc");
			System.out.println("haha");
		}
	}

}
