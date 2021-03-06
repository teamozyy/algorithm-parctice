package com.algorithm.stack;

import com.algorithm.array.Array2;

/**
 * Created by hbxie on 2020/10/19.
 */
public class ArrayStack<E> implements Stack<E> {
    private Array2<E> array;

    public ArrayStack(int capacity) {
            array = new Array2<>(capacity);
    }

    public ArrayStack() {
        array = new Array2<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');

        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }

        res.append("] top");

        return res.toString();
    }
}
