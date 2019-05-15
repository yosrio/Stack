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
public class queuestatis {

    private int[] elemen;
    private int size;
    private int rear;
    private int front;

    public queuestatis() {

    }

    public queuestatis(int size) {
        elemen = new int[size];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void dequeue() {
        front++;
        if (front == elemen.length) {
            front = 0;
        }
        size--;
    }

    public boolean enqueue(int data) {
        if (size == 0) {
            elemen[rear] = data;
            rear++;
            size++;
            return true;

        } else {
            if (rear == this.elemen.length) {
                rear = 0;
            }
            if (rear != front) {
                elemen[rear] = data;
                rear++;
                size++;
                return true;
            } else {
                return false;
            }
        }

    }

    @Override
    public String toString() {
        String info = "[";
        int indeks = front;
        info += elemen[indeks] + " ";
        indeks++;
        while (indeks != rear) {
            if (indeks == elemen.length) {
                indeks = 0;
                info += elemen[indeks] + " ";
                indeks++;
            } else {
                info += elemen[indeks] + " ";
                indeks++;
            }
        }
        return info + "]";
    }
}
