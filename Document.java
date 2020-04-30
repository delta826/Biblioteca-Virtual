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
public class Document {
    public String name;
    public String autor;
    public String editorial;
    public String section;
    public int total;
    public int disp;
    public boolean available;

    public Document(String name, String autor, String editorial, String section) {
        this.name = name;
        this.autor = autor;
        this.editorial = editorial;
        this.section = section;
        this.total = 1;
        this.disp = 1;
        this.available = true;
    }

    
    public boolean prestar(){
        boolean prestado = false;
        if(isAvailable()){
            this.disp--;
            prestado = true;
        }
        if(disp==0) this.available = false;
        return prestado;
    }
    
    public boolean devolver(){
        boolean devuelto = false;
        if(disp!=total){
            this.disp++;
            devuelto = true;
            if(!isAvailable()) this.available = true;
        }
        return devuelto;
    }
    
    
    //Getters
    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getSection() {
        return section;
    }

    public int getTotal() {
        return total;
    }

    public int getDisp() {
        return disp;
    }

    public boolean isAvailable() {
        return available;
    }


    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setDisp(int disp) {
        this.disp = disp;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
}
