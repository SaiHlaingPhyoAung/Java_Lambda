package Streams;

import java.util.stream.IntStream;

public class L9_Terminal_Iteration {
    public static void main(String[] args) {

        /*
        forEach         Stream အတွင်းရှိ Data များအားတစ်ခုစီအသုံးပြုနိုင်
        forEachOrdered  Parallel Stream အတွင်းရှိ Data များအားအစီအစဥ်အလိုက်တစ်ခုစီ အသုံးပြုနိုင်
         */

        IntStream.rangeClosed(1,10).forEach(System.out::println);

        IntStream.rangeClosed(1,10).forEachOrdered(System.out::println);

        //parallel Stream မှာ loop ပတ်ရင်အရင်ဝင်တဲ့ကောင်ကနေပြလို့ အစဥ်လိုက်ဖြစ်ချင်ရင် forEachOrdered ကိုသုံး

        IntStream.rangeClosed(1,10).parallel().forEach(System.out::println);

    }
}
