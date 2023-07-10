package Streams;

import java.util.*;
import java.util.stream.Stream;

public class L3_IntermediateStream {
    //Stream object yk method return type ka Stream pyit ny tr ko Intermediate Operation loh kaw
    //***Stream hte ka Data twy ka tone yin kone***

    /*
    filter      Stream အတွင်းရှိ Data များအား စစ်ထုတ်နိုင်သည်
    distinct    တူညီေသာ Data များအား တစ်ခုတည်းြဖစ်ေအာင်ပြုလုပ်နိုင်သည်
    sorted      Data များအား အစီအစဉ်တကျြဖစ်ေအာင်စီစဉ်ပေးနိုင်သည်
    limit       Parameter အထိ Data များအား ကန် ့သတ်ေပးနိုင်သည်
    skip        Parameter မေရာက်ခင် Data များအား Skip လုပ်ေပးမည်ြဖစ်သည်
    map         အ ြခားေသာ Data ပံုစံတစ်မျိုးသို့ေြပာင်းလဲနိုင်သည်
    flatMap     Collection Stream များအား Element Stream အြဖစ်ေြပာင်းေပးသည်
    peek        Stream ထဲက Element ေတွကိုယူပြီး အသံုးပြုနိုင်ေသာ Intermediate Operation
     */

    public static void main(String[] args) {

        //Filter
        var array = new int[]{1,2,3,4,5,6,7,8,9,10};
        var stream = Arrays.stream(array);
        var stream2 = stream.filter(data -> data %2 ==0);

        stream2.forEach(System.out::println);

        //stream2 mr kaw tone lik loh stream mr data ma shi tot
        stream.forEach(System.out::println);


        //Limit
        Arrays.stream(array).limit(5).forEach(System.out::println);
              //Original stream


        //Skip
        Arrays.stream(array).skip(5).forEach(System.out::println);


        //Distinct          2ku pyit ny tk hrr ko remove lod
        var list = Arrays.asList(1,2,1,4,3,2,3,7,4,6,9,7,8);
        var reverse = new ArrayList<Integer>(list);
        Collections.sort(reverse);              //sort lod
        Collections.reverse(reverse);           //reverser lod

        var distinct = list.stream().distinct().toList();
        
        //sorted 2myo shi
        distinct = list.stream().distinct().sorted().toList();

        //Comparator sorted
        //Default sorted ko ma tone chin yin tone (kyi sin nge to nge sin kyi)
        //Sorted lod loh ma ya tk type twy mr Comparator ko tone (Obj)
        distinct = list.stream().distinct().sorted( (a , b) -> (b - a)).toList(); //(reverse)

        var l = List.of(new Data(3) , new Data(6) , new Data(1));
        l.stream().sorted( (a , b) -> a.value - b.value).toList();

    }
}


class Data{
    int value;
    Data(int value){
        this.value = value;
    }

    //toString ko override ma lod yin object build yin Data@23423 hwt
    public String toString(){
        return String.valueOf(value);
    }
}