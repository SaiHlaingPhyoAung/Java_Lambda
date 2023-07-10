import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class L1 {
    /* Lambda ( ) -> { }

    () သည် SAM ၏ method Argument အား ကိုယ်စားပြုပြီး၊ method signature အတိုင်း Parameter
    များအားေရးသားရပါမည် (Single abstract method)
    -> သည် Lambda ၏ အမှတ်အသားြဖစ်ပြီး၊ Lambda Expression ြဖင့်ေရးသားထားကြောင်းဖေါ်ပြေပး
    ပါသည်
    {} သည် method Body အားေရးသားကိုယ်စားပြုပြီး method body အတွင်းေရးသားလိုသည့်ကုဒ်များ
    ကိုထိုအထဲတွင်‌ေရးသား နိုင်ပါသည်
     */

    //normal method
    private void method(String name){
        System.out.println(name);
    }
    /* lambda
    (String name) -> {
        System.out.println(name);
    }

    //type ko ma ya lal ya
    (name) -> {
        System.out.println(name);
    }

    //argument 1ku hte so yin ( ) ko ma yay ll ya
    //argument 2ku mr pr yin ( ) pyoke p yay loh ma ya
    name -> {
        System.out.println(name);
    }

    //method body mr code 1kyg hte so yin { } ko pyoke loh ya
    name -> System.out.println(name);
            */

    //normal method
    private int method2 (int a , int b){
        return a + b;
    }
    /* lambda
    (int a , int b) -> {
        return a + b;
    }

    //type ko ma yay lal ya
    (a , b) -> {
        return a + b;
    }

    //method body mr return 1kyg hte so yin { } ko pyoke loh ya return ko pr pyoke loh ya
    (a , b) -> a + b;
    */

    public static void main(String[] args) {
        //normal
        L1_Interface call = new L1_Interface() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        call.calculate(20 , 5);

        //lambda
        call = (a , b) -> a * b;
        call.calculate(2, 4);


        var set = Set.of(1,5,8,2,3,9);
        set = new HashSet<>(set);
        //forEach
        set.forEach(arg -> System.out.println(arg));

        //removeIf
        set.removeIf(arg -> arg % 2 ==0);

        //map forEach
        var map = new HashMap<String , Integer>();
        map.put("one" , 1);
        map.put("two" , 2);
        map.put("three" , 3);

        map.forEach((key , value) -> System.out.printf("%s : %n" , key , value));

    }
}