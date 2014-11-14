package my.generics;

public class Util {
	// Generic static method
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey())
				&& p1.getValue().equals(p2.getValue());
	}

	public static void main(String args[]) {
		// The complete syntax for invoking this method would be:

		Util u = new Util();
		Pair<Integer, String> p2 = u.new Pair<Integer, String>(2, "pear");
		Pair<Integer, String> p1 = u.new Pair<Integer, String>(1, "apple");
		boolean same = Util.<Integer, String> compare(p1, p2);
		System.out.println("Util.<Integer, String>compare(p1, p2): " + same);
		// In Java1.7 the type <Integer, String> can be left out and the compiler will infer the type that is needed:

		same = Util.compare(p1, p1);
		System.out.println("Begin testHashSet()");
		System.out.println("Util.<Integer, String>compare(p1, p1): " + same);
		return;
	}

	class Pair<K, V> {

		private K key;
		private V value;

		// Generic constructor
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		// Generic methods
		public void setKey(K key) {
			this.key = key;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}
	}

}