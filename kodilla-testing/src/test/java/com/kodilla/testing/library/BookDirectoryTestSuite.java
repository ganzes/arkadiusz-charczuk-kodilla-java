package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {//sprawdzi, czy lista książek spełniających
        // warunek wyszukiwania jest poprawnie zwracana
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);//tworzymy mocka interfejsu LibraryDatabase
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);//tworzymy obiekt klasy BookLibrary,
        // wstrzykując do niego poprzez konstruktor utworzonego wcześniej mocka
        List<Book> resultListOfBooks = new ArrayList<Book>();//tworzymy przykładową odpowiedź interfejsu
        // LibraryDatabase, którą będziemy zwracać z tego interfejsu
        // wewnątrz metody listBookWithCondition(String titleFragment) w klasie BookLibrary
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);//nstruujemy naszego mocka, jak ma się zachowywać
        // (co zwrócić), gdy wywołana zostanie jego metoda
        // listBookWithCondition(String titleFragment) z parametrem "Secret".

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");//wykonujemy właściwy test: wywołujemy metodę
        // listBookWithCondition(String titleFragment)
        // obiektu bookLibrary. Wewnątrz tej metody następuje wywołanie metody interfejsu LibraryDatabase o takiej samej nazwie,
        // jak nazwa metody klasy BookLibrary. Jeżeli spełnione
        // są warunki odnośnie liczby wyników oraz długości fragmentu tytułu,
        // lista zostanie zwrócona "na zewnątrz" i zostanie przypisana do zmiennej theListOfBooks.

        // Then
        assertEquals(4, theListOfBooks.size());//sprawdzamy, czy zwrócone zostały cztery tytuły książe
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {//posłuży do sprawdzenia, czy
        // metoda listBooksWithCondition(String titleFragment) zachowuje się poprawnie, gdy
        // liczba tytułów pasujących do wzorca jest większa niż 20.
        // W tej sytuacji zwracana powinna być pusta lista.

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);//tworzymy mock interfejsu LibraryDatabase oraz obiekt klasy BookLibrary,
        // wstrzykując do niego poprzez konstruktor utworzony mock.
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);//tutaj nastepuje wstrzykiwanie
        List<Book> resultListOf0Books = new ArrayList<Book>();//tworzymy trzy różne listy obiektów Book, które będą zwracane przez mock w zależności od tego,
        // z jakim parametrem zostanie wywołana jego metoda listBooksWithCondition(String titleFragment).
        // Wykorzystujemy tu utworzoną przed chwilą metodę generateListOfNBooks(int booksQuantity).
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        //instruujemy naszego mocka, którą listę obiektów Book ma zwrócić w zależności od tego,
        // z jakim parametrem zostanie wywołana jego metoda:
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);//mock ma zwrócić listę 15 książek w sytuacji, gdy jako parametr podany
        // zostanie dowolny tekst
        // — mówi o tym metoda anyString(), o której za chwilę powiemy nieco więcej,
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);//mock ma zwrócić pustą listę książek, gdy jako parametr
        // (wzorzec wyszukiwania) zostanie podany tekst "ZeroBooks",
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);//mock ma zwrócić listę 40 książek, gdy jako kryterium wyszukiwania
        // (parametr metody listBooksWithCondition(String titleFragment)) zostanie podany tekst "FortyBooks".

        // When
        //wykonujemy trzy testowe wywołania metody listBooksWithContidion(String titleFragment) na obiekcie bookLibrary
        // klasy BookLibrary. Wywołania te wykonujemy z różnymi parametrami — wzorcami wyszukiwania tytułów.
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then
        //sprawdzamy, czy metoda klasy BookLibrary zwróciła właściwe wartości,
        // w zależności od tego, z jakim parametrem została wywołana.
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {//sprawdzenie, czy zwracana
        // lista książek jest pusta, w sytuacji, gdy wyszukiwany fragment tytułu jest
        // krótszy niż trzy znaki.
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        //tworzymy mocka interfejsu LibraryDatabase, a następnie powołujemy do życia obiekt bookLibrary
        // klasy BookLibrary, wstrzykując do niego naszego mocka przy pomocy konstruktora.
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);//tutaj go wstrzykujemy
        List<Book> resultListOf10Books = generateListOfNBooks(10);//tworzymy listę dziesięciu książek, którą mock ma zwracać.

        //informujemy mocka, że utworzoną linię wcześniej listę dziesięciu książek ma zwrócić, gdy zostanie wywołana
        // jego metoda listBooksWithCondition(String titleFragment) z dowolnym parametrem
        // tesktowym, o czym mówi metoda anyString().

        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");//wywołujemy metodę
        // listBooksWithCondition(String titleFragment) obiektu bookLibrary, podając jej jako argument
        // wywołania ciąg znaków "An".

        // Then
        assertEquals(0, theListOfBooks10.size());// sprawdzamy, czy zwrócona lista jest pusta (ma być pusta,
        // gdy długość szukanego ciągu znaku jest mniejsza niż trzy znaki).
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        // dla pewności sprawdzamy jeszcze, czy metoda mocka wyciągająca dane z bazy danych
        // ()listBooksWithCondition(String titleFragment))
        // na pewno nie została ani razu wywołana (z dowolnym parametrem (anyString())
    }

    @Test

    public void testlistBooksInHandsOfZeroByUser() {//sprawdzi, gdy uzytkownik nie ma wypozyczonych zadnych ksiazek
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class); //tworzymy mocka interfejsu LibraryDatabase,
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);//tutaj go wstrzykujemy

        List<Book> borrowedBooksZeroByUser = generateListOfNBooks(0); //tutaj tworzymy liste wypozyczonych ksiazek, tu 0
        // When
        when(libraryDatabaseMock.listBooksInHandsOf(anyObject())).thenReturn(borrowedBooksZeroByUser);

        LibraryUser libraryUserAl = new LibraryUser("Al", "Bundy", "216320");//lista uzytkownika, w tym wypadku
        //uzytkownika


        List<Book> borrowedBooksZeroByUserAlBundy = bookLibrary.listBooksInHandsOf(libraryUserAl);

        // Then
        assertEquals(0, borrowedBooksZeroByUserAlBundy.size());

    }

    @Test
    public void testlistBooksInHandsOfOneByUser() {//sprawdzi, gdy uzytkownik nie ma wypozyczonych zadnych ksiazek
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class); //tworzymy mocka interfejsu LibraryDatabase,
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);//tutaj go wstrzykujemy

        List<Book> borrowedBooksOneByUser = generateListOfNBooks(1); //tutaj tworzymy liste wypozyczonych ksiazek, tu 1
        // When
        when(libraryDatabaseMock.listBooksInHandsOf(anyObject())).thenReturn(borrowedBooksOneByUser);

        LibraryUser libraryUserAl = new LibraryUser("Al", "Bundy", "216320");//lista uzytkownika, w tym wypadku
        //uzytkownika


        List<Book> borrowedBooksOneByUserAlBundy = bookLibrary.listBooksInHandsOf(libraryUserAl);

        // Then
        assertEquals(1, borrowedBooksOneByUserAlBundy.size());

    }

    @Test
    public void testlistBooksInHandsOfFiveByUser() {//sprawdzi, gdy uzytkownik nie ma wypozyczonych zadnych ksiazek
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class); //tworzymy mocka interfejsu LibraryDatabase,
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);//tutaj go wstrzykujemy

        List<Book> borrowedBooksFiveByUser = generateListOfNBooks(5); //tutaj tworzymy liste wypozyczonych ksiazek, tu 5
        // When
        when(libraryDatabaseMock.listBooksInHandsOf(anyObject())).thenReturn(borrowedBooksFiveByUser);

        LibraryUser libraryUserAl = new LibraryUser("Al", "Bundy", "216320");//lista uzytkownika, w tym wypadku
        //uzytkownika


        List<Book> borrowedBooksFiveByUserAlBundy = bookLibrary.listBooksInHandsOf(libraryUserAl);

        // Then
        assertEquals(5, borrowedBooksFiveByUserAlBundy.size());

    }
}