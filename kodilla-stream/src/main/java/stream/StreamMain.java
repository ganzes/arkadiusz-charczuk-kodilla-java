package com.kodilla.stream;

import stream.book.Book;
import stream.book.BookDirectory;
import stream.forumuser.Forum;
import stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;


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

/*UPDATE po wyczyszczeniu

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

        System.out.println("Proba 2");
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

        PoemDecorator poemDecorator6 = string -> string + poemBeautifier.add(poemDecorator2);
        String result6 = poemDecorator6.decorate("All Bundy");
        System.out.println(result6);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

  KONIEC UPDATE po wyczyszczeniu
 */
        //People.getList().stream()//wywołujemy metodę statyczną getList() klasy People,
        // w wyniku czego otrzymujemy kolekcję typu List<String> zawierającą imiona i nazwiska osób
        // Następnie wywołujemy metodę stream() tej kolekcji,
        // która inicjuje strumień. Na powołanym do życia strumieniu wywołujemy w linii nr 8 jedną
        // operację terminalną forEach(Consumer action), która na każdym obiekcie w kolekcji
        // wykonuje metodę println(String x) obiektu typu PrintStream zwracanego przez metodę statyczną out
        // klasy System (czyli mówiąc krótko wykonuje System.out.println() na każdym obiekcie kolekcji).
        //.map(s -> s.toUpperCase())
        //.map(String::toUpperCase)
        //.filter(s -> s.length() > 11)
        //.map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
        //.filter(s -> s.substring(0, 1).equals("M"))
        //.forEach(System.out::println);//kończy przepływ strumienia. Sama zwraca void, więc nie powstaje żadna
        // kolekcja wynikowa. Na ekranie konsoli natomiast pojawi się lista imion i nazwisk wyświetlonych z kolekcji
        // wejściowej
        // mozemy tez:
        //.map(String::toUpperCase)
        //.forEach(s -> System.out.println(s));
/*
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
        */

        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

//.sorted((e1, e2) -> e1.getDateOfBirth()
//                        .compareTo(e2.getDateOfBirth()))

        Forum theForum = new Forum ();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getForumUsersList().stream()//zainicjuje strumień Stream przy pomocy metody stream() kolekcji
                .filter(s -> s.getSex() != 'M')//odfiltruje tylko tych użytkowników, którzy są mężczyznami
                .filter(s -> s.getPostPublicated() >= 1)//odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post
                .filter(s->Period.between(s.getDateOfBirth(), LocalDate.now()).getYears()>=20)
                .collect(Collectors.toMap(ForumUser::getUserID, users -> users));//przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika

        //.map(ForumUser::toString)
        //.collect(Collectors.joining(",\n","<<",">>"));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())//wyświetli otrzymaną mapę wynikową
                .forEach(System.out::println);
    }
}