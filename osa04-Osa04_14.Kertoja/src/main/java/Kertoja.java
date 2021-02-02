/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Big City Boy
 */
public class Kertoja {
    
    private int num;
    public Kertoja(int luku){
        this.num = luku;
    }
    
    public int kerro(int luku) {
        return this.num*luku;
    }
}
