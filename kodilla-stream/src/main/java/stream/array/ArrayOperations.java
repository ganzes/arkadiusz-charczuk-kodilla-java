package stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
//przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive)
// wyświetlić kolejne elementy tablicy, a następnie:
        IntStream.range(0,numbers.length)
                .map(x -> numbers[x])
                .forEach(System.out::println);
//- przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int endExclusive),
// a także kolektora average() obliczyć średnią. Na końcu metoda powinna zwracać średnią jako wynik typu double.
        return IntStream.range(0,numbers.length)
                .map(x -> numbers[x])
                .average()
                .getAsDouble();
    }


    static double getAverage2 (int[] numbers2) {

        IntStream.range(0, numbers2.length)
                .map(x -> numbers2[x])
                .forEach(System.out::println);

        return IntStream.range(0, numbers2.length)
                .map(x -> numbers2[x])
                .average().orElse ( 0 );
    }
}

