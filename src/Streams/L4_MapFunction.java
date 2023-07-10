package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/*
                map         >   Stream<T>
                mapToInt    >   IntStream
Stream<T>       mapToLong   >   LongStream
                mapToDouble >   DoubleStream
 */

//Map က Data တစ်မျိုုးကနေ တခြား Data ၁မျိုးကိုပြောင်းနိုင်

public class  L4_MapFunction {
    public static void main(String[] args) throws IOException {

        var list = List.of("1" , "2" , "3" , "4" , "5");
        //ListOfString > Stream > Integer
        list.stream().map(a -> Integer.parseInt(a) * 2).toList();

        var product = new Product("test" , 100);

        //txt file က data ကိုယူ
        var stream = Files.lines(Path.of("Streams/product.txt"));
        //Stream<String>

        var streamArray = stream.map( a -> a.split("\t"));
        //Stream<String[]>

        //short >
        var productStream = streamArray.map(a->new Product(a[0], Integer.parseInt(a[1])));
        productStream.toList();
        //Stream<Product>

        /*
        Long Form
        var productStream = streamArray.map(a -> {
            String name = a[0];
            int price = Integer.parseInt(a[1]);
            return new Product(name , price);
        });*/

/*
        var products =Files.lines(Path.of("Stream.product.txt")).
                map(line -> line.split("\t")).
                map(array -> new Product(array[0] , Integer.parseInt(
                        array[1]
                ))).toList();*/
    }
}
