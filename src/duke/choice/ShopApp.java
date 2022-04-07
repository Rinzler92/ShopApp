/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import java.util.Arrays;

/**
 *
 * @author Home
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  double Tax = 0.2;
        // double Total = 0.0;
        // StringBuilder result = new StringBuilder();

        // TODO code application logic here
        System.out.println("Welcome To Duke Choice Shop!");

        //  Customer C1 = new Customer("Pinky", 14);
        // C1.setName("Pinky");
        // C1.setSize("S");
        //System.out.println("Min Price " + Clothing.MIN_PRICE);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, item3, item4};

        try {
            ItemList list = new ItemList(items);
            //demo8
            Routing routing = Routing.builder()
                    .get("/items", list).build();
             //demo8
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8080).build();
             //demo8
            WebServer ws = WebServer.create(config, routing);
             //demo8
            ws.start();
             //demo8
        } catch (UnknownHostException ex) {
          //  ex.printStackTrace();
        }

    }

}
//        System.out.println("Customer Item1: " + item1.Description + "," + item1.Price + "," + item1.Size);
// Total = (item2.Price * 2 + item1.Price) * (1 + Tax);
//        int measurement = 8;
//
//        C1.addItems(items);
//
//        //C1.setSize(measurement);
//        System.out.println("Customer is: " + C1.getName() + "," + C1.getSize() + "," + C1.getTotalClothingCost());
//
//        for (Clothing item : C1.getItems()) {
//            // System.out.println("items " + item.getDescription() + "," + item.getSize() + "," + item.getPrice());
//            System.out.println("Item Output " + item);
//        }
//        int average = 0;
//        int count = 0;
//        // practice 7.1
//
//        for (Clothing item : C1.getItems()) {
//            if (item.getSize().equals("L")) {
//                count++;
//                average += item.getPrice();
//            }
//        }
//        try {
//            average = (count == 0) ? 0 : average / count;
//            average /= count;
//            //average = average / count;
//            System.out.println("Average Price " + average + ", Count " + count);
//        } catch (ArithmeticException e) {
//            System.out.println("Dont Divide By 0");
//        }
//
//        Arrays.sort(C1.getItems());
//        for (Clothing item : C1.getItems()) {
//            // System.out.println("items " + item.getDescription() + "," + item.getSize() + "," + item.getPrice());
//            System.out.println("Item Output " + item);
//
//        }
//    }
//}
