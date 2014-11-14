package my.test;

class Base {
    protected int i;
 
	Base() {
		add(1);
	}
 
	void add(int v) {
		i += v;
		System.out.println("i in base add " + i);
	}
}
 
class Extension extends Base {
	Extension() {
		add(1);
	}
 
	void add(int v) {
		i += v * 2;
		System.out.println("i in Extension add " + i);
	}
}
 
public class Example {
	public static void main(String[] args) {
		Base b = new Extension();
		b.add(8);
	}
}