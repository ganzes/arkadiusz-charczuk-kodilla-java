package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
    //Given
        //Creating the list of Librarys and assigning books to them
        Library library = new Library("Library 1");

        IntStream.iterate(1, n-> n+1)
                .limit(5)
                .forEach(n-> library.getBooks().add(new Book("Titles","Authors",LocalDate.now())));

        //shallow Copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException z){
            System.out.println(z);
        }

        //deep Copy
        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepCopyLibrary);

        Assert.assertEquals(5,library.getBooks().size());
        Assert.assertEquals(5,clonedLibrary.getBooks().size());
        Assert.assertEquals(5,deepCopyLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepCopyLibrary.getBooks(),library.getBooks());
    }
}
