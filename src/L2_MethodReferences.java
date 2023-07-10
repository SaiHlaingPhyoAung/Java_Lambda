import java.util.Arrays;
import java.util.List;

public class L2_MethodReferences {

    //Static Method
    public static void sm(int i) {
        System.out.println(2 * i);
    }

    //Instance Method
    public void im(int i) {
        System.out.println(2 * i);
    }

    //Constructor
    L2_MethodReferences(int i){
        System.out.println(2 * 1);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Static Method
        list.forEach(L2_MethodReferences::sm);

        //Instance Method
       // L2_MethodReferences mr = new L2_MethodReferences();
       // list.forEach(mr::im);

        //Constructor
        list.forEach(L2_MethodReferences::new);

    }
}
