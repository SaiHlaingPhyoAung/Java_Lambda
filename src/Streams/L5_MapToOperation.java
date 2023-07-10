package Streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class L5_MapToOperation {
    public static void main(String[] args) {
        var list = List.of("1" , "2" , "3" , "4" , "5");
        list.stream().map(a -> Integer.parseInt(a)*2 ).toList();


        //var products = Files.lines(Path.of("product .txt")).map(line -> new Product(line));

        //Second way (Method Reference)
        //var products = Files.lines(Path.of("product.txt")).map(Product::new).toList()

        //IntStream ကို sum , total လိုချင်လို့သုံး
        //mapToInt သုံးတဲ့ကောင်ကအမြဲ Int ဖြစ်ဖို့လို
        //var result = products.stream().mapToInt(p -> p.getPrice()).summaryStatistics();
        //result.getCount()
        //result.getSum()
        //result.getMin()
    }
}
