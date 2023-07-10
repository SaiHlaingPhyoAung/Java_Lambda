package Streams;

import java.util.List;

/*
  Streams API ka internal iteration ko support lod
  Streams API ka parallel processing ko lod loh ya
  Lambda ka parallel processing mr br lod mr lal so tk Function ko
  hte pay tk expressions

    Streams is not only for Parallel processing
    Streams API ဟာ Streams Object ေတွကိုအေြခခံပြီး Sequential ေကာ
    Parallel ပါ အလွယ်တကူေဆာင်ရွက်နိုင်ေအာင်ြပင်ဆင်ထားပါတယ

  Types Of Streams
  * Stream <T>      (Generics Stream)
  * IntStream
  * LongStream
  * DoubleStream

  Stream Operations
  Stream    >   Intermediate    >   Terminal
  Creation      Operations          Operations


 */
public class L1 {
    public static void main(String[] args) {

        //Before Streams
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        var total = 0;
        for (int element : list ){
            total += element;
            //total = 45
        }

        //list to streams
        var stream = list.stream();

        var intStream = stream.mapToInt(a -> a);
        intStream.sum();

        list.stream().mapToInt(a -> a).sum();
        //list > stream > mapToInt > sum


    }
}
