
public class Son extends Par {

	Son() {
		super();
		System.out.println("son con");
	}

	Son(String name) {
		super(name);
		System.out.println("Pan is update!" + name);
	}

	Son(long desc) {
		System.out.println("desc:" + desc);
	}

	Son(String name, int age, long desc) {
		// this(name);
		this(desc);
		System.out.println("son is " + age);
	}

	public static void main(String[] args) {
		Son s = new Son();
		s = new Son("Bob");
		s = new Son("Chen", 14, 10);

	}

}
