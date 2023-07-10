import java.util.List;
import java.util.function.Consumer;

public class L8_ExceptionsInLambda {
    public static void main(String[] args) {
        var list = List.of(1,2,3,0,4,5,6,7);

        /*list.forEach(a -> {
            try {
                System.out.println(10 / a);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
         */

        list.forEach(wrapError(a -> System.out.println(10 /a)));

        list.forEach(WE(ArithmeticException.class , a -> System.out.println(10 /a)));
    }

    static <T>Consumer<T> wrapError(Consumer<T> action){
        return data -> {
            try {
                action.accept(data);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        };
    }

    static <T , E extends Throwable>Consumer<T> WE(Class<E> acceptableError , Consumer<T> action){
        return data -> {
            try {
                action.accept(data);
            } catch (Exception e){

                try {
                    E exception = acceptableError.cast(e);
                    System.out.println(exception.getCause());
                } catch (ClassCastException ce) {
                    throw e;
                }

            }
        };
    }
}
