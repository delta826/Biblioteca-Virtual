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
public class DoublyLinkedList {
    public Node tail;
    public Node head;
    public int tam;
    
    DoublyLinkedList(){
        tail=null;
        head=null;
        tam=0;
    }
    
    public Boolean add( Document value) {
		Boolean nuevo = true;
		String name = value.getName();
		boolean flag=false;
		if(tam==0) {
			Node aux = new Node(value);
			this.head=aux;
			this.tail=head;
			tam++;

		}else{
			Node aux2 = new Node(value);
				tail.next=aux2;
				aux2.prev=tail;
				tail=aux2;
				tam++;
		}

		//imprimir();
		return nuevo;
    }

    public void delete(String Nombre){
        Boolean vacia = false;
	if(tam==0) {
            vacia = true;
            System.out.println("La biblioteca está vacía.");
	}else {
            Node aux = head;
            while(Nombre.compareToIgnoreCase(aux.getValue().name)>0 && aux.next!=null) {
                    aux=aux.next;
            }
            if(Nombre.compareToIgnoreCase(aux.getValue().name)==0) {            
                    if(aux.value.disp>1) {
                            System.out.println("Existe más de un elemento, ¿desea eliminar toda la información del documento?");
                    }
            }else{
		System.out.println("El documento no se encuentra en la lista.");   				
            }
        }
    }
	
	public void search(String Nombre){
		if(tam==0) {
			System.out.println("La biblioteca está vacía.");
	}else {
		Node aux = head;
		while(Nombre.compareToIgnoreCase(aux.getValue().name)>0 && aux.next!=null) {
			aux=aux.next;
		}
		if(Nombre.compareToIgnoreCase(aux.getValue().name)==0) {
			System.out.println("El documento se encuentra en la posición "+tam+" de la lista.");
	}else{
		System.out.println("El documento no se encuentra en la lista.");   				
	   			}
	   		}
	   	}
	    
    
    

    /*
    public void addLast(Document value) {
        Node node = new Node(value);
        if (tail == null && head == null) {
            tail = node;
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
    }
 
    public void addFirst(Document value) {
        Node node = new Node(value);
        if (tail == null && head == null) {
            tail = node;
            head = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
    }*/

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
}
