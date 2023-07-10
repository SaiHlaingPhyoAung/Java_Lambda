public class L5_DDOD {
    public static void main(String[] args) {
        var v = new interfaceD(){};
        v.doJob();
    }
}

/*
    Parent 2ku mr Name tu tk Default method pr lr loh tone chin yin
    di tai so ma ya
    Override lod p yay mha ya
 */
interface interfaceA{
    default void doJob(){
        System.out.println("Doing A");
    }
}

interface interfaceB extends interfaceA{
    default void doJob(){
        System.out.println("Doing B");
    }
}

interface interfaceC extends interfaceA {
    default void doJob(){
        System.out.println("Doing C");
    }
}

interface interfaceD extends interfaceB , interfaceC{
    default void doJob(){
        interfaceB.super.doJob();
        interfaceC.super.doJob();
    }
}
