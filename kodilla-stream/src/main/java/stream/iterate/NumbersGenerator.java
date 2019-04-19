package stream.iterate;

import java.util.stream.Stream;

public final class NumbersGenerator {
    public static void generateEven(int max) {//tworzymy statyczną metodę generateEven(int max), której zadaniem
        // jest wygenerowanie kolejnych liczb parzystych.
        //Metoda otrzymuje jeden argument wejściowy max mówiący o tym ile liczb 'pozwalamy'
        // wygenerować naszemu strumieniowi Stream.
        Stream.iterate(1, n -> n + 1)//wywołujemy metodę statyczną iterate(Integer seed, UnaryOperator f) interfejsu Stream.
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}