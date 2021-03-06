package com.algorithm.stack;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hbxie on 2020/10/22.
 * 使用队列实现栈
 */
public class StackByQueue {
    // 假设：入队的一端是栈顶
    private Queue<Integer> queue;

    public StackByQueue() {
        queue = new LinkedList<>();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public void push(int e) {
        // 入队的一端是栈顶（入栈操作）
        queue.add(e);
    }

    public int pop() {
        Queue<Integer> queue2 = new LinkedList<>();

        // 除了最后一个元素，将 queue 中的所有元素放入 queue2
        while (queue.size() > 1) {
            queue2.add(queue.remove());
        }

        // queue 中剩下的最后一个元素就是“栈顶”元素
        int topE = queue.remove();

        // 此时 queue2 是整个数据结构存储的所有其他数据，赋值给 queue
        queue = queue2;

        // 返回“栈顶元素”
        return topE;
    }

    public int top() {
        int ret = pop();

        push(ret);

        return ret;
    }

    @Override
    public String toString(){
        return queue.toString();
    }

    public static void main(String[] args) {
        StackByQueue stack = new StackByQueue();

        for(int i = 0 ; i < 5 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
