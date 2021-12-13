package strings;

//All immutable classes are decalred as final
final class UDImmutableClass {

	private int i;

	UDImmutableClass(int i) {
		this.i = i;
	}

	public UDImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new UDImmutableClass(i);
		}
	}

	public static void main(String[] args) {
		UDImmutableClass t1 =new UDImmutableClass(10);
		UDImmutableClass t2 = t1.modify(100);
		UDImmutableClass t3 = t1.modify(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
	}
}
