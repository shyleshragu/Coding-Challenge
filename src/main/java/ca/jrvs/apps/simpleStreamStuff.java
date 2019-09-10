package ca.jrvs.apps;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;



/**
 * This class contains some simple Stream and lambda commands.
 */
public class simpleStreamStuff {
    public static void printWithMsg(Object o) {
        System.out.println("Result is:" + o.toString());
    }

    @Test
    public void stream() {
        System.out.println("start\n1)");


        //1. Create a Stream<Integer> streamInt using Stream.of
        Stream<Integer> streamInt = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("\n\n2)");
        //2. Create a IntStream intStream from 1 to 10 inclusive (e.g. IntStream API )
        IntStream intStream = IntStream.rangeClosed(1, 10);

        //3. What's the diﬀerence between IntStream and Stream<Integer>

        System.out.println("\n\n4)");
        //4. Convert intStream into doubleStream and print square root of each item. (hint: mapToDouble > map > foreach)
        intStream.mapToDouble(Double::new).map(Math::sqrt).forEach(System.out::println);

        System.out.println("\n\n5)");
        //5. use IntStream and print all odd number between 1 to 10;
        IntStream.rangeClosed(1, 10).filter(i -> i % 2 != 0).forEach(System.out::println);

        System.out.println("\n\n6)");
        //6. use IntStream and print number of odd number from 1 -10 (e.g. output = 5)
        System.out.println(IntStream.rangeClosed(1, 10).filter(i -> i % 2 != 0).count());

        System.out.println("\n\n7)");
        //7. Convert printWithMsg mthod to a lambda pringWithMsgLambda and invoke it to print
        // Result is:123
        //  public static void printWithMsg(Object o) {
        //      System.out.println("Result is:" + o.toString());
        //  }
        Consumer<Object> printWithMsgLambda = (obj) -> System.out.println("Result is:" + obj.toString());
        printWithMsgLambda.accept(123);


        System.out.println("\n\n8)");
        //8. use IntStream and print all even number using printWithMsgLambda instead of println
        //   sample output:
        //   Result is:2
        //   Result is:4
        //   Result is:6
        //   Result is:8
        //   Result is:10
        IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).forEach(simpleStreamStuff::printWithMsg);


        System.out.println("\n\n9)");
        //9. Make a Stream<List<String>> and convert each string to uppercase and printWithMsgLambda
        //  Stream<List<String>> strListStream =  Stream.of(Arrays.asList("I", "am", "a", "Cat"),
        //  Arrays.asList("I", "am", "a", "dog"));
        // do something here and print
        // Result is:I
        // Result is:AM
        // Result is:A
        // Result is:CAT
        // Result is:I
        // Result is:AM
        // Result is:A
        // Result is:DOG
        Stream<List<String>> strListStream = Stream.of(Arrays.asList("I", "am", "a", "Cat"), Arrays.asList("I", "am", "a", "dog"));
        strListStream.flatMap(Collection::stream).map(String::toUpperCase).forEach(printWithMsgLambda);


        //      Lambda interview questions
        //      Use lambda to ﬁnd all even/odd number from 1 - 10
        //      Solve ﬁb number using stream
        //      What is functional interface and write a simple lambda


    }

}
