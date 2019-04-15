package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        /*
        //tworzymy obiekt klasy Processor, który będzie odpowiedzialny za uruchamianie przekazywanych do
        // metody execute(Executor executor) obiektów implementujących interfejs Executor. W linii nr 9
        // tworzony jest taki właśnie obiekt i następnie w linii nr 10
        // następuje wywołanie metody execute(Executor executor) klasy Processor,
        // której za pośrednictwem argumentu przekazujemy obiekt.
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);*/
/*
        // tworzony jest obiekt klasy Processor, który odpowiedzialny jest za
        // wykonywanie kodu, który zostanie przekazany jako parametr (kod musi implementować interfejs Executor)
        Processor processor = new Processor();
        //tworzone jest wyrażenie lambda i przypisywane do zmiennej codeToExecute
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        //wywoływana jest metoda execute klasy Processor, która jako argument otrzymuje wyrażenie lambda codeToExecute
        processor.execute(codeToExecute);*/

        //tworzymy obiekt klasy ExpressionExecutor
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        //czterokrotnie wywołujemy metodę executeExpression(double a, double b, MathExpression mathExpression) -
        // każdorazowo podajemy (poprzez wyrażenie lambda z parametrami) inny kod działania matematycznego do wykonania
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Proba 1");
        poemBeautifier.beautify("All Bundy".toLowerCase());
        poemBeautifier.beautify("All Bundy".toUpperCase());
        poemBeautifier.beautify("All Bundy".replace('A', 'X'));
        poemBeautifier.beautify("All Bundy".replace("All", "Peggy"));
        poemBeautifier.beautify("All Bundy".replaceFirst("All", "Mix"));
        poemBeautifier.beautify("All Bundy".replaceAll("All Bundy", "Mix"));


        PoemDecorator poemDecorator = string -> string + " Hello There";

        String result = poemDecorator.decorate("All Bundy");
        System.out.println(result);

        PoemDecorator poemDecorator2 = string -> string + poemBeautifier.beautify(" Hello There".toUpperCase());
        String result2 = poemDecorator2.decorate("All Bundy");
        System.out.println(result2);

        PoemDecorator poemDecorator3 = string -> string + poemBeautifier.beautify(" Hello There".toLowerCase());
        String result3 = poemDecorator3.decorate("All Bundy");
        System.out.println(result3);

        PoemDecorator poemDecorator4 = string -> string + poemBeautifier.beautify(" Hello There".replaceAll("Hello", "World"));
        String result4 = poemDecorator4.decorate("All Bundy");
        System.out.println(result4);


        PoemDecorator poemDecorator5 = string -> string + poemBeautifier.beautify(" Hello There".replaceFirst("Hello","Hi"));
        String result5 = poemDecorator5.decorate("All Bundy");
        System.out.println(result5);

        PoemDecorator poemDecorator6 = string -> string + poemBeautifier.add("Hello", poemDecorator2);
        String result6 = poemDecorator6.decorate("All Bundy");
        System.out.println(result6);
    }
}