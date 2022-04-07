/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

/**
 *
 * @author Home
 */
public class ItemList implements Handler {

    public Clothing[] items;

    public ItemList(Clothing[] items) {
        this.items = items;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);
        res.headers().put("Content Type ", " Text/Plain; charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for (Clothing item : items) {
          result.append(item).append("/a");

        }
        res.send(items);
    }
           
 }


