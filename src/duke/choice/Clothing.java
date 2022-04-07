/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Home
 */
public class Clothing implements Comparable<Clothing>{

    private String Description;
    private double Price;
    private String Size = "M";

    public final static double MIN_PRICE = 10;
    public final static double TAX_RATE = 0.2;

    public Clothing(String Description, double Price, String aSize) {
        this.Description = Description;
        this.Price = Price;
        Size = aSize;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrice() {
        return Price + (Price * TAX_RATE);
    }

    public void setPrice(double Price) {

        this.Price = (Price > MIN_PRICE) ? Price : MIN_PRICE;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    @Override
    public String toString() {
        return getDescription() + "," + getSize() + "," + getPrice();
        
    }
    
    @Override
    public int compareTo(Clothing c){
        return this.Description.compareTo(c.Description);
    }
}
