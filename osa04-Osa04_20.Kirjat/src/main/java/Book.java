/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Big City Boy
 */
public class Book {
    private String name;
    private int page;
    private int year;
    
    public Book(String name, int page, int year){
        this.name = name;
        this.page = page;
        this.year = year;
    }
    
    public String getNimi() {
        return name;
    }
    
    public String toString() {
        return this.name + ", " + this.page + " sivua, " + this.year;
    }
}
