/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import doubleLL.DoubleLinkedList;

/**
 *
 * @author JY
 */
public class stackdinamis {
    private DoubleLinkedList stack;

    public stackdinamis() {
        stack = new DoubleLinkedList();
    }

    public void push(int data) {
        stack.addLast(data);
    }

    public int pop() {
        return stack.removeLast();
    }

    @Override
    public String toString() {
        return stack.toShow();
    }
}