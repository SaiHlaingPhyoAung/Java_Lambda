package Streams;

import java.util.stream.IntStream;

public class L10_Terminal_CheckOperation {
    public static void main(String[] args) {
        /*
        allMatch    Stream အတွင်းရှိ Data များ"အားလုံး"သည် parameter Predicate နှင့်ကိုက်ညီမှူ့ ရှိမရှိစစ်ဆေးပေးနိုင်
        anyMatch    Stream အတွင်းရှိ Data များ"တစ်ခုခု"သည် parameter Predicate နှင့်ကိုက်ညီမှူ့ ရှိမရှိစစ်ဆေးပေးနိုင်
        nonMatch    Stream အတွင်းရှိ Data များသည် parameter Predicate နှင့်ကိုက်ညီမှူ့ မရှိကြောင်းစစ်ဆေးပေးနိုင်

         */

        //အကုန်မှန်မှ true
        IntStream.rangeClosed(1,9).allMatch(a -> a / 5 ==0);

        //တစ်ခုခုမှန်ရင် true
        IntStream.rangeClosed(1,9).anyMatch(a -> a / 5 ==0);

        //တစ်ခုမှမတူဘူးဆို true
        IntStream.rangeClosed(5,9).noneMatch(a -> a / 5 == 0);
    }
}
