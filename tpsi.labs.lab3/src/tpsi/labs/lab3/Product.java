/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.labs.lab3;

/**
 *
 * @author naeri
 */
public class Product {
    private String id;
    private String Name;
    private double price;
    private String category;
    public Product(String idd, String Namee, double pricee,String categoryy) {

        this.id = idd;
        this.Name = Namee;
        this.price = pricee;
        this.category = categoryy;

    }
    @Override
    public String toString() {
        return id + " " + Name + " " + price + " " + category;
    }
}
