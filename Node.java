/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Lenovo
 */
public class Node{
    public Document value;
    public Node next;
    public Node prev;
 
    //Constructor
    public Node(Document value) {
        this.value = value;
    }
 
    //Getters y Setters
    public Document getValue() {
        return value;
    }
    public void setValue(Document value) {
        this.value = value;
    }
    
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
 
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }

}
