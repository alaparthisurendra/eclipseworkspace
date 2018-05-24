package localvariables;

public class LocalVaraibleinsideMain {
	int k = 1000;
	int m = 50;

	public static void method() {
		final int y = 10;
		System.out.println(y);
	}

	public void method2() {
		int k = 12;
		final int m = 0;
		System.out.println(k);
		System.out.println(m);
	}

	public static void main(String[] args) {
		//public int x;
		final int y = 0;
		int k = 100;
		System.out.println(k);
		method();
		LocalVaraibleinsideMain lvm = new LocalVaraibleinsideMain();
		lvm.method2();
	}

}
