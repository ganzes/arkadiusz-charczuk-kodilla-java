package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }
    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("John Smith", result);
    }
}

/*
package com.kodilla.testing.forum; //nazwa pakietu, w ktorej zawarte sa testy

import com.kodilla.testing.user.SimpleUser;//dolacz do testu kod klasy SimpleUser, bez tej linii kompilator jej nie znajdzie, bo znajduje sie w innym pakiecie
import org.junit.Assert;//import wymaganego pakietu z JUNIT
import org.junit.Test;//import wymaganego pakietu z JUNIT

import org.junit.*;

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
*/