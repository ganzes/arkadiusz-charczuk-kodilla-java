package com.kodilla.testing.forum; //nazwa pakietu, w ktorej zawarte sa testy

import com.kodilla.testing.user.SimpleUser;//dolacz do testu kod klasy SimpleUser, bez tej linii kompilator jej nie znajdzie, bo znajduje sie w innym pakiecie
import org.junit.Assert;//import wymaganego pakietu z JUNIT
import org.junit.Test;//import wymaganego pakietu z JUNIT
public class ForumTestSuite {//TestSuite, nasz zbior testow
    @Test//bezpośrednio za nią znajduje się metoda, która jest przypadkiem testowym JUnit.
    public void testCaseUsername(){//zaczyna się kod przypadku testowego. ważne każdy przypadek testowy był metodą public void, a nazwa rozpoczynała się od test. Żadne inne metody nie będą rozpoznawane przez JUnit jako testy.
        //Given//doprowadzamy w tych liniach do sytuacji, w której dysponujemy obiektem simpleUser klasy SimpleUser, z zainicjowaną nazwą użytkownika.
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        //When
        String result = simpleUser.getUsername();//o, co naprawdę chcemy przetestować. Tutaj wywołujemy getter getUsername() i przypisujemy rezultat do zmiennej result, abyśmy mogli wykonać odpowiednie sprawdzenia w następnych liniach.
        //Then//zestaw warunków, które są sprawdzane w celu stwierdzenia, czy test wykonał się poprawnie.
        Assert.assertEquals("theForumUser", result);
    }
}