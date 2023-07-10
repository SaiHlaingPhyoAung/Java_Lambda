package Streams;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class L11_StreamsToArray {
    public static void main(String[] args) {
        /*
        ဒီလိုခေါ်ရင် object ထွက်လို့ array နဲ့ခေါ်ရင် error တက်
        var array1 = Files.lines(Path.of("product.txt")).
                map(Product::new).toArray();
         Product p = array1[0];

         Correct
         var array2 = Files.lines(Path.of("product.txt")).
                map(Product::new).toArray(Product[] :: new);  <
         Product p = array2[0];

        output : Product {name : Coke , price : 500}


         */
    }
}
