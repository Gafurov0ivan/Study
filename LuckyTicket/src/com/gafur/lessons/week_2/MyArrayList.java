package com.gafur.lessons.week_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {
	private static int index = 0;
	private static int size = 0;
	private Object[] array;

	public MyArrayList() {
		array = new Object[16];
	}

	public MyArrayList(int initialCapacity) {
		array = new Object[initialCapacity];
	}

	public void trimToSize() {
		Object[] newArray = new Object[array.length * 2];
		System.arraycopy(array, 0, newArray, 0, array.length);
		array = newArray;
	}

	private void ensureCapacity(int capacity) {
		if (array.length >= capacity) {

		} else {
			trimToSize();
		}
	}

	@Override
	public boolean add(Object arg0) {
		ensureCapacity(size + 1);
		array[size] = arg0;
		size++;
		return true;
	}

	@Override
	public void add(int arg0, Object arg1) {
		if (array[arg0] == null) {
			array[arg0] = arg1;
		}
	}

	@Override
	public boolean addAll(Collection arg0) {
		System.arraycopy(array, 0, arg0, 0, array.length);
		return true;
	}

	@Override
	public boolean addAll(int arg0, Collection arg1) {
		System.arraycopy(array, 0, arg1, arg0, array.length);
		return true;
	}

	@Override
	public void clear() {
		for (int i = 0; i < array.length; i++) {
			array[i] = null;
		}
	}

	@Override
	public boolean contains(Object arg0) {
		if (arg0 == null) {
			for (Object o : array) {
				if (o == null) {
					return true;
				}
			}
		} else {
			for (Object o : array) {
				if (o.equals(arg0)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		if (arg0 == null) {
			for (Object o : array) {
				if (o == null) {
					return true;
				}
			}
		} else {
			for (Object a : arg0) {
				for (Object o : array) {
					if (a.equals(o)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public Object get(int arg0) {
		Object o = array[arg0];
		return o;
	}

	@Override
	public int indexOf(Object arg0) {
		if (contains(arg0)) {
			for (int i = 0; i < array.length; i++) {
				if (array[i].equals(arg0)) {
					index = i;
				}
			}
		} else {
			System.out.println("There is no element in array");
		}
		return index;
	}

	@Override
	public boolean isEmpty() {
		if (array[0] == null) {
			return true;
		}
		return false;
	}

	@Override
	public int lastIndexOf(Object arg0) {

		if (contains(arg0)) {
			for (int i = 0; i < array.length; i++) {
				if (array[i].equals(arg0)) {
					index = i;
				}
			}
		} else {
			System.out.println("There are no elements in array");
		}
		return index;
	}

	@Override
	public boolean remove(Object arg0) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(arg0)) {
				Object[] newArray = new Object[array.length];
				System.arraycopy(array, 0, newArray, 0, i - 1);
				System.arraycopy(array, i + 1, newArray, i, array.length - 1 - i);
				array = newArray;
			}
		}
		return true;
	}

	@Override
	public Object remove(int arg0) {

		Object[] newArray = new Object[array.length];
		System.arraycopy(array, 0, newArray, 0, arg0 - 1);
		System.arraycopy(array, arg0 + 1, newArray, arg0, array.length - 1 - arg0);
		return true;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		for (int i = 0; i < array.length; i++) {
			if (arg0.contains(array[i])) {
				remove(i);
			}
		}
		return true;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		Object[] newArray = new Object[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (arg0.contains(array[i])) {
				newArray[index] = array[i];
				index++;
			}
		}
		return true;
	}

	@Override
	public Object set(int arg0, Object arg1) {
		array[arg0] = arg1;
		return arg1;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Object[] toArray() {
		Object[] newArray = new Object[array.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		for (int i = 0; i < array.length; i++) {
			arg0[i] = array[i];
		}
		return arg0;
	}

	@Override
	public List subList(int arg0, int arg1) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator listIterator(int arg0) {
		throw new UnsupportedOperationException();
	}

}
