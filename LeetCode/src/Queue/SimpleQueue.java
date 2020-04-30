package Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Chandler
 * @Description: 队列的简单实现，包含入队和出队两种操作
 * @Date: 2020/4/30 16:04
 */
public class SimpleQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        System.out.println(q.toString());

    }
}


class MyQueue {
    //存储元素
    private List<Integer> data;
    //指示初始位置的指针
    private int p_start;

    //构造器
    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    //入队
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    //获取队首的元素
    public int Front() {
        return data.get(p_start);
    }

    public boolean isEmpty() {
        return p_start >= data.size();
    }
}