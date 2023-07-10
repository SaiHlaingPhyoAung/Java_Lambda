public class L3_EffectiveFinal {
    //global variable
    static int values = 10;

    /*Final ma tat htr lal Anonymous inner class / Lambda hte ka
    access lod htr tk variable twy mr so Final ma tat htr lal Final pyit
    ak tr ko Effective Final loh kaw
     */
    
    //Final ma hte htr pay mk Final pyit ny tr ko Effective Final loh kaw

    public static void main(String[] args) {

        //local variable so final ma yay htr lal final pyit
        int value = 10;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("value is " + value);
            }
        };
        runnable.run();

        //global variable so final pyit poh ma lo
        Runnable run = () -> {
            System.out.println("values is " + values);
        };
        values = 11;
        run.run();
    }
}
