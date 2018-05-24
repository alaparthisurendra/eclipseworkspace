package localvariables;

class Suri {
	public void m1() {
		System.out.println("suri.m1");
	}

	void m2() {
		System.out.println("suri.m2");
	}

	protected void m3() {
		System.out.println("suri.m3");
	}

	private void m4() {
		System.out.println("suri.m4");
	}

}

class Ala extends Suri {
	public void m1() {
		System.out.println("ala.m1");
	}

	// public default protected access modifier for m2
	protected void m2() {
		System.out.println("ala.m2");
	}

	protected void m3() {
		System.out.println("ala.m3");
	}

	private void m4() {
		System.out.println("ala.m4");
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		Suri s = new Ala();
		s.m1();
		s.m2();
		s.m3();

		Suri a = new Suri();
		a.m1();
		a.m2();
		a.m3();

	}

}
