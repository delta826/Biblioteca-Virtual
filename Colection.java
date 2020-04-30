/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Colection {
    
    Vector vPrincipal;
    DoublyLinkedList lista;
    
    public Colection(){
        this.lista = new DoublyLinkedList();
        this.vPrincipal = new Vector();
    }
    
    public void addTxt(){
        //Crear documentos leyendo el archivo txt y meterlos a la lista
        File fichero = new File("biblioteca.txt");
        Scanner s = null;
        try {
            s = new Scanner(fichero);

            while (s.hasNextLine()) {
                String datos=s.nextLine();
                String [] partes = datos.split(" ");
                Document nodo = new Document(partes[0], partes[1], partes[2], partes[3]);
                lista.add(nodo);
            }
        } catch (Exception ex) {
                System.out.println( ex.getMessage());
        } finally {
            try {
                if (s != null)
                    s.close();
            } catch (Exception ex2) {
                System.out.println(ex2.getMessage());
            }
        }
    }
    
    public Boolean addNewDocument(Document d){
		//Crear documento con los parametros y añadirlo a la lista
		//Debe retornar lo que retorna la función add de la lista enlazada
		Boolean b = this.lista.add(d);

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			File file = new File("biblioteca.txt");

			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(d.name+" "+d.autor+" "+d.editorial+" "+d.section+"\n");
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//Cierra instancias de FileWriter y BufferedWriter
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return b;
    }
    
    public void deleteDocument(){
        //Quitar documento de la lista y borrar esos datos del archivo de texto
    }
    
}
