package com.algorithm.queue;

/**
 * Created by hbxie on 2020/10/22.
 */
public interface Queue<E> {
    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();
}
