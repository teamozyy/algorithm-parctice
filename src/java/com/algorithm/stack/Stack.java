package com.algorithm.stack;

/**
 * Created by hbxie on 2020/10/19.
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
