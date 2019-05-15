/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author JY
 */
public class MainDinamis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        queuedinamis queue = new queuedinamis();
        queue.enqueue(43);
        queue.enqueue(64);
        queue.enqueue(16);
        queue.enqueue(37);
        queue.enqueue(62);
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
    }
    
}
