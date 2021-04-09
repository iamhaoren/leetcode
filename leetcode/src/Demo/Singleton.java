package Demo;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author zhangyuhao-2362578972@qq.com
 * @since 2020/12/28
 */
public class Singleton{

    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(1,2,3,4,5,6);
        stream.filter(x->x>3).forEach(System.out::println);
    }

}
