/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Home
 */
public class Customer {

    private String name;
    private String Size;

    private Clothing[] items;

    public Customer(String name, int measurment) {
        this.name = name;
        setSize(measurment);
    }
    
    

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
     double Total = 0.0;
  //   double Tax = 0.2;
        for (Clothing item : items) {
         //   if (C1.getSize().equals(item.getSize())) {

                Total = Total + item.getPrice();
                //System.out.println("Item: " + item.getDescription() + "," + item.getPrice() + "," + item.getSize());

 //               Total = Total + Total * Tax;

//                if (Total > 15) {
//                    break;
//                }
        //  }

    }
        return Total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                Size = ("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }
}
