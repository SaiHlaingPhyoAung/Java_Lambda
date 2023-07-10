package Streams.L11_Terminal_GetResult;

public class L13_Return_Optional_Values {

    /* Product.txt
    Optional ကို nullPointer exception ရှောင်ချင်လို့သုံး

    Optional<Product> findMaxPriceProduct (Product[] products, int lowerLimit){
       Product result = null;
        for(Product p : products){
            if(p.getPrice() >= lowerLimit){
                if(null == target || p.getPrice() > target.getPrice()){
                    result = p;
                }
               }
              }
             return Optional.ofNullable(result);
     */

    /*
    var array = Files.lines(Product.of("product.txt")).
    map (Product::new) .toArray(Product[]::new);

    var result = findMaxPriceProduct(array, 750)    750 ထက်ကြီးတဲ့ကောင်ကိုရှာ
    var result = findMaxPriceProduct(array, 850)    မရှိတာရှာရင် Optional.empty ထွက်

    *** USING OPTIONAL VALUES ***
    var max = findMaxPriceProduct(list.toArray(Product[] :: new) , 600)

    *ifPresent
    max.ifPresent(p -> System.out.println(p));

    *ifPresentOrElse    like ifElse
    max.ifPresentOrElse(System.out::println , () -> System.out.println("No Data");
                         ရှိရင်ဒီကောင်အလုပ်လုပ်             မရှိရင်ဒီကောင်အလုပ်လုပ်

     findMaxPriceProduct(list.toArray(Product[]::new_, 800).
     ifPresentOrElse(a -> System.out.println(a) , () -> System.out.println("No Data")
                        ရှိရင်ဒီကောင်အလုပ်လုပ်             မရှိရင်ဒီကောင်အလုပ်လုပ်
     */
}
