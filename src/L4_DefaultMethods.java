public class L4_DefaultMethods {
    public static void main(String[] args) {
        var v = new test(){};
        v.hello();
    }
}

interface test{
    //abstract method mr body ma pr
    //default method so body pr lal ya
    //default method mr protect / private access modifier ko lat ma kan
    //class ka tone chin yin object sout p mha tone loh ya

    default void hello(){
        System.out.println("This is default method");
    };
}

class testImpl implements test{
    public void greet(){
        System.out.println("this is child ");
        hello();
    }

}