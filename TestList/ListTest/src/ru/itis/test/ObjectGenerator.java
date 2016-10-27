package ru.itis.test;

import java.util.Random;

public final class ObjectGenerator {

	private Random rnd = new Random(System.currentTimeMillis());

	public static final class ObjectGeneratorHolder {
		public final static ObjectGenerator INSTABCE = new ObjectGenerator();
	}

	public static ObjectGenerator getInstance() {
		return ObjectGeneratorHolder.INSTABCE;
	}

	public static Object next() {
		return getInstance().genNext();
	}

	public static Object nextWithNulls() {
		if (Math.random() > 0.1d) {
			return getInstance().genNext();
		} else {
			return null;
		}
	}

	private Element genNext() {
		return new Element(rnd.nextInt());
	}

	private static final class Element {
		int value;

		public Element(int value) {
			this.value = value;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + value;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Element other = (Element) obj;
			if (value != other.value)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}
	}
}
