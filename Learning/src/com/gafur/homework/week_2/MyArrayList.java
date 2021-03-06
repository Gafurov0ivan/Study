package com.gafur.homework.week_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Realisation of array list
 *
 * @author igafurov
 * @since 15.10.2016
 */
public class MyArrayList<T> implements List<T> {
    private static final Object[] DEFAULTCAPACITY = {};
    private static final Object[] EMPTY = {};
    private int size;
    private Object[] array;

    public MyArrayList() {
        array = DEFAULTCAPACITY;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            array = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            array = EMPTY;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public void trimToSize() {
        Object[] newArray = new Object[size * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        size = array.length;
    }

    private void ensureCapacity(int minCapacity) {
        if (size == 0) {
            minCapacity = Math.max(0, minCapacity);
        }
        if (minCapacity - size > 0) {
            Object[] newArray = new Object[minCapacity];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
            size = array.length;
        }
    }

    public boolean add(T t) {
        ensureCapacity(size + 1);
        array[size - 1] = t;
        return true;
    }

    public void add(int index, T t) {
        ensureCapacity(size + 1);
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index, newArray, index + 1, size - index - 1);
        array = newArray;
        array[index] = t;
    }

    public boolean addAll(Collection<? extends T> collection) {
        Object[] collectionArray = collection.toArray();
        int collectionArraySize = collectionArray.length;
        if (collectionArraySize != 0) {
            ensureCapacity(size + collectionArraySize);
            System.arraycopy(collectionArray, 0, array, size - collectionArraySize, collectionArraySize);
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
            Object[] newArray = new Object[size];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(collectionArray, 0, newArray, index, collectionArraySize);
            System.arraycopy(array, index, newArray, index + collectionArraySize, size - collectionArraySize - index);
            array = newArray;
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
        if (array == null) {
            return false;
        }
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(array[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        int containsCount = 0;
        Object[] collArray = collection.toArray();
        for (int i = 0; i < collArray.length; i++) {
            for (int j = 0; j < size; j++) {
                if (collArray[i].equals(array[j]) || (collArray[i] == null && array[j] == null)) {
                    containsCount++;
                }
            }
        }
        return containsCount == collArray.length ? true : false;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Uncorrect index");
        }
        return (T) array[index];
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
        return size == 0;
    }

    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
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
                    System.arraycopy(array, i + 1, newArray, i, array.length - i - 1);
                    array = newArray;
                    size = array.length;
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(array[i])) {
                    Object[] newArray = new Object[size - 1];
                    System.arraycopy(array, 0, newArray, 0, i);
                    System.arraycopy(array, i + 1, newArray, i, array.length - i - 1);
                    array = newArray;
                    size = array.length;
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
        array = newArray;
        size--;
        return oldValue;
    }

    public boolean removeAll(Collection<?> collection) {
        if (collection == null) {
            return false;
        }
        if (collection.size() == 0) {
            return false;
        }
        Object[] newArray = array;
        for (int i = 0; i < size; i++) {
            if ((collection.contains(newArray[i])) || (collection.contains(null) && newArray[i] == null)) {
                Object obj = newArray[i];
                remove(obj);
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public boolean retainAll(Collection<?> collection) {
        if (collection == null) {
            return false;
        }
        if (collection.size() == 0) {
            array = EMPTY;
            return true;
        }
        Object[] newArray = array;
        array = EMPTY;
        size = 0;
        for (int i = 0; i < newArray.length; i++) {
            if ((collection.contains(newArray[i])) || ((collection.contains(null) && newArray[i] == null))) {
                add((T) newArray[i]);
            }
        }
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

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        Object[] newArray = new Object[size];
        newArray = array;
        return (T[]) newArray;
    }

    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] arr) {
        if (arr.length < size) {
            Object[] newArray = new Object[size];
            arr = (T[]) newArray;
            return arr;
        }
        System.arraycopy(array, 0, arr, 0, size);
        if (arr.length > size)
            arr[size] = null;
        return arr;
    }

    public List subList(int a, int b) {
        if (a > size || b > size) {
            throw new IndexOutOfBoundsException();
        }
        List<T> list = new MyArrayList<>();
        for (int i = a; i < b; i++) {
            T obj = get(i);
            list.add(obj);
        }
        return list;
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
