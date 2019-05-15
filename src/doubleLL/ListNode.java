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
public class ListNode {
    private int elemen;
    private ListNode next;
    private ListNode prev;

    public ListNode() {
        
    }

    public ListNode(int elemen) {
        this.elemen = elemen;
    }

    public void setElemen(int elemen) {
        this.elemen = elemen;
    }

    public int getElemen() {
        return elemen;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getPrev() {
        return prev;
    }
}
