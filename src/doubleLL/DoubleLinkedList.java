/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleLL;

/**
 *
 * @author JY
 */
public class DoubleLinkedList {

    private ListNode head;
    private int size;

    public DoubleLinkedList() {
        head = null;
    }

    public void addFirst(int add) {
        ListNode baru = new ListNode(add);
        if (isEmpty()) {
            head = baru;
            head.setNext(head);
            head.setPrev(head);
        } else {
            baru.setNext(head);
            baru.setPrev(head.getPrev());
            head.getPrev().setNext(baru);
            head.setPrev(baru);
            head = baru;
        }
        size++;
    }

    public void addLast(int add) {
        ListNode baru = new ListNode(add);
        if (isEmpty()) {
            head = baru;
            head.setNext(head);
            head.setPrev(head);
        } else {
            baru.setNext(head);
            baru.setPrev(head.getPrev());
            head.getPrev().setNext(baru);
            head.setPrev(baru);
        }
        size++;
    }

    public int removeLast() {
        ListNode bantu = head.getPrev();
        if (!isEmpty()) {
            if (size == 1) {
                head = null;
            } else {
                head.setPrev(bantu.getPrev());
                bantu.getPrev().setNext(head);
            }
            size--;
        }
        return bantu.getElemen();
    }

    public void removeFirst() {
        ListNode bantu = head;
        if (!isEmpty()) {
            if (size == 1) {
                head = null;
            } else {
                head = head.getNext();
                head.setPrev(bantu.getPrev());
                bantu.getPrev().setNext(head);
            }
            size--;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public String toShow() {
        String isi = "[";
        if (!isEmpty()) {
            ListNode pointer = head;
            isi = isi + pointer.getElemen();
            pointer = pointer.getNext();
            while (pointer != head) {
                isi = isi + ", " + pointer.getElemen();
                pointer = pointer.getNext();
            }
        }
        isi = isi + "]";
        return isi;
    }
}
