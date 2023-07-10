package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class
L2_StreamCreation {
    public static void main(String[] args) {
        List list = List.of("one" , "two" , "three");

        //Sequential Stream ka 1ku p mha 1ku lod
        Stream stream = list.stream();

        //Parallel Stream
        stream = list.parallelStream();

        // Build Stream
        var a = IntStream.of(1,2,3);
        var b = IntStream.range(1,3);
        var c = IntStream.concat(a , b);

        // from array
        int [] array = {1,2,4,5,6,7,8};
        Arrays.stream(array).forEach(System.out::println);

        // from collection
        Collection<String> col = Arrays.asList("Hello", "Java",
                "I am a developer");
        col.stream().forEach(System.out::println);

        /* from File
        public static void main(String[] args) throws IOException {
        Files.lines(Paths.of("T2FromFiles.txt"))
        .forEach(System.out::println);}
         */

        //Int Stream
        IntStream.range(1,10).forEach(System.out::println);
        //RangeClosed ka a pyae u   1 to 10
        IntStream.rangeClosed(1,10).forEach(System.out::println);

        // LongStream
        LongStream.range(1, 10).forEach(System.out::println);

        // DoubleStream
        DoubleStream.of(19.001, 12.201,11,111).forEach(System.out::println);

        //Generate
        var v = IntStream.generate( () -> (int) (Math.random() * 100) );
        //limit ma htr yin endless pyit
        v.limit(10).forEach(m -> System.out.println(m));

        //Iterate
        var charStream = Stream.iterate('a' , ch -> (char)(ch +1));
        charStream.limit(5).forEach(System.out::println);

    }
}
