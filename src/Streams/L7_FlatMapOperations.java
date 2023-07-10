package Streams;

import java.util.List;
import java.util.stream.Stream;

public class L7_FlatMapOperations {
    // flatMap - Collection Stream များအား Element Stream အဖြစ်ပြောင်းပေးသည်။

    public static void main(String[] args) {

        Stream.of(
                List.of(1,2),
                List.of(3,4)
        ).flatMap(list -> list.stream()).toList();
    // result >  1,2,3,4

        //Random Num 10 လုံးထုတ်
        Stream.generate(Math::random).map(d -> (int)(d *100)).limit(10).toList();

        var list = List.of(1,2,3,4);
        var random = list.stream().flatMap(a -> Stream.generate(Math::random).limit(a)).
                map(a -> (int)(a * 100)).toList();
        // 1,2,3,4 ရဲ့ sum က 10 ဖြစ်လို့ output က random num 10လုံးထွက်

    }
}
