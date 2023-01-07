import java.util.*;
// Enumeration interface is used to get elements from vector
class EnumerationIterator implements Iterator {
	Enumeration enumeration;

	public EnumerationIterator(Enumeration enumeration) {
		this.enumeration = enumeration;
	}

	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	public Object next() {
		return enumeration.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}


class EnumIterator {
	public static void main (String args[]) {
		Vector v = new Vector(Arrays.asList("JAVA","CPP","SQL","HTML"));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
