package Streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class  L6_PeekOperations {
    //Peek - Stream ထဲက Element တွေကိုယူပြီးအသုံးပြုနိုင်သော Intermediate Operation
    //Stream ထဲက Element တွေကိုယူသုံးပြီး နောက် Element ထဲပြန်ထည်ပေးနိုင်

    public static void main(String[] args) {
        //var product = Files.lines(Path.of("product.txt")).map(Product::new).toList();

        /* var p2 = product.stream().map(p -> {
                အရင်ဈေးကို 100 ပေါင်း
                var price = p.getPrice() + 100;
                p.setPrice(price);
                return p;
                }).toList();
         */

        /*
        Using Peek
        return ပြန်စရာမလို
        var p3 = product.stream().peek(p -> {
            var price = p.getPrice() + 100;
            p.setPrice(price);
            }).toList();
         */
    }
}
