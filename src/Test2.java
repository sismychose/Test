public class Test2 {
	public static void main(String[] args) {
		int i = 12;
		System.out.println(i += i -= i *= i);

		Integer a = new Integer(3);
		Integer b = 3; // 将3自动装箱成Integer类型
		int c = 3;
		System.out.println(a == b); // false 两个引用没有引用同一对象
		System.out.println(a == c);

		Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

		System.out.println(f1 == f2);
		System.out.println(f3 == f4);
	}
}