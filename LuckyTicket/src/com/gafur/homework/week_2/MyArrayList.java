package com.gafur.homework.week_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {
	private static int size = 0;
	private Object[] array;

	public MyArrayList() {
		this.array = new Object[16];
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity > 0) {
			this.array = new Object[initialCapacity];
		} else {
			this.array = new Object[16];
		}
	}

	public void trimToSize() {
		Object[] newArray = new Object[size * 2];
		System.arraycopy(array, 0, newArray, 0, size);
		this.array = newArray;
	}

	private void ensureCapacity(int minCapacity) {
		if (size < minCapacity) {
			Object[] newArray = new Object[minCapacity];
			System.arraycopy(array, 0, newArray, 0, size);
			this.array = newArray;
		}
	}

	public boolean add(T t) {
		ensureCapacity(size + 1);
		array[size++] = t;
		return true;
	}

	public void add(int index, T t) {
		ensureCapacity(size + 1);
		System.arraycopy(array, index, array, index + 1, size - index);
		array[index] = t;
		size++;
	}

	public boolean addAll(Collection<? extends T> collection) {
		Object[] collectionArray = collection.toArray();
		int collectionArraySize = collectionArray.length;
		if (collectionArraySize != 0) {
			ensureCapacity(size + collectionArraySize);
			System.arraycopy(collectionArray, 0, array, size, collectionArraySize);
			size += collectionArraySize;
			return true;
		} else {
			return false;
		}
	}

	public boolean addAll(int index, Collection<? extends T> collection) {
		Object[] collectionArray = collection.toArray();
		int collectionArraySize = collectionArray.length;
		if (collectionArraySize != 0) {
			ensureCapacity(size + collectionArraySize);
			int moveIndex = size - index;
			if (moveIndex > 0) {
				System.arraycopy(array, index, array, index + collectionArraySize, moveIndex);
			}
			System.arraycopy(collectionArray, 0, array, index, collectionArraySize);
			size += collectionArraySize;
			return true;
		} else {
			return false;
		}
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			array[i] = null;
		}
		size = 0;
	}

	public boolean contains(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++) {
				if (array[i] == null) {
					return true;
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (array[i].equals(o)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean containsAll(Collection<?> collection) {
		Object[] collArray = collection.toArray();
		for (int i = 0; i < collArray.length; i++) {
			if (collArray[i] == null) {
				for (int j = 0; j < size; j++) {
					if (array[i] == null) {
						return true;
					}
				}
			} else {
				for (int j = 0; j < size; j++) {
					for (Object o : array) {
						if (array[i].equals(o)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public T get(int index) {
		T t = (T) array[index];
		return t;
	}

	public int indexOf(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++) {
				if (array[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (o.equals(array[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int lastIndexOf(Object o) {
		if (o == null) {
			for (int i = size - 1; i > 0; i--) {
				if (array[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = size - 1; i > 0; i--) {
				if (o.equals(array[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	public boolean remove(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++) {
				if (array[i] == null) {
					Object[] newArray = new Object[size - 1];
					System.arraycopy(array, 0, newArray, 0, i);
					System.arraycopy(array, i + 1, newArray, i, size - i - 1);
					this.array = newArray;
					size--;
					return true;
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (o.equals(array[i])) {
					Object[] newArray = new Object[size - 1];
					System.arraycopy(array, 0, newArray, 0, i);
					System.arraycopy(array, i + 1, newArray, i, size - i - 1);
					this.array = newArray;
					size--;
					return true;
				}
			}
		}
		return false;
	}

	public T remove(int index) {

		T oldValue = (T) array[index];

		Object[] newArray = new Object[size - 1];
		System.arraycopy(array, 0, newArray, 0, index);
		System.arraycopy(array, index + 1, newArray, index, size - index - 1);
		this.array = newArray;
		size--;
		return oldValue;
	}

	public boolean removeAll(Collection<?> collection) {
		for (int i = 0; i < size; i++) {
			if (collection.contains(array[i])) {
				remove(i);
				size--;
			}
		}
		return true;
	}

	public boolean retainAll(Collection<?> collection) {
		Object[] newArray = new Object[size];
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (collection.contains(array[i])) {
				newArray[index] = array[i];
				index++;
			}
		}
		array = newArray;
		return true;
	}

	public T set(int index, T t) {
		T oldValue = (T) array[index];
		array[index] = t;
		return oldValue;
	}

	public int size() {
		return size;
	}

	public T[] toArray() {
		Object[] newArray = new Object[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[i];
		}
		return (T[]) newArray;
	}

	public <T> T[] toArray(T[] arr) {
		for (int i = 0; i < size; i++) {
			arr[i] = (T) array[i];
		}
		return arr;
	}

	public List subList(int a, int b) {
		throw new UnsupportedOperationException();
	}

	public Iterator iterator() {
		throw new UnsupportedOperationException();
	}

	public ListIterator listIterator() {
		throw new UnsupportedOperationException();
	}

	public ListIterator listIterator(int a) {
		throw new UnsupportedOperationException();
	}
}
