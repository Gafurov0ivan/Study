package com.gafur.homework.week_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Realisation of linked list
 *
 * @author igafurov
 * @since 15.10.2016
 */
public class MyLinkedList<T> implements List<T> {
    private static int size = 0;
    transient Node<T> first;
    transient Node<T> last;

    public MyLinkedList() {
    }

    public MyLinkedList(Collection<? extends T> collection) {
        this();
        addAll(collection);
    }

    public int size() {

        return size;
    }

    public boolean isEmpty() {

        return false;
    }

    public boolean contains(Object o) {

        return false;
    }

    public Iterator<T> iterator() {

        return null;
    }

    public Object[] toArray() {

        return null;
    }

    public <T> T[] toArray(T[] a) {

        return null;
    }

    public boolean add(T e) {

        return false;
    }

    public boolean remove(Object o) {

        return false;
    }

    public boolean containsAll(Collection<?> c) {

        return false;
    }

    public boolean addAll(Collection<? extends T> c) {

        return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {

        return false;
    }

    public boolean removeAll(Collection<?> c) {

        return false;
    }

    public boolean retainAll(Collection<?> c) {

        return false;
    }

    public void clear() {

    }

    public T get(int index) {

        return null;
    }

    public T set(int index, T element) {

        return null;
    }

    public void add(int index, T element) {

    }

    public T remove(int index) {

        return null;
    }

    public int indexOf(Object o) {

        return 0;
    }

    public int lastIndexOf(Object o) {

        return 0;
    }

    public ListIterator<T> listIterator() {

        return null;
    }

    public ListIterator<T> listIterator(int index) {

        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {

        return null;
    }

    private static class Node<T> {
        T item;
        Node<T> prev;
        Node<T> next;

        Node(Node<T> prev, T element, Node<T> next) {
            this.prev = prev;
            this.item = element;
            this.next = next;
        }

    }

}
