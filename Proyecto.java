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
public class Proyecto {

    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        v.setVisible(true);
        v.col.addTxt();
        /*Document d1 = new Document("a","b","c","d",1);
        Node n1 = new Node(d1);
        n1.setNext(new Node(new Document("e","f","g","h",2)));
        System.out.println(n1.getValue().getName());c
        v.col.lista.add(new Document("a","b","c","d"));*/
        System.out.println(v.col.lista.head.value.getName()+" "+v.col.lista.head.value.getAutor()
        +" "+v.col.lista.head.value.getEditorial()+" "+v.col.lista.head.value.getSection());
        System.out.println(v.col.lista.head.next.value.getName()+" "+v.col.lista.head.next.value.getAutor()
        +" "+v.col.lista.head.next.value.getEditorial()+" "+v.col.lista.head.next.value.getSection());
        System.out.println(v.col.lista.head.next.next.value.getName()+" "+v.col.lista.head.next.next.value.getAutor()
        +" "+v.col.lista.head.next.next.value.getEditorial()+" "+v.col.lista.head.next.next.value.getSection());
    }
    
}
