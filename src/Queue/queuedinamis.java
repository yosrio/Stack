/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import doubleLL.DoubleLinkedList;

/**
 *
 * @author JY
 */
public class queuedinamis {
    private DoubleLinkedList queue;

    public queuedinamis() {
        queue = new DoubleLinkedList();
    }
    
    public void dequeue(){
        queue.removeFirst();
    }
    
    public void enqueue(int data){
        queue.addLast(data);
    }
    
    @Override
    public String toString(){
        return queue.toShow();
    }
}
