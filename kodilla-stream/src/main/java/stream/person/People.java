package stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {
    public static List<String> getList() {//statyczną metodę getList(), która tworzy przykładową
        // listę imion i nazwisk osób, a następnie tę listę zwraca
        final List<String> theList = new ArrayList<>();//zwroc uwage na final!!
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe fry");
        theList.add("Martin Valenzuela");
        return new ArrayList<String>(theList);//zwracamy nie listę przechowywaną w zmiennej theList,
        // lecz tworzymy jej kopię (czyli tworzymy nową listę przy pomocy konstruktora kopiującego) — jest
        // to rozwiązanie zapobiegające mutowaniu obiektów. Nawet jeżeli "konsument" wyników działania metody
        // getList() zmieni coś w otrzymanej kolekcji, nie spowoduje to zmiany obiektów wewnątrz klasy People,
        // ponieważ operacja modyfikacji zostanie wykonana na kopii obiektu theList, a nie na samym obiekcie.
    }
}