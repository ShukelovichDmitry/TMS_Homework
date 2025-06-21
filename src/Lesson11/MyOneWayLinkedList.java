package Lesson11;

import java.util.NoSuchElementException;

public class MyOneWayLinkedList<E> {
    private int size;
    private MyLinkedListNode<E> first;
    private MyLinkedListNode<E> last;

    public MyOneWayLinkedList() {
        size = 0;
        first = last = null;
    }

    private class MyLinkedListNode<E> {
        private E value;
        private MyLinkedListNode<E> next;

        public MyLinkedListNode(E value) {
            this.value = value;
        }

    }

    public E getFirst() {
        return first.value;
    }

    public E getLast() {
        return last.value;
    }

    public int getSize() {
        return size;
    }

    public void add(E value) {
        MyLinkedListNode<E> newNode = new MyLinkedListNode<E>(value);
        if (first == null) first = newNode;
        if (last != null) last.next = newNode;
        last = newNode;
        size++;
    }

    public E remove(int i) {
        if (first == null || i >= size)
            throw new NoSuchElementException();
        if (i == 0) {
            E element = first.value;
            first.value = null;
            first = first.next;
            if (size == 1) last = null;
            size--;
            return element;
        }
        MyLinkedListNode<E> prev = first;
        MyLinkedListNode<E> current = first.next;
        while (i-- > 1) {
            prev = current;
            current = current.next;
        }
        E element = current.value;
        prev.next = current.next;
        current.value = null;
        size--;
        return element;
    }

    public E get(int i) {
        if (i >= size)
            throw new NoSuchElementException();
        MyLinkedListNode<E> current = first;
        while (i-- > 0) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        MyLinkedListNode<E> current = first;
        while (current != null) {
            sb.append(current.value.toString());
            current = current.next;
            if(current != null) sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }
}
