public class L2_MethodReference {
    public static void main(String[] args) {
        //Method Reference > ::
        //lambda ka a tit pyan yay ya / Method Reference ka shi p tr ko Reference lod p tone loh ya
        // Owner :: Method Name

        //lambda
        inter i = name -> System.out.println(name);

        //method reference
        inter mr = System.out::println;

        //Instance Method
        Test test = new Test();
        inter instanceMethod = test::print;

        //Static Method
        inter staticMethod = staticDemo::demo;
        
        //Constructor
        DataProducer p = Data::new;
        var v = p.produce(100);
        System.out.println(v.i);
    }
}

interface inter{
    void method(String name);
}

class Test{
    public void print(String name){
        System.out.println(name);
    }
}

class staticDemo{
    public static void demo(String name){
        System.out.println(name);
    }
}

class Data{
    int i ;
    public Data(int i){
        this.i = i;
    }
}

interface DataProducer{
    Data produce(int i);
}
