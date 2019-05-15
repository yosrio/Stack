/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author admin
 */
public class stackstatis {

    private int[] elemen;
    private int front;
    private int size;

    public stackstatis() {

    }

    public stackstatis(int size) {
        elemen = new int[size];
        front = 0;
        this.size = 0;
    }

    public boolean push(int data) {
        if (isFull()) {
            System.out.println("Data Sudah Penuh!");
            return false;
        } else {
            elemen[front] = data;
            front++;
            size++;
            return true;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Data Kosong!");
        } else {
            elemen[elemen.length - 1] = 0;
            front--;
            size--;
        }
    }

    public boolean isEmpty() {
        if (front < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (front == elemen.length) {
            return true;
        } else {
            return false;
        }
    }

    public void toShow() {
        for (int i = 0; i < front; i++) {
            System.out.print(elemen[i] + " ");
        }
    }
}
